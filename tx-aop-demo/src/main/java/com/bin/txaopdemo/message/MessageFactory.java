package com.bin.txaopdemo.message;


import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class MessageFactory implements InitializingBean {

    @Autowired
    private ApplicationContext applicationContext;

    private static final Map<String, AbstractMessage> messageMap = new HashMap<>();

    @Override
    public void afterPropertiesSet() throws Exception {
        Map<String, AbstractMessage> messageBeans = applicationContext.getBeansOfType(AbstractMessage.class);
        messageBeans.forEach((k, v) -> {
            messageMap.put(v.getCode(), v);
        });
    }

    public static AbstractMessage chooseMessage(String code) {
        return messageMap.get(code);
    }
}
