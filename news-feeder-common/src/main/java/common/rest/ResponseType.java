package common.rest;

public enum ResponseType {

    SUCCESS("Response OK"),
    ERROR("There was an error while retrieving data"),
    APIKEYEXHAUSTED("Your API key has no more requests available"),
    APIKEYDISABLED("Your API key has been disabled");

    private String message;

    ResponseType(String message) {
        setMessage(message);
    }

    public String getMessage() {
        return message;
    }

    private void setMessage(String message) {
        this.message = message;
    }
}
