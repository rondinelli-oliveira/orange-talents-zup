package com.zup.vehiclerotation.api.exception;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ExceptionHandler extends ResponseEntityExceptionHandler {
   
    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
        HttpHeaders headers, HttpStatus status, WebRequest request) {

            List<ExceptionError.Field> fields = new ArrayList<>();

            for(ObjectError error : ex.getBindingResult().getAllErrors()) {
                String name = ((FieldError) error).getField();
                String msg = error.getDefaultMessage();

                fields.add(new ExceptionError.Field(name, msg));
            }

            ExceptionError exError = new ExceptionError();

            exError.setStatus(status.value());
            exError.setDataTime(LocalDateTime.now());
            exError.setMessage("Ocorreu um erro, verifique se os campos foram preenchidos corretamente!");
            exError.setFields(fields);

        return handleExceptionInternal(ex, exError, headers, status, request);
    }
}
