package com.bin.txaopdemo;

import com.bin.txaopdemo.message.AbstractMessage;
import com.bin.txaopdemo.message.MessageFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TxAopDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(TxAopDemoApplication.class, args);
        AbstractMessage message = MessageFactory.chooseMessage("100");
        message.printMessage();
    }

}
