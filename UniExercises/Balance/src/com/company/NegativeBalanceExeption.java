package com.company;

public class NegativeBalanceExeption extends Exception{
    public NegativeBalanceExeption(String message) {
        super(message);
    }
}
