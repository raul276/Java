package com.company;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by Bari on 28.11.2016 г..
 */

public class Queue implements Iterable<Node> {

    private Node first;
    private Node last;


    private int size;

    public Queue() {
        this.first = null;
this.last = null;
        size = 0;
    }

    public void offer(String string) {

        Node oldlast = this.last;
        this.last = new Node(string);
        this.last.setNext(oldlast);
        this.last.setNext(null);
        if (isEmpty()){
            this.first = this.last;
        }
        else{
            oldlast.setNext(this.last);
        }
        this.size++;
    }

   public String poll() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        String item = first.getStr();
        if (this.last == this.first) {
            this.last = null;
        }
        this.first = this.first.getNext();
        return item;
    }

    public int getSize(){
        return this.size;
    }

    private boolean isEmpty() {
        if (this.first == null) {
            return true;
        }

        return false;
    }


    @Override
    public Iterator<Node> iterator() {
        return new QueueIterator(this.first);
    }

    public class QueueIterator implements Iterator<Node> {

        private Node current;

        private QueueIterator(Node first) {
            this.current = first;
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Node next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Node result = current;
            current = current.getNext();
            return result;
        }
    }
}
