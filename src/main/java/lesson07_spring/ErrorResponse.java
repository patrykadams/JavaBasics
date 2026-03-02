package lesson07_spring;

import java.time.LocalDateTime;

/**
 * Standard error structure for all API failures.
 */
public record ErrorResponse(
    LocalDateTime timestamp,
    int status,
    String error,
    String message,
    String path
) {}