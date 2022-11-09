package datastructures.hashtable;

public class Main {

    public static void main(String[] args) {

        HashTable myHashTable = new HashTable();

        myHashTable.put("nails", 100);
        myHashTable.put("tile", 50);
        myHashTable.put("lumber", 80);
        myHashTable.put("bolts", 200);
        myHashTable.put("screws", 140);
        myHashTable.put("nails", 500);

        myHashTable.printTable();

        System.out.println("\n");

        System.out.println(myHashTable.get("bolts"));
        System.out.println(myHashTable.get("tile"));

        System.out.println("\n");

        System.out.println(myHashTable.keys());

    }
}
