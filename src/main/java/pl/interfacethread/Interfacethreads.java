package pl.interfacethread;

import pl.watki.Countdown;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Interfacethreads {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
/*        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("cześć z wątku");
            }
        }).start();*/

        /**
         * Krótszy zapis tej samej metody co wyżej - z wykorzystaniem wyrażeń lamda
         * */
//        new Thread(() -> System.out.println("cześć z wątku")).start();

        /**
         * Najlepiej wywoływac wątki wykorzystując klasę Executors.
         * korzystać z metody newSingleThreadExecutor
         * ExecutorService - usługa zarządza wyjątkami
         * */
/*        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<?> watek = executorService.submit(() -> "cześć z wątku"); //w lambdzie zaszyte jest return
        Object o = watek.get();
        System.out.println(o);
        executorService.shutdown();*/

        /**
         * określenie ilości wykoannych wątków newFixedThreadPool
         * */
/*        ExecutorService executorService = Executors.newFixedThreadPool(40); //w nThreads wskazujemy liczbę wątków jaka ma być wykonana
        for (int i = 0; i < 100; i++) {
            executorService.submit(new Countdown()); //Countdown dziedziczy po Thread więc możemy wstawić new Countdown do submion()
        }*/

        /**
         * określenie newCashedThreadPool
         * metoda do optymalizacji ilości wątków
         * */
        ExecutorService executorService = Executors.newCachedThreadPool(); //metoda do tworzenia dynamicznej ilości wątków
        for (int i = 0; i < 100; i++) {
            executorService.submit(new Countdown()); //Countdown dziedziczy po Thread więc możemy wstawić new Countdown do submion()
        }
    }


}
