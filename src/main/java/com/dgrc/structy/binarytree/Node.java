package com.dgrc.structy.binarytree;

public class Node<T> {

    T val;
    Node<T> left;
    Node<T> right;

    Node(T val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }

    @Override
    public String toString() {
        // return "Node [val=" + val + ", left=" + left + ", right=" + right + "]";
        return val.toString();
    }
    
}
