package org.restws.exception;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import org.restws.model.ErrorMessage;
import javax.ws.rs.core.MediaType;

public class NotFound extends WebApplicationException {
    public NotFound(String message) {
        super(Response.status(Response.Status.NOT_FOUND)
                .entity(new ErrorMessage(message, 404))
                .type(MediaType.APPLICATION_JSON).build());
    }
}