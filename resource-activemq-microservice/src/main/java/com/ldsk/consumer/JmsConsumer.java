package com.ldsk.consumer;

import com.ldsk.config.JmsConfig;
import lombok.extern.log4j.Log4j2;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class JmsConsumer {

    @JmsListener(destination = JmsConfig.QUEUE_NAME)
    public void receiveMessage(String message) {

        log.info("Message received: ".concat(message));
    }

}
