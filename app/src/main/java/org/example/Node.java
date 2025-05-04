package org.example;

public class Node<T> {
    private T value;
    private Node<T> left;
    private Node<T> right;

    public Node(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public Node<T> left() {
        return left;
    }

    public Node<T> right() {
        return right;
    }

    public void set_left(Node<T> node) {
        this.left = node;
    }

    public void set_right(Node<T> node) {
        this.right = node;
    }
}
