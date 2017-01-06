package com.company;

/**
 * Created by Bari on 21.10.2016 г..
 */
public class Anaconda extends Snake {
    public void enroll(){
        System.out.println("The snake enrolls");
    }

    @Override
    public void hunt() {
        super.crawl();
        super.bite();
        this.enroll();

    }

    @Override
    public void eat() {
        hunt();
        System.out.println("Eating");
    }
}
