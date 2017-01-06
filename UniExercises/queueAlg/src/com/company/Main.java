package com.company;

public class Main {

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.offer("Gosho");
        queue.offer("Misho");
        queue.offer("Stamat");
        queue.poll();
        for (Node item: queue ) {
            System.out.println(item);
        }

    }
}
