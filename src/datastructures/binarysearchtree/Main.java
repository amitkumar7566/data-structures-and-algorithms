package datastructures.binarysearchtree;

public class Main {

    public static void main(String[] args) {

        BinarySearchTree myBST = new BinarySearchTree();

        myBST.insert(47);
        myBST.insert(21);
        myBST.insert(76);
        myBST.insert(18);
        myBST.insert(52);
        myBST.insert(82);
        myBST.insert(27);

        System.out.println(myBST.contains(27));

        System.out.println("BFS = " + myBST.BFS());

        System.out.println("DFSPreOrder = " + myBST.DFSPreOrder());

        System.out.println("DFSPostOrder = " + myBST.DFSPostOrder());

        System.out.println("DFSInOrder = " + myBST.DFSInOrder());

        System.out.println("Tree height = " + myBST.height());

    }

}
