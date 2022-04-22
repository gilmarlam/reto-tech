package pe.intercorp.retotech.rest;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;

import pe.intercorp.retotech.exceptions.ServiceException;
import pe.intercorp.retotech.rest.response.ResponseWrapper;
 

public class BaseController {
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public ResponseWrapper<String> methodArgumentNotValidException(HttpServletRequest request,
			MethodArgumentNotValidException e) {
		// get spring errors
		BindingResult result = e.getBindingResult();

		List<FieldError> fieldErrors = result.getFieldErrors();

		// convert errors to standard string
		StringBuilder errorMessage = new StringBuilder();

		fieldErrors
				.forEach(f -> errorMessage.append(f.getField().concat(" ").concat(f.getDefaultMessage()).concat(", ")));

		// return error info object with standard json
		ResponseWrapper<String> responseWrapper = new ResponseWrapper<String>();

		responseWrapper.setErrorCode(String.valueOf(HttpStatus.BAD_REQUEST.value()));
		responseWrapper.setErrorMessage(errorMessage.toString().trim());

		return responseWrapper;
	}
	
	@ExceptionHandler(ServiceException.class)
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	public ResponseWrapper<String> serviceInternalException(ServiceException serviceException, WebRequest request) {
		ResponseWrapper<String> responseWrapper = new ResponseWrapper<String>();

		responseWrapper.setErrorCode(serviceException.getErrorCode());
		responseWrapper.setErrorMessage(serviceException.getMessage());

		return responseWrapper;
	}

}
