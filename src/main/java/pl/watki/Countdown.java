package pl.watki;

public class Countdown extends Thread {
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println("Start");
        for (int i = 10; i > 0; i--) {
            waitOneSec();
            Thread.yield();
            System.out.println(name + " " + i);
        }
        System.out.println("Stop");
    }

    private void waitOneSec() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
