package com.internet.medicaltreatment.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.javaws.jnl.IconDesc;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RespBean {
    
    private Integer code;
    private String message;
    private Object data;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date time;
    private Long timestamp;

    public RespBean(String message,Object data){
        this.code = 200;
        this.message = message;
        this.data = data;
        this.time = new Date();
        this.timestamp = System.currentTimeMillis();
    }

    public RespBean(String message){
        this.code = 400;
        this.message = message;
        this.data = null;
        this.time = new Date();
        this.timestamp = System.currentTimeMillis();
    }
}
