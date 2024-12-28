package com.bin.txaopdemo.message;

import com.bin.txaopdemo.common.enums.MessageType;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
public abstract class AbstractMessage {

    public abstract String getCode();

    public abstract String getMessage();

    public abstract void printMessage();
}
