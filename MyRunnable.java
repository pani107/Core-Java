class MyRunnable implements Runnable {
    public void run() {
        for(int i=1; i<=5; i++) {
            System.out.println("Runnable thread: " + i);
        }
    }

    public static void main(String[] args) {
        MyRunnable obj = new MyRunnable();
        Thread t1 = new Thread(obj); // pass Runnable object
        t1.start();
    }
}
