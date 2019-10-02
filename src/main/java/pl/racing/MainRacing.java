package pl.racing;

public class MainRacing {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        long l = System.currentTimeMillis();
        RunClass runClass = new RunClass(counter);
        RunClass runClass1 = new RunClass(counter);
        RunClass runClass2 = new RunClass(counter);
        runClass.start();
        runClass1.start();
        runClass2.start();

        runClass.join(); //konieczna metoda join - powoduje że w tej linicje aplikacja zaczeka aż start() przestanie działać
        runClass1.join();
        runClass2.join();

        System.out.println(counter.getCount());
        System.out.println(System.currentTimeMillis() - l);

    }
}
