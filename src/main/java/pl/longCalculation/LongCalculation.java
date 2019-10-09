package pl.longCalculation;

import java.util.Random;
import java.util.concurrent.Callable;

public class LongCalculation implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return new Random().nextInt(5) + 1;
    }
}
