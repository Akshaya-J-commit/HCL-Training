package com.hcl2;
import java.util.*;
public class Main {


            public static void main(String args[])
            {
                System.out.println("Enter the string");

                Scanner sc = new Scanner(System.in);

                String s = sc.nextLine();
                String s2=sc.nextLine();

                int count_1 = 1;
               int count_2=1;
                 for (int i = 0; i < s.length() - 1; i++)
                {
                    if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' '))
                    {
                        count_1++;

                    }
                }

                System.out.println("Number of words in a string = " + count_1);
                for (int i = 0; i < s2.length() - 1; i++)
                {
                    if ((s2.charAt(i) == ' ') && (s2.charAt(i + 1) != ' '))
                    {
                        count_2++;

                    }
                }

                System.out.println("Number of words in a string = " + count_2);
                if(count_1==count_2){
                    System.out.println("both are equal");
            }
                else if(count_1>count_2)
                {
                    System.out.println("Dumpty has used more words:");
        }
                else{
                    System.out.println("Dumpty has used less words");
                }

    }
}
