package common.action;

import common.exception.ExceptionService;
import common.exception.ServerException;
import common.rest.Response;
import common.rest.ResponseType;

public abstract class BaseAction<T extends Object> {

    protected Response<T> response;
    protected T entity;

    public abstract Response<T> execute() throws ServerException;

    protected void createResponse(String message) {
        createResponse();
        response.message = message;
    }

    protected void createResponse() {
        response = new Response<>();
        response.responseType = ResponseType.SUCCESS;
    }

    protected void throwServerError() throws ServerException {
        ExceptionService.throwServerError();
    }

    protected void throwServerError(String message) throws ServerException {
        ExceptionService.throwServerError(message);
    }
}
