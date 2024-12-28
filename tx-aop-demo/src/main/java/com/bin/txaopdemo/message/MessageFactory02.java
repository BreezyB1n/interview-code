package com.bin.txaopdemo.message;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;


public class MessageFactory02 {
    private static Map<String, AbstractMessage> factory = new HashMap<>();

    static {
        factory.put("100", new AlarmMessage());
        factory.put("200", new SystemMessage());
    }

    public static AbstractMessage chooseMessage(String code) {
        return factory.get(code);
    }
}
