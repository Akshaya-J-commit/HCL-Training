package com.hcl2;
import java.util.Scanner;
class Film{
    int id;
    String name;
    public int getInt()
    {
return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }
}
class Songs{
    String name;
    String singers;
    int film_id;
    int id;
    public int getId(){
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSingers() {
        return singers;
    }

    public void setSingers(String singers) {
        this.singers = singers;
    }

    public int getFilm_id() {
        return film_id;
    }

    public void setFilm_id(int film_id) {
        this.film_id = film_id;
    }
}
public class Main {

    public static void main(String[] args)
    {
     Film []film =new Film[100];
     Songs song=new Songs();
     Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of films");
     int n=in.nextInt();
     for(int i=1;i<=n;i++) {
         System.out.println("enter the film details:");
         int id = in.nextInt();
         in.nextLine();
         String name = in.nextLine();
         film.setId(id);
         film.setName(name);
         System.out.println("Number of songs in "+film.name);
         int song_no=in.nextInt();
         for(i=1;i<=song_no;i++){
         System.out.println("enter the song details:");
         song.setId(id);
         song.setName(name);
         String singers=in.nextLine();
         song.setSingers(singers);

     }

    }
}
