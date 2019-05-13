package com.qhit.test;

import javax.xml.crypto.Data;

/**
 * Created by HP on 2019/4/28.
 */
public class Node {
    private  Object deta;
    private Node next;

    public Node() {

    }

    public Node(Object deta) {
        this.deta = deta;

    }

    public Object getDeta() {
        return deta;
    }

    public void setDeta(Object deta) {
        this.deta = deta;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}


