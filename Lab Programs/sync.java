class Callme {
    synchronized void call(String msg) {  // synchronized method
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);  // Simulate some processing delay
        } catch (InterruptedException e) {
            System.out.println("Interrupted: " + e);
        }
        System.out.println("]");
    }
}

class Caller implements Runnable {
    String msg;
    Callme target;
    Thread t;
   
    public Caller(Callme targ, String s) {
        target = targ;
        msg = s;
        t = new Thread(this);
        t.start();
    }
   
    public void run() {
        synchronized(target) {  // Synchronization Block
            target.call(msg);
        }
    }
}

class thread_sync {
    public static void main(String args[]) {
        Callme target = new Callme();
        Caller ob1 = new Caller(target, "Hello");
        Caller ob2 = new Caller(target, "Synchronized");
        Caller ob3 = new Caller(target, "World");
       
        // Wait for threads to finish
        try {
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Interrupted: " + e);
        }
    }
}
