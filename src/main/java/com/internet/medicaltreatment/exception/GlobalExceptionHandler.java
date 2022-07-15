package com.internet.medicaltreatment.exception;

import com.fasterxml.jackson.core.JsonParseException;
import com.internet.medicaltreatment.vo.RespBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

/**
 * 全局异常处理器
 */
@RestController
@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
    
    @ExceptionHandler(RuntimeException.class)
    public RespBean exceptionHandler(Exception e) {
        
        if (e instanceof GlobalException) {
            GlobalException ex = (GlobalException) e;
            log.warn("错误信息：{}", ex.getMessage());
            return new RespBean(ex.getMessage());
        } else if (e instanceof JsonParseException) {
            return new RespBean("json转化错误");
        }
        log.warn("异常：[{}]", e.getMessage());
        return new RespBean(e.getMessage());
    }
}
