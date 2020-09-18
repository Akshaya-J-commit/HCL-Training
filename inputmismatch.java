
package com.hcl2;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("enter the integer:");
            int n = in.nextInt();
            System.out.println("the integer is:" + n);
        }
        catch(InputMismatchException ioe)
        {
            System.out.println(" java.util.InputMismatchException");
        }
        catch(Exception ce)
        {
            ce.printStackTrace();
        }
    }
}
