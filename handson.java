package com.hcl;
import java.util.Scanner;
class Venue
{
    String name;
    String city;

    public String getName() {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public String getCity()
    {
        return city;

    }
    public void setCity(String city)
    {
        this.city=city;
    }
}
public class Main {
    public static void main(String[] args) {
        Venue ven=new Venue();
        Scanner input = new Scanner(System.in);
        System.out.println("enter the venue name:");
        String name = input.nextLine();
        System.out.println("enter the city name:");
        String city = input.nextLine();
        ven.setName(name);
        ven.setCity(city);
        System.out.println("Venue Details");
        System.out.println("Venue Name: "+ven.name);
        System.out.println("Venue City: "+ven.city);


    }
}
