package pe.intercorp.retotech.exceptions;

 
public class ServiceException extends BaseException{
   

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ServiceException(String errorCode,String errorMessage) {
        super(errorCode, errorMessage);
    }

    public ServiceException(String errorCode) {
    	super(errorCode);
    }

    public ServiceException() {
        super();
    }

   
}
