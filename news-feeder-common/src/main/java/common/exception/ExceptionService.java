package common.exception;

import javax.ws.rs.core.Response.Status;

public class ExceptionService {

    public static void throwServerError() throws ServerException {
        throw new ServerException(Status.INTERNAL_SERVER_ERROR, "Oops! Server Error. Something went wrong on our side.");
    }

    public static void throwServerError(String message) throws ServerException {
        throw new ServerException(Status.INTERNAL_SERVER_ERROR, message);
    }
}
