package com.springexample1;

public class Main {


    public static void main(String[] args) {

   //     PrinterMessage printerMessage = new PrinterMessage();
        ProducerMessage producerMessage = new ProducerMessage();
        producerMessage.produceMessage();
        ProducerMessage producerMessage1 = new ProducerMessage();
        ProducerMessage producerMessage2 = new ProducerMessage();
        ProducerMessage producerMessage3 = new ProducerMessage();
        producerMessage1.produceMessage();
        producerMessage2.produceMessage();


    }
}
