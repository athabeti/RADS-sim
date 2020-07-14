package com.vad.RemoteDirectorySimulator.Exception;

import java.util.Date;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class FetchApiExceptionHandler {

    @ExceptionHandler(value = { Exception.class, NullPointerException.class, FetApiRequestBodyException.class })
    public ResponseEntity<Object> handleAnyException(Exception ex, WebRequest req) {

        customExceptionMessage cem = new customExceptionMessage(new Date(), ex.getLocalizedMessage(),
                req.getDescription(false));

        return new ResponseEntity<Object>(cem, new HttpHeaders(), HttpStatus.BAD_REQUEST);

    }

    @ExceptionHandler(value = { FetchAiasResponseException.class })
    public ResponseEntity<Object> handleResponseException(Exception ex, WebRequest req) {

        customExceptionMessage cem = new customExceptionMessage(new Date(), ex.getLocalizedMessage(),
                req.getDescription(false));

        return new ResponseEntity<Object>(cem, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);

    }

    @ExceptionHandler(value = { FetchAliasNoDataException.class })
    public ResponseEntity<Object> handleNoData(FetchAliasNoDataException ex, WebRequest req) {

        customExceptionMessage cem = new customExceptionMessage(new Date(), ex.getLocalizedMessage(),
                req.getDescription(false));

        return new ResponseEntity<Object>(cem, new HttpHeaders(), HttpStatus.NO_CONTENT);

    }

}
