package pl.maniaq;

import java.util.Scanner;

public class Zadanie3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbe calkowita: ");
        int number = scanner.nextInt();

        if (number >= 0 && number <= 10) {
            System.out.println("Liczba nalezy do przedziału od 0 do 10.");
        } else if (number >= 11 && number <= 20) {
            System.out.println("Liczba nalezy do przedziału od 11 do 20.");
        } else if (number >= 21 && number <= 30) {
            System.out.println("Liczba nalezy do przedziału od 21 do 30.");
        } else if (number >= 31 && number <= 40) {
            System.out.println("Liczba nalezy do przedziału od 31 do 40.");
        } else if (number >= 41 && number <= 50) {
            System.out.println("Liczba nalezy do przedziału od 41 do 50.");
        } else {
            System.out.println("Liczba nie należy do żadnego przedziału.");
        }
    }
}
