package com.hcl2;
import java.util.Scanner;
class Venue
{
    String name;
    String city;
    public static String getName()
    {
        return name;

    }

    public static void setName(String name) {
        this.name = name;
    }
    public static String getCity()
    {
        return city;
    }

    public static void setCity(String city) {
        this.city = city;
    }
}
public class Main {

    public static void main(String[] args) {
     Scanner in=new Scanner(System.in);
     Venue ven= new Venue();
     System.out.println("enter the venue ");
     String name=in.nextLine();
     System.out.println("enter the city");
     String city=in.nextLine();
     Venue.setName(name);
     Venue.setCity(city);
     System.out.println("VENUE NAME:"+ Venue.getName());
     System.out.println("VENUE CITY:"+Venue.getCity());
     System.out.println("VERIFY AND UPDATE VENUE DETAILS");
     int n;
do{
System.out.println("1.update venue name");
    System.out.println("2.update venue city");
    System.out.println("3.All information correct/exit");
    n=in.nextInt();
    in.nextLine();
    switch(n)
    {
        case 1:
        {
            System.out.println("enter the venue name");
            name=in.nextLine();
            Venue.setName(name);
            break;
        }
        case 2:
        {
            System.out.println("enter the venue city");
            city=in.nextLine();
            Venue.setCity(city);
            break;
        }
        case 3:
        {
            System.out.println("VENUE NAME:"+ Venue.getName());
            System.out.println("VENUE CITY:"+Venue.getCity());
            System.out.println("VERIFY AND UPDATE VENUE DETAILS");
        }

    }
}while(n>=3)

