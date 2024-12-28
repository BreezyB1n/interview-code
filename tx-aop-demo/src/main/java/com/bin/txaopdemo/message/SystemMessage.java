package com.bin.txaopdemo.message;

import com.bin.txaopdemo.common.enums.MessageType;
import org.springframework.stereotype.Component;

@Component
public class SystemMessage extends AbstractMessage{
    @Override
    public String getCode() {
        return MessageType.SYSTEMMESSAGE.getCode();
    }

    @Override
    public String getMessage() {
        return MessageType.SYSTEMMESSAGE.getMessage();
    }

    @Override
    public void printMessage() {
        System.out.println("system message");
    }
}
