package dev.ngdangkiet.exception;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

/**
 * @author ngdangkiet
 * @since 11/11/2023
 */

@Getter
@Setter
@Builder(setterPrefix = "set", builderClassName = "newBuilder")
public class ApiError {

    private String path;
    private int statusCode;
    private String message;
    private Map<String, Object> errors;
}