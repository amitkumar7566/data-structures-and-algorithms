package datastructures.binarysearchtree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {

    Node root;

    class Node {
        int value;
        Node left;
        Node right;

        private Node(int value) {
            this.value = value;
        }
    }


    public boolean insert(int value) {
        Node newNode = new Node(value);

        if (root == null) {
            root = newNode;
            return true;
        }

        Node temp = root;

        while (true) {
            if (newNode.value == temp.value) return false;

            if (newNode.value < temp.value){
                if (temp.left == null) {
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            } else {
                if (temp.right == null) {
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }
        }
    }


    public boolean contains(int value){
        Node temp = root;

        while (temp != null) {
            if (value < temp.value) {
                temp = temp.left;
            } else if (value > temp.value) {
                temp = temp.right;
            } else
                return true;
        }

        return false;
    }


    public ArrayList<Integer> BFS() {
        Node temp = root;
        Queue<Node> nodeQueue = new LinkedList<>();
        ArrayList<Integer> results = new ArrayList<>();

        nodeQueue.add(temp);

        while (nodeQueue.size() > 0) {
            temp = nodeQueue.remove();
            results.add(temp.value);

            if (temp.left != null)
                nodeQueue.add(temp.left);

            if (temp.right != null)
                nodeQueue.add(temp.right);
        }

        return results;
    }


    public ArrayList<Integer> DFSPreOrder() {
        ArrayList<Integer> results = new ArrayList<>();

        class TraversePreOrder {
            TraversePreOrder(Node temp) {
                results.add(temp.value);

                if (temp.left != null)
                    new TraversePreOrder(temp.left);

                if (temp.right != null)
                    new TraversePreOrder(temp.right);
            }
        }

        new TraversePreOrder(root);
        return results;
    }


    public ArrayList<Integer> DFSPostOrder() {
        ArrayList<Integer> results = new ArrayList<>();

        class TraversePostOrder {
            TraversePostOrder(Node temp) {

                if (temp.left != null)
                    new TraversePostOrder(temp.left);

                if (temp.right != null)
                    new TraversePostOrder(temp.right);

                results.add(temp.value);
            }
        }

        new TraversePostOrder(root);
        return results;
    }


    public ArrayList<Integer> DFSInOrder() {
        ArrayList<Integer> results = new ArrayList<>();

        class TraverseInOrder {
            TraverseInOrder(Node temp) {

                if (temp.left != null)
                    new TraverseInOrder(temp.left);

                results.add(temp.value);

                if (temp.right != null)
                    new TraverseInOrder(temp.right);
            }
        }

        new TraverseInOrder(root);
        return results;
    }

}
