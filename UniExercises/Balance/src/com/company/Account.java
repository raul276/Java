package com.company;

/**
 * Created by Bari on 28.10.2016 г..
 */
public class Account {
    private String name;
    private double amount;

    public Account(String name, double amount) {
        this.setName(name);
        this.setAmount(amount);
    }

    public void draw(double money) throws NegativeBalanceExeption {
        double moneyLeftAfterDrawing = this.amount - money;

        if (moneyLeftAfterDrawing < 0) {
            throw new NegativeBalanceExeption("Not enough money. You have only " + this.amount);
        }

        this.setAmount(this.amount);
    }

    public void insert(double money) {
        this.amount += money;
    }

    private void setName(String name) {
        this.name = name;
    }


    private void setAmount(double amount) {
        if (amount >= 0) {
            this.amount = amount;
        }

    }
}

