package pl.marekfoltyn;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
//        int[] tablica = new int[random.nextInt(100)];
        int[] tablica = new int[100];
        int[] oldTable = fillTheArray(tablica);
        printArray(oldTable);
        System.out.println();
        int[] newTable = createTable(fillTheArray(tablica), random.nextInt(100), random.nextInt(100));
        System.out.println();
        printArray(newTable);
    }

    public static int[] fillTheArray(int[] arrayToFill) {
        for (int i = 0; i < arrayToFill.length; i++) {
            arrayToFill[i] = i;
        }
        return arrayToFill;
    }

    public static int[] createTable(int[] t, int start, int end) {
        System.out.println("start:" + start);
        System.out.println("end:" + end);
        if (t.length < 1) {
            throw new RuntimeException("TAblica jest pusta!");
        }
        if (start > end) {
            throw new NegativeArraySizeException("Index start większy od end - wartość nieprawidłowa");
        }
        if(t.length <= end || t.length <= start){

            throw new RuntimeException("Długośc tablicy poza zakresem");
        }
/*        for (int i = 0; i < t.length; i++) {
            if (t[i] == start)
        }*/

        int[] newInts = new int[end - start + 1];
        int j = 0;
        for (int i = start; i <= end; i++) {
            newInts[j++] = t[i];
        }
        return newInts;
    }

    public static void printArray(int[] t) {
        for (int i : t) {
            System.out.print(i + ", ");
        }
    }


}
