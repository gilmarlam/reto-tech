package pe.intercorp.retotech.rest.response;

import java.io.Serializable;

public class ResponseWrapper<T> implements Serializable{

    private String errorCode;
    private String errorMessage; 

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

     
}
