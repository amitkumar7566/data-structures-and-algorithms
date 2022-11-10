package datastructures.stack;

public class Main {

    public static void main(String[] args) {

        Stack myStack = new Stack(5);

        myStack.push(6);
        myStack.push(7);
        myStack.push(8);

        myStack.getTop();
        myStack.getHeight();
        myStack.printStack();

        System.out.println("\n");

        myStack.pop();

        myStack.getTop();
        myStack.getHeight();
        myStack.printStack();
    }
}
