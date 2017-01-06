package com.company;

/**
 * Created by Bari on 21.10.2016 г..
 */
public abstract class Snake {
    public void crawl(){
        System.out.println("Snake is crawling");
    }
    public void bite(){
        System.out.println("Snake is biting");
    }

    public abstract void hunt();

    public abstract void eat();
}
