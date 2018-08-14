package pl.maniaq;

import java.util.Random;
import java.util.Scanner;

public class Zadanie5 {

    public static void main(String[] args) {
	    Random generator = new Random();
	    int winNumber = generator.nextInt(10);

	    System.out.println("Odgadnij liczbę z przedziału od 0 do 10: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if(number == winNumber) {
            System.out.println("Udało Ci się wygrać!");
        } else {
            System.out.println("Niestety wylosowana liczba to: " + winNumber);
        }
    }
}
