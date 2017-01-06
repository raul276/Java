package com.company;

/**
 * Created by Bari on 16.12.2016 г..
 */
public class Threads extends Thread{
    //всички честни числа от давта масива
    private int[] array;

    public Threads(int[] array){
        this.array = array;
    }

    void print(int[] array) {
        for (int i =0; i<array.length;i++ ){
            if(array[i] %2 ==0){
                System.out.println(array[i]);
            }
        }
    }

    public void run() {
        this.print(array);
    }

}
