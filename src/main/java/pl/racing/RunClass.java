package pl.racing;

public class RunClass extends Thread{

    private Counter counter;

    public RunClass(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 500000; i++) {
            counter.increment();
        }
    }
}
