package datastructures.hashtable;

import java.util.ArrayList;

public class HashTable {

    private final Node[] dataArray;

    static class Node {
        String key;
        int value;
        Node next;

        Node(String key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    public HashTable() {
        int size = 7;
        dataArray = new Node[size];
    }


    private int hash(String key) {
        int hash = 0;
        char[] keyChars = key.toCharArray();

        for (int asciiValue : keyChars)
            hash = (hash + asciiValue * 23) % dataArray.length;

        return hash;
    }


    public int get(String key) {
        int index = hash(key);
        Node temp = dataArray[index];

        while (temp != null) {
            if (temp.key.equals(key)) return temp.value;
            temp = temp.next;
        }
        return 0;
    }


    public void put(String key, int value) {
        int index = hash(key);
        Node newNode = new Node(key, value);

        if (dataArray[index] == null) {
            dataArray[index] = newNode;
        } else {
            Node temp = dataArray[index];

            if (temp.key.equals(key)) {
                temp.value = value;
                return;
            }

            while (temp.next != null) {
                temp = temp.next;
                if (temp.key.equals(key)) {
                    temp.value = value;
                    return;
                }
            }
            temp.next = newNode;
        }
    }


    public ArrayList<String> keys() {
        ArrayList<String> allKeys = new ArrayList<>();

        for (Node temp : dataArray) {
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
