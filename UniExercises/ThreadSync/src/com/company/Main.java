package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Processor p = new Processor();
        Thread first = new Thread(p);
        Thread second = new Thread(p);
        first.start();
        second.start();
        first.join();
        second.join();
        System.out.println("List size: "+ p.listCount());
        System.out.println("Done");
    }

}
