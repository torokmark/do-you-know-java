public class Daemon extends Thread {
    @Override
    public void run() {
        int count = 0;
        while (true) {
            System.out.println(count++);
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}
