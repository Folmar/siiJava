package pl.kolekcje;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<People> arrayList = new ArrayList<>();
        People people = new People();

        //wywołanie metody
        insertName(scanner, arrayList, people);

        //pętla wyświetla wszystkie osoby
        for (People printNames : arrayList) {
            System.out.println(printNames.getName());
        }

    }

    /**
     * Napisz program, który będzie pobierał od użytkownika imiona.
     * Program powinien pozwolić użytkownikowi na wprowadzenie
     * dowolnej liczby imion (wprowadzenie „-” jako imienia przerwie wprowadzanie).
     * Na zakończenie wypisz liczbę unikalnych imion.
     */
    private static void insertName(Scanner scanner, ArrayList<People> arrayList, People people) {
        for (int i = 0; i < arrayList.size()+1; i++) {
            people.setName(scanner.next());
            if (!people.getName().equals("-")){
                arrayList.add(people);
            }
            else throw new RuntimeException("Nieprawidłowa wartość dla pola Imię");
        }
    }
}




