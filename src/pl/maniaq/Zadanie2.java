package pl.maniaq;

import java.util.Scanner;

public class Zadanie2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbe calkowita: ");
        int number = scanner.nextInt();

        if (number >= 0) {
            System.out.println("Podana liczba jest dodatnia.");
        } else {
            System.out.println("Podana liczba jest ujemna.");
        }

    }
}
