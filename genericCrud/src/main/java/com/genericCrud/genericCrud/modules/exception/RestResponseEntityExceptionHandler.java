package com.genericCrud.genericCrud.modules.exception;



import com.genericCrud.genericCrud.modules.exception.entity.ErrorMessage;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.ArrayList;
import java.util.List;

@ControllerAdvice
@ResponseStatus
@SuppressWarnings({"unchecked","rawtypes"})
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {


    @Override
    protected ResponseEntity<Object> handleHttpMessageNotReadable(HttpMessageNotReadableException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        List<String> details = new ArrayList<>();
        ErrorMessage message = new ErrorMessage(HttpStatus.BAD_REQUEST,
                ex.getMessage(),details);
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body(message);
    }

    /**Exception Handing for Not Found Exception*/
    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<ErrorMessage> notFoundException(NotFoundException exception,
                                                          WebRequest request) {
        List<String> details = new ArrayList<>();
        ErrorMessage message = new ErrorMessage(HttpStatus.NOT_FOUND,
                exception.getMessage(),details);
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(message);
    }

    /**Exception Handing for CustomException*/
    @ExceptionHandler(CustomException.class)
    public ResponseEntity<ErrorMessage> customException(CustomException exception,
                                                        WebRequest request) {
        List<String> details = new ArrayList<>();
        details.add(exception.getLocalizedMessage());
        ErrorMessage message = new ErrorMessage(HttpStatus.BAD_REQUEST,
                exception.getMessage(),details);
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body(message);
    }

    //success exception
    @ExceptionHandler(SuccessMessageException.class)
    public ResponseEntity<ErrorMessage> successException(SuccessMessageException exception,
                                                        WebRequest request) {
        List<String> details = new ArrayList<>();
        details.add(exception.getLocalizedMessage());
        ErrorMessage message = new ErrorMessage(HttpStatus.OK,
                exception.getMessage(),details);
        return ResponseEntity.status(HttpStatus.OK)
                .body(message);
    }

    /**Resource Not Found Exception*/
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ErrorMessage> resourceNotFoundException(ResourceNotFoundException exception,WebRequest request) {
        List<String> details = new ArrayList<>();
        ErrorMessage message = new ErrorMessage(HttpStatus.NOT_FOUND,
                exception.getMessage(),details);
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(message);
    }

    //Access Denied Exception
    @ExceptionHandler(AccessDeniedException.class)
    public ResponseEntity<ErrorMessage> accessDeniedException(AccessDeniedException exception,WebRequest request) {
        List<String> details = new ArrayList<>();
        ErrorMessage message = new ErrorMessage(HttpStatus.FORBIDDEN,
                exception.getMessage(),details);
        return ResponseEntity.status(HttpStatus.FORBIDDEN)
                .body(message);
    }

    /*@ExceptionHandler(Exception.class)
    public final ResponseEntity<Object> handleAllExceptions(Exception ex, WebRequest request) {
        List<String> details = new ArrayList<>();
        details.add(ex.getLocalizedMessage());

        ErrorMessage message = new ErrorMessage(HttpStatus.INTERNAL_SERVER_ERROR,
                "Server Error",details);

        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(message);
    }*/
    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        List<String> details = new ArrayList<>();
        for(ObjectError error : ex.getBindingResult().getAllErrors()) {
            details.add(error.getDefaultMessage());
        }
        ErrorMessage message = new ErrorMessage(HttpStatus.BAD_REQUEST,
                "Validation Failed",details);

        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body(message);
    }

    /** Already exists exception
     *
     * */
    @ExceptionHandler(AlreadyExistsException.class)
    public ResponseEntity<ErrorMessage> alreadyExistsException(AlreadyExistsException exception, WebRequest request) {
        List<String> details = new ArrayList<>();
        ErrorMessage message = new ErrorMessage(HttpStatus.FOUND,
                exception.getMessage(),details);

        return ResponseEntity.status(HttpStatus.FOUND)
                .body(message);
        //ok

    }
    @ExceptionHandler(InvalidCredentialsException.class)
    public ResponseEntity<ErrorMessage> invalidCredentialsException(InvalidCredentialsException exception,
                                                                    WebRequest request) {
        List<String> details = new ArrayList<>();
        ErrorMessage message = new ErrorMessage(HttpStatus.BAD_REQUEST,
                exception.getMessage(),details);

        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body(message);

    }


}
