package com.example.jms;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Reciver {

    /*@JmsListener(destination = "order-queue", containerFactory = "myFactory")
        public void reciveMessage(String message) {
            System.out.println("Message: " + message);
        }*/

    @JmsListener(destination = "order-queue")
    public void reciveMessage(String message) {
        System.out.println("Message: " + message);
    }
}
