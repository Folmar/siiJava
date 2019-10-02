package pl.interfacethread;

public class Interfacethreads {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("cześć z wątku");
            }
        }).start();

        /**
         * Krótszy zapis tej samej metody co wyżej - z wykorzystaniem wyrażeń lamda
         * */
        new Thread(() -> System.out.println("cześć z wątku")).start();
    }


}
