





////////////////////Open Ended//////////////////////////






import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

class Producer extends Thread {
    private final Queue<Integer> queue;
    private final int maxSize;

    public Producer(Queue<Integer> queue, int maxSize) {
        this.queue = queue;
        this.maxSize = maxSize;
    }

    @Override
    public void run() {
        Random random = new Random();
        for (int i = 0; i < 10; i++) { // Produce 10 items
            try {
                Thread.sleep(random.nextInt(500)); // Simulate variable production time
                synchronized (queue) {
                    while (queue.size() == maxSize) {
                        queue.wait(); // Wait if the queue is full
                    }
                    int item = random.nextInt(100); // Produce a random item
                    queue.add(item); // Add item to the queue
                    System.out.println("Produced: " + item);
                    queue.notifyAll(); // Notify consumers
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

class Consumer extends Thread {
    private final Queue<Integer> queue;

    public Consumer(Queue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                synchronized (queue) {
                    while (queue.isEmpty()) {
                        queue.wait(); // Wait if the queue is empty
                    }
                    int item = queue.poll(); // Retrieve item from the queue
                    System.out.println("Consumed: " + item);
                    queue.notifyAll(); // Notify producers
                }
                Thread.sleep(new Random().nextInt(500)); // Simulate variable consumption time
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break; // Exit the loop if interrupted
            }
        }
    }
}

public class deadlock {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        int maxSize = 5; // Maximum size of the queue

        Producer producer = new Producer(queue, maxSize);
        Consumer consumer = new Consumer(queue);

        producer.start();
        consumer.start();

        try {
            producer.join(); // Wait for the producer to finish
            consumer.interrupt(); // Interrupt the consumer to stop it
            consumer.join(); // Wait for the consumer to finish
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}