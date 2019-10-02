package pl.racing;

public class Counter {
    private int count = 0;

    public Counter(int count) {
        this.count = count;
    }

    public Counter() {
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    //dodanie synchronized powoduje synchroniczne wykonanie metody
    public synchronized int increment() {
        return count++;
    }

    //można też zaimplementować w samej metodzie jako blok na zasadzie try/catch

}
