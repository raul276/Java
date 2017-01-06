package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Bari on 6.1.2017 г..
 */
public class Processor implements  Runnable {
    static List<Integer> list= new ArrayList<>();
    Random rand = new Random();

    public void print() {
        for (int i =0; i<10000;i++){
            list.add(rand.nextInt());
        }
    }
    @Override
    public void run() {
        synchronized (this){
        this.print();
    }
    }
    public int listCount(){
       return list.size();
    }
}
