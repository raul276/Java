package com.company;

/**
 * Created by Bari on 28.11.2016 г..
 */
public class Node implements Comparable<Node> {
    private String str;
    private Node next;

    public Node(String str) {
        this.str = str;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public String getStr() {
        return str;
    }

    @Override
    public String toString() {
        return this.str;
    }


    @Override
    public int compareTo(Node node) {
        return this.str.compareTo(node.str);
    }


}
