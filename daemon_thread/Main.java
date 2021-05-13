public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Daemon();
        t.setDaemon(true);
        t.start();
        //new Daemon().start();
        System.out.println("t started");
        Thread.sleep(3500);
        System.out.println("ended");
    }
}
