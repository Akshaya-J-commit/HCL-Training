package com.hcl;

import java.util.Scanner;

class Corona {
    public void mc2() { Scanner input = new Scanner(System.in);
        System.out.println("enter the values of males and females in chennai");
        int chennai_males = input.nextInt();
        int chennai_females = input.nextInt();
        System.out.println("enter the values of males and females in coimabtore");
        int coimbatore_males = input.nextInt();
        int coimbatore_females = input.nextInt();
        System.out.println("enter the values of males and females in chitoor");
        int chitoor_males = input.nextInt();
        int chitoor_females = input.nextInt();
        System.out.println("enter the values of males and females in vijayawada");
        int vijayawada_males = input.nextInt();
        int vijayawada_females = input.nextInt();
        System.out.println("enter the values of males and females in cochin");
        int cochin_males = input.nextInt();
        int cochin_females = input.nextInt();
        System.out.println("enter the values of males and females in wayanad");
        int wayanad_males = input.nextInt();
        int wayanad_females = input.nextInt();
        System.out.println("total males in tamilnadu");
        System.out.println(tn_males(chennai_males,chennai_females));
        System.out.println("total females in tamilnadu");
        System.out.println(tn_females(coimbatore_males,coimbatore_females));
        System.out.println("total TN");
        System.out.println (tn_total(chennai_males,coimbatore_males,chennai_females,coimbatore_females));
        System.out.println("total males in andhrapradesh");
        System.out.println(ap_males(chitoor_males,vijayawada_males));
        System.out.println("total females in andhrapradesh");
        System.out.println(ap_females(chitoor_females,vijayawada_females));
        System.out.println("total AP");
        System.out.println(ap_total(chitoor_males,vijayawada_males,chitoor_females,vijayawada_females));
        System.out.println("total  males in kerala");
        System.out.println(kr_males(cochin_males,wayanad_males));
        System.out.println("total females in kerala");
        System.out.println(kr_females(cochin_females,wayanad_females));
        System.out.println("total in kerala");
        System.out.println(kr_total(cochin_males,wayanad_males,cochin_females,wayanad_females));
        int i=tn_total(chennai_males,coimbatore_males,chennai_females,coimbatore_females);
        int j=ap_total(chitoor_males,vijayawada_males,chitoor_females,vijayawada_females);
        int k=kr_total(cochin_males,wayanad_males,cochin_females,wayanad_females);
        System.out.println("Total cases" +(i+j+k));

    }
    public int tn_males(int chennai_males, int coimbatore_males) {
        return(chennai_males+coimbatore_males);
    }
    public int tn_females(int chennai_females, int coimbatore_females)
    {
        return(chennai_females+coimbatore_females);
    }
    public int tn_total(int chennai_males, int coimbatore_males,int chennai_females, int coimbatore_females){
        return(chennai_males+coimbatore_males+chennai_females+coimbatore_females);
    }
    public int ap_males(int chitoor_males, int vijayawada_males) {
        return(chitoor_males+vijayawada_males);
    }

    public int ap_females(int chitoor_females, int vijayawada_females) {
        return (chitoor_females + vijayawada_females);
    }
    public int ap_total(int chitoor_males,int vijayawada_males,int chitoor_females,int vijayawada_females)
    {
        return(chitoor_males+vijayawada_males+chitoor_females+vijayawada_females);
    }
    public int kr_males(int cochin_males, int wayanad_males) {
        return(cochin_males+wayanad_males);
    }

    public int kr_females(int cochin_females, int wayanad_females) {
        return (cochin_females+wayanad_females);
    }
    public int kr_total(int cochin_males, int wayanad_males,int cochin_females, int wayanad_females){
        return(cochin_males+wayanad_males+cochin_females+wayanad_females);

    }

}
public class Main {

    public static void main(String[] args) {
        Corona tamil=new Corona();
        tamil.mc2();
    }
}

