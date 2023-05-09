package com.springexample1;

public class ProducerMessage {

    PrinterMessage printerMessage = new PrinterMessage();
//
//    public ProducerMessage(PrinterMessage printerMessage) {
//        this.printerMessage = printerMessage;
//    }

    void produceMessage(){
        String message = printerMessage.printMessage();
        System.out.println(message);
    }


}
