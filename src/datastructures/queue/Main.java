package datastructures.queue;

public class Main {

    public static void main(String[] args) {

        Queue myQueue = new Queue(2);

        myQueue.enqueue(5);
        myQueue.enqueue(6);

        myQueue.getFirst();
        myQueue.getLast();
        myQueue.getLength();

        myQueue.printQueue();

        System.out.println("\n");
        System.out.println(myQueue.dequeue().value);

        System.out.println("\n");
        myQueue.printQueue();

    }
}
