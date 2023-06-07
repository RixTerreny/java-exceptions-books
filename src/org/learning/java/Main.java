package org.learning.java;

import org.learning.java.customException.InvalidNumberOfPagesException;
import org.learning.java.customException.NullValueException;

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
            boolean valid = false;

            do {
                try {

                System.out.println("titolo: ");
                String title = scan.nextLine();

                System.out.println("Autore: ");
                String author = scan.nextLine();

                System.out.println("Editore: ");
                String editor = scan.nextLine();

                System.out.println("Numero pagine: ");
                int numberPages = scan.nextInt();
                scan.nextLine();

                System.out.println("\n");
                myBook = new Book(title, author, editor, numberPages);

                valid = true;
                } catch (InvalidNumberOfPagesException e){
                    System.out.println("Il libro deve avere numero di pagine positivo e maggiore di 0 \n");
                }catch (NullValueException e){
                    System.out.println("Il libro non deve avere campi vuoti \n");
                }

            } while (!valid);

            library[i] = myBook;

        }

        System.out.println(Arrays.toString(library));
    }
}
