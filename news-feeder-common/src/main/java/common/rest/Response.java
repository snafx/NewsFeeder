package common.rest;

import java.util.List;

public class Response<T> {

    public String message;
    public ResponseType responseType;
    public T entity;
    public List<T> data;

    public Response() {
    }

    public Response(ResponseType responseType, String message) {
        super();
        this.responseType = responseType;
        this.message = message;
    }
}