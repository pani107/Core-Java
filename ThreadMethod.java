class Demo extends Thread {
    public void run() {
        System.out.println(getName() + " is running");
        try {
            Thread.sleep(1000); // thread pauses
        } catch(Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Demo t1 = new Demo();
        Demo t2 = new Demo();

        t1.setName("Thread-A");
        t2.setName("Thread-B");

        t1.start();
        t2.start();

        try {
            t1.join(); // wait for t1 to finish
            t2.join(); // wait for t2 to finish
        } catch(Exception e) {
            System.out.println(e);
        }

        System.out.println("Main thread finished");
    }
}
