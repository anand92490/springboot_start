package com.example.polymorphism;

public class PaymentOptions {

    public void paymentOptions(String netBanking){
        System.out.println("netBanking");
    }

    public void paymentOptions(String netBanking, String card){
        System.out.println("netBanking" + "CardName");
    }
}
