package com.internet.medicaltreatment.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 全局异常
 */
@AllArgsConstructor
public class GlobalException extends RuntimeException{
    private String message;

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
