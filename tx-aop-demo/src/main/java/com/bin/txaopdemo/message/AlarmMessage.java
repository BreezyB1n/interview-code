package com.bin.txaopdemo.message;

import com.bin.txaopdemo.common.enums.MessageType;
import org.springframework.stereotype.Component;

/**
 * @author zhangbin
 */
@Component
public class AlarmMessage extends AbstractMessage{
    @Override
    public String getCode() {
        return MessageType.ALARMMESSAGE.getCode();
    }

    @Override
    public String getMessage() {
        return MessageType.ALARMMESSAGE.getMessage();
    }

    @Override
    public void printMessage() {
        System.out.println("AlarmMessage");
    }
}
