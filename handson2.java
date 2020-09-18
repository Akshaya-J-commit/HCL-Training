

package com.hcl2;
import java.util.Scanner;
class Players
{   String name;
    String country;
    String  skill;
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public String getCountry()
    {
        return country;
    }
    public void setCountry(String country)
    {
        this.country=country;
    }
    public String getSkill()
    {
        return skill;
    }
    public void setSkill(String skill)
    {
        this.skill=skill;
    }
}
public class Main {

    public static void main(String[] args) {
	Players obj=new Players();
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the player name:");
        String name=input.nextLine();
        System.out.println("Enter the country: ");
        String country=input.nextLine();
        System.out.println("Enter the skill:");
        String skill=input.nextLine();

     obj.setName(name);
     obj.setCountry(country);
     obj.setSkill(skill);
        System.out.println("Player Details");
        System.out.println("Player Name: "+obj.name);
        System.out.println("Country: "+obj.country);
        System.out.println("Skill: "+obj.skill);
    }
}
