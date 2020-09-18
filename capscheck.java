package com.hcl2;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter dumptys sentence");
        String str = in.nextLine();
        char[] charArray = str.toCharArray();

        for (int i = 0; i < charArray.length; i++) {


            if (!Character.isUpperCase(charArray[i]))
                System.out.println("String is in upper case");
        }
        else{

            System.out.println("String is not in uppercase " + (str));
        }
    }
}
