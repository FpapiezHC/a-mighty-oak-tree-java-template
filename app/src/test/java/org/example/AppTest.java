package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void nodeStoresSquirrelCorrectly() {
        Squirrel cheeks = new Squirrel("Cheeks");
        Node root = new Node(cheeks);
        assertEquals("Cheeks", root.getSquirrel().getName());
    }

    @Test
    void nodeSetsLeftAndRightChildren() {
        Squirrel rootS = new Squirrel("Rooty");
        Squirrel leftS = new Squirrel("Lefty");
        Squirrel rightS = new Squirrel("Righty");

        Node root = new Node(rootS);
        Node left = new Node(leftS);
        Node right = new Node(rightS);

        root.set_left(left);
        root.set_right(right);

        assertEquals("Lefty", root.left().getSquirrel().getName());
        assertEquals("Righty", root.right().getSquirrel().getName());
    }
}
