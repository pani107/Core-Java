class Worker extends Thread {
    public void run() {
        for(int i=1; i<=5; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i);
            try {
                Thread.sleep(500); // pause for half second.
            } catch(Exception e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        Worker t1 = new Worker();
        Worker t2 = new Worker();
        
        t1.setName("Worker-1");
        t2.setName("Worker-2");

        t1.start();
        t2.start();
    }
}
