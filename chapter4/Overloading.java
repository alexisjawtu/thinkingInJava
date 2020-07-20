//: Overloading.java

import java.util.*;

class Tree {
    int height;
    Tree() {
        this.height = 0;
    }
    Tree(int i) {
        this.height = i;
    }
    void info() {
        prt(this.height + " feet tall.");
    }
    void info(String s) {
        prt(s + ": " + this.height + " feet tall.");
    }
    static void prt(String s) {
        System.out.println(s);
    }
}

public class Overloading {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Tree t = new Tree(i);
            t.info();
            t.info("Overloaded!");
        }
        // Overloaded!
        new Tree();
    }
}