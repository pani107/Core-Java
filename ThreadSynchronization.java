class Counter {
    int count = 0;

    synchronized void increment() {
        count++;
    }
}

class SyncDemo extends Thread {
    Counter c;
    SyncDemo(Counter c) {
        this.c = c;
    }

    public void run() {
        for(int i=0; i<1000; i++) {
            c.increment();
        }
    }

    public static void main(String[] args) throws Exception {
        Counter c = new Counter();
        SyncDemo t1 = new SyncDemo(c);
        SyncDemo t2 = new SyncDemo(c);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Count: " + c.count);
    }
}
