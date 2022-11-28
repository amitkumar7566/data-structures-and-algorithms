package algorithms.concurrentcollections.blockingqueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.stream.IntStream;

public class ProducerConsumerScenario {

    private static final BlockingQueue<Integer> blockingQueue = new LinkedBlockingQueue<>();

    public static void main(String[] args) {

        Runnable producer = () -> IntStream.rangeClosed(1, 10).forEach(number -> {
            try {
                System.out.println("Producer produced: Item " + number);
                blockingQueue.put(number);
                Thread.sleep(1000);
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }
        });

        Runnable consumer = () -> {
            try {
                while (true)
                    System.out.println("Consumer consumed: Item " + blockingQueue.take());
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }
        };

        new Thread(consumer).start();
        new Thread(producer).start();
    }

}


