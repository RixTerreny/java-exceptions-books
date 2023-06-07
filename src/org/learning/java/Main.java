package org.learning.java;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci il numero di libri: ");
        int numLibri = scan.nextInt();
        scan.nextLine();

        Book[] library = new Book[numLibri];

        for (int i = 0; i < numLibri; i++) {

            Book myBook = null;

            System.out.println("titolo: ");
            String title = scan.nextLine();

            System.out.println("Autore: ");
            String author = scan.nextLine();

            System.out.println("Editore: ");
            String editor = scan.nextLine();

            System.out.println("Numero pagine: ");
            int numberPages = scan.nextInt();
            scan.nextLine();

            myBook = new Book(title, author, editor, numberPages);

            library[i] = myBook;
        }

        System.out.println(Arrays.toString(library));
    }
}
