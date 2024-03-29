package com.sparta.homework04.exception;

import com.sparta.homework04.dto.ResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class RestApiExceptionHandler {
    @ExceptionHandler(value = { Exception.class })
    public ResponseDto<?> handleApiRequestException(Exception ex ) {
        return ResponseDto.fail( HttpStatus.BAD_REQUEST.toString() , ex.getMessage() );
    }

}