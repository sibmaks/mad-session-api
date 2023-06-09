package com.github.sibmaks.session.api;

import com.github.sibmaks.error_service.exception.ServiceError;
import lombok.AllArgsConstructor;

/**
 * @author sibmaks
 * @since 2023-04-12
 */
@AllArgsConstructor
public enum SessionErrors implements ServiceError {
    NOT_EXISTS,
    READONLY,
    ALREADY_EXISTS;


    @Override
    public String getErrorCode() {
        return name();
    }

    @Override
    public String getSystemCode() {
        return "SESSION";
    }
}
