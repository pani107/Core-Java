class DaemonExample extends Thread {
    public void run() {
        if(Thread.currentThread().isDaemon()) {
            System.out.println("Daemon thread running in background...");
        } else {
            System.out.println("User thread running...");
        }
    }

    public static void main(String[] args) {
        DaemonExample t1 = new DaemonExample();
        DaemonExample t2 = new DaemonExample();

        t1.setDaemon(true); // must set before start()

        t1.start();
        t2.start();
    }
}
