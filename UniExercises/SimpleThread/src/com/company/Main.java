package com.company;

public class Main {


    public static void main(String[] args) {
        int[] firstArray = {2,1,4,6,5,14,16,84,16,89,91};
        int[] secondArray = {3,15,19,26,46,75,18,37,34,51};
        Threads p1 = new Threads(firstArray);
        Threads p2 = new Threads(secondArray);
        p1.start();
        p2.start();
        System.out.println("Done");
    }
}


