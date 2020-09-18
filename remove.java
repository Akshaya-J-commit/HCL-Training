package com.hcl2;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        String str, word;
        Scanner scan = new Scanner(System.in);

        System.out.println("Dumpty says: ");
        str = scan.nextLine();

        System.out.println("What humpty wants to remove: ");
        word = scan.nextLine();

        str = str.replaceAll(word, "");

        System.out.println("Dumpty says String is : ");
        System.out.print(str);
    }
}
