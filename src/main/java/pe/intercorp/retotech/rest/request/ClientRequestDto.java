package pe.intercorp.retotech.rest.request;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import pe.intercorp.retotech.constants.ErrorConstant;
import pe.intercorp.retotech.constants.RegExpConstant; 

@Data
public class ClientRequestDto {
	@NotNull(message = ErrorConstant.MANDATORY_FIELD)
    @Pattern(regexp = RegExpConstant.TEXTO_REGEXP, message = ErrorConstant.INVALID_MESSAGE)
	@ApiModelProperty(value = "Nombre del cliente", required = true, example = "Gilmar")
	private String firstName; 
	
	@NotNull(message = ErrorConstant.MANDATORY_FIELD)
    @Pattern(regexp = RegExpConstant.TEXTO_REGEXP, message = ErrorConstant.INVALID_MESSAGE)
	@ApiModelProperty(value = "Apellido del cliente", required = true, example= "Lam")
	private String lastName;  
	
	@NotNull(message = ErrorConstant.MANDATORY_FIELD)
	@ApiModelProperty(value = "Edad del cliente", required = true, example= "28")
	private int age;  
	
	@NotNull(message = ErrorConstant.MANDATORY_FIELD)
	@ApiModelProperty(value = "Fecha de nacimiento del cliente", required = true, example= "19/07/1993")
	@Pattern(regexp = RegExpConstant.DATE_REGEXP, message = ErrorConstant.INVALID_MESSAGE)
	private Date  dateOfBirth; 
}
