package com.bin.txaopdemo;

import com.bin.txaopdemo.message.AbstractMessage;
import com.bin.txaopdemo.message.AlarmMessage;
import com.bin.txaopdemo.message.MessageFactory;
import com.bin.txaopdemo.message.MessageFactory02;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;

@SpringBootTest
@ComponentScan(basePackages = "com.bin.txaopdemo")
class TxAopDemoApplicationTests {

    @Test
    public void test() {
        AlarmMessage message = (AlarmMessage) MessageFactory02.chooseMessage("100");
        message.printMessage();
    }
}
