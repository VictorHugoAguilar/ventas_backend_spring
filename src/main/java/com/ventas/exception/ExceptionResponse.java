package com.ventas.exception;

import java.util.Date;
import java.util.Map;

public class ExceptionResponse {

    private Date timestamp;
    private String message;
    private String description;
    private Map<String, String> erroresValidacion;

    public ExceptionResponse() {
    }

    public ExceptionResponse(Date timestamp, String message, String description) {
        this.timestamp = timestamp;
        this.message = message;
        this.description = description;
    }

    public ExceptionResponse(Date timestamp, String message, String description, Map<String, String> erroresValidacion) {
        this.timestamp = timestamp;
        this.message = message;
        this.description = description;
        this.erroresValidacion = erroresValidacion;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public Map<String, String> getErroresValidacion() {
        return erroresValidacion;
    }

    public void setErroresValidacion(Map<String, String> erroresValidacion) {
        this.erroresValidacion = erroresValidacion;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
