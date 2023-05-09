package com.springexample2.context;

import com.springexample2.context.producer.MessageProducer;

public class MessagePrinter {

    MessageProducer messageProducer;

    public MessagePrinter(MessageProducer messageProducer) {
        this.messageProducer = messageProducer;
    }

    public void printMessage(){
        String message = messageProducer.getMessage();
        System.out.println(message);
    }
}
