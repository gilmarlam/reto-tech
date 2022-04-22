package pe.intercorp.retotech.exceptions;
 
public class BaseException extends Exception {
	private static final long serialVersionUID = -1504973846338622692L;
	private String errorCode;
	private String errorMessage;

	 
    public BaseException(String errorCode) {
        this.errorCode = errorCode;
    }
     
    
    public BaseException(String errorCode,String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public BaseException() {
        super();
    }


    public String getErrorCode() {
        return errorCode;
    }

    public String getMessage() {
        return errorMessage;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
}
