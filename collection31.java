package com.hcl2;
import java.util.*;
import java.util.ArrayList;
        public class Main {

            public static void main(String[] args) {
                int n;
                String hall;
                ArrayList<String> al= new ArrayList<>();
                Scanner s = new Scanner(System.in);
                System.out.println("Enter no of halls");
                n=s.nextInt();
                String str[]=new String[n];
                s.nextLine();
                for(int i=0;i<n;i++)
                {
                    System.out.println("Enter the hall"+ i+1);
                    str[i]=s.nextLine();
                    al.add(str[i]);
                }
                System.out.println("Enter the hall name to be serached");
                hall = s.nextLine();
                if(al.contains(hall))
                    System.out.println(hall +"is found at the position :"+al.indexOf(hall));
                else
                    System.out.println(hall+" is not found ");




            }

        }
    }
}
