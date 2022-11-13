package com.greatlearning.binary_to_skew;

import com.greatlearning.binary_to_skew.entity.Node;
import com.greatlearning.binary_to_skew.entity.Tree;

public class Main {
    public static void main(String[] args) {

        Node root  = new Node(50);
        root.left = new Node(30);
        root.right = new Node(60);
        root.left.left = new Node(10);
        root.right.left = new Node(55);


        Tree tree = new Tree(root);

        tree.convertRightSkewedTree();
        tree.printTree();


    }
}
