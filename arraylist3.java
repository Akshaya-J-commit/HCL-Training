package com.hcl2;
import java.lang.reflect.Array;
import java.util.*;
 class User{
    String name;
    String contact_no;
    String username;
    String password;
    public User{

     }

     public User(String name, String contact_no, String username, String password) {
         this.name = name;
         this.contact_no = contact_no;
         this.username = username;
         this.password = password;
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public String getContact_no() {
         return contact_no;
     }

     public void setContact_no(String contact_no) {
         this.contact_no = contact_no;
     }

     public String getUsername() {
         return username;
     }

     public void setUsername(String username) {
         this.username = username;
     }

     public String getPassword() {
         return password;
     }

     public void setPassword(String password) {
         this.password = password;
     }
     void display(){
        System.out.println("name:"+name);
        System.out.println("contact_no:"+contact_no);
        System.out.println("username:"+username);
        System.out.println("password:"+password);
     }
 }
public class Main {

    public static void main(String[] args) {

        ArrayList<Object> s=new ArrayList<>();
        Scanner in=new Scanner(System.in);
        String name;
        String contact_no;
        String username;
        String password;
        System.out.println("enter the number of details to be added:");
        int n=in.nextInt();
        while(n>=0) {
            System.out.println("enter the user " + n + "details in csv format:");
            name = in.nextLine();
            contact_no = in.nextLine();
            username = in.nextLine();
            password = in.nextLine();
            User us = new User(name, contact_no, username, password);
            s.add(us.getName());
            s.add(us.getContact_no());
            s.add(us.getUsername());
            s.add(us.getPassword());
            n--;
        }
        ArrayList<Object> su=new ArrayList<>();
        int i=in.nextInt();
        while(i>=0) {
            System.out.println("enter the user " + i + "details in csv format:");
            name = in.nextLine();
            contact_no = in.nextLine();
            username = in.nextLine();
            password = in.nextLine();
            User us1 = new User(name, contact_no, username, password);
            su.add(us1.getName());
            su.add(us1.getContact_no());
            su.add(us1.getUsername());
            su.add(us1.getPassword());
            i--;
        }
        s.addAll(n,su);
        System.out.println(s);

    }
}
