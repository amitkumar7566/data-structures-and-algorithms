package datastructures.hashtable;

import java.util.ArrayList;
import java.util.Objects;

public class HashTable {

    private int size = 7;
    private Node[] dataArray;

    class Node {
        String key;
        int value;
        Node next;

        Node(String key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    public HashTable() {
        dataArray = new Node[size];
    }


    private int hash(String key) {
        int hash = 0;
        char[] keyChars = key.toCharArray();

        for (int i = 0; i < keyChars.length; i++) {
            int asciiValue = keyChars[i];
            hash = (hash + asciiValue * 23) % dataArray.length;
        }
        return hash;
    }


    public int get(String key) {
        int index = hash(key);
        Node temp = dataArray[index];

        while (temp != null) {
            if (temp.key == key) return temp.value;
            temp = temp.next;
        }
        return 0;
    }


    public void set(String key, int value) {
        int index = hash(key);
        Node newNode = new Node(key, value);

        if (dataArray[index] == null) {
            dataArray[index] = newNode;
        } else {
            Node temp = dataArray[index];
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }


    public ArrayList keys() {
        ArrayList<String> allKeys = new ArrayList<>();

        for (int i = 0; i < dataArray.length; i++) {
            Node temp = dataArray[i];
            while (temp != null) {
                allKeys.add(temp.key);
                temp = temp.next;
            }
        }
        return allKeys;
    }


    public void printTable() {
        for (int i = 0; i < dataArray.length; i++) {
            System.out.println(i + ":");
            Node temp = dataArray[i];

            while (temp != null) {
                System.out.println(" {" + temp.key + " = " + temp.value + "}");
                temp = temp.next;
            }
        }
    }

}
