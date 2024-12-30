






////////////////////////////////////Open Ended////////////////////////////









class DataBuffer {
    private int data = 0;
    private boolean available = false;

    // Producer thread method (IPC)
    public synchronized void produce() throws InterruptedException {
        while (available) {
            wait();  // Wait if data is already produced
        }
        data++;
        System.out.println("Produced: " + data);
        available = true;
        notify();  // Notify consumer that data is available
    }

    // Consumer thread method (IPC)
    public synchronized void consume() throws InterruptedException {
        while (!available) {
            wait();  // Wait if no data is available
        }
        System.out.println("Consumed: " + data);
        available = false;
        notify();  // Notify producer that space is available
    }
}

class Resource {
    // Method to lock resource 1 and then try to lock resource 2 (for deadlock)
    public synchronized void lockResource1(Resource r) {
        System.out.println(Thread.currentThread().getName() + " locked Resource 1");
        try { Thread.sleep(100); } catch (InterruptedException e) {}
        r.lockResource2(this);  // Attempt to lock the second resource
    }

    // Method to lock resource 2 and then try to lock resource 1 (for deadlock)
    public synchronized void lockResource2(Resource r) {
        System.out.println(Thread.currentThread().getName() + " locked Resource 2");
        try { Thread.sleep(100); } catch (InterruptedException e) {}
        r.lockResource1(this);  // Attempt to lock the first resource
    }
}

public class IPCAndDeadlockExample {
    public static void main(String[] args) {
        // Part 1: Inter-Process Communication (IPC)
        DataBuffer buffer = new DataBuffer();

        // Producer thread for IPC
        Thread producer = new Thread(() -> {
            try {
                for (int i = 0; i < 5; i++) {
                    buffer.produce();
                    Thread.sleep(500);  // Simulate time taken to produce data
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Consumer thread for IPC
        Thread consumer = new Thread(() -> {
            try {
                for (int i = 0; i < 5; i++) {
                    buffer.consume();
                    Thread.sleep(1000);  // Simulate time taken to consume data
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Start the producer and consumer threads for IPC
        producer.start();
        consumer.start();

        // Part 2: Deadlock Scenario
        Resource resource1 = new Resource();
        Resource resource2 = new Resource();

        // Thread 1: Locks resource 1 and then tries to lock resource 2 (part of deadlock)
        Thread thread1 = new Thread(() -> resource1.lockResource1(resource2), "Thread 1");

        // Thread 2: Locks resource 2 and then tries to lock resource 1 (part of deadlock)
        Thread thread2 = new Thread(() -> resource2.lockResource1(resource1), "Thread 2");

        // Start the threads that will cause deadlock
        thread1.start();
        thread2.start();
    }
}
