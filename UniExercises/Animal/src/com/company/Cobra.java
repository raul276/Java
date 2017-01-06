package com.company;

/**
 * Created by Bari on 21.10.2016 г..
 */
public class Cobra extends Snake {
    public void releasePoison(){
        System.out.println("ReleasePoison");
    }

    @Override
    public void hunt() {
        super.crawl();
        super.bite();
        this.releasePoison();
    }

    @Override
    public void eat() {
        hunt();
        System.out.println("Waiting");
        System.out.println("Eating");


    }
}
