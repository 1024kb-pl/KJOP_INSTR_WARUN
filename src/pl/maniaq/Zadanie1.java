package pl.maniaq;

import java.util.Scanner;

public class Zadanie1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbe calkowita: ");
        int number = scanner.nextInt();

        boolean isOdd = number % 2 != 0;
        if (isOdd) {
            System.out.println("Liczba jest nieparzysta.");
        } else {
            System.out.println("Liczba jest parzysta");
        }

    }
}
