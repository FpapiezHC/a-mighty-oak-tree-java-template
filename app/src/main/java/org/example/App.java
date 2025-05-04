package org.example;

public class App {
    public static void main(String[] args) {
        Squirrel cheeks = new Squirrel("Cheeks");
        Node<Squirrel> nodeOne = new Node<>(cheeks);

        Squirrel squeaks = new Squirrel("Squeaks");
        Node<Squirrel> nodeTwo = new Node<>(squeaks);

        Squirrel fluffybutt = new Squirrel("Mr. Fluffy Butt");
        Node<Squirrel> nodeThree = new Node<>(fluffybutt);

        nodeOne.set_left(nodeTwo);
        nodeOne.set_right(nodeThree);

        System.out.println("Root: " + nodeOne.getValue().getName());
        System.out.println("Left child: " + nodeOne.left().getValue().getName());
        System.out.println("Right child: " + nodeOne.right().getValue().getName());
    }
}
