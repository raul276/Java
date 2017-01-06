package com.company;


public class Main {

    public static void main(String[] args) {
        // BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String name = "Pesho";
            double amount = 20;
            Account account = new Account(name, amount);
            account.insert(50.74);
            account.draw(1000.0);
            System.out.println();
        } catch (NegativeBalanceExeption ex) {
            System.out.println(ex.getMessage());
        }

    }

}
