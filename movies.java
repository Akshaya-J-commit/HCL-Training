package com.hcl2;
import java.util.Scanner;
class Film{
    int id;
    String name;
   public int getId()
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
    String song;
    String singer_name;
    int films_id;

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public String getSingers() {
        return singer_name;
    }

    public void setSingers(String singer_name) {
        this.singer_name = singer_name;
    }

    public int getFilm_id() {
        return films_id;
    }

    public void setFilm_id(int films_id) {
        this.films_id = films_id;
    }

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Film [] film = new Film[2];
        Songs [] songs = new Songs[2];
        int id;
        String name;
        String song;
        int films_id;
        String singer_name;
        System.out.println("how many films?");
        for (int i = 0; i < film.length; i++) {
            System.out.println("Enter the film details:");
            id = in.nextInt();
            name = in.next();
            film[i] = new Film();
            film[i].setId(id);
            film[i].setName(name);
            for (int j = 0; j < songs.length; j++) {
                films_id = in.nextInt();
                song = in.next();
                singer_name = in.next();
                songs[j] = new Songs();
                songs[j].setFilm_id(films_id);
                songs[j].setSong(song);
                songs[j].setSingers(singer_name);

            }
        }
        for (int i = 0; i < film.length; i++) {
            System.out.println("the film details are:" + film[i].getId() + " " + film[i].getName());
            for (int j = 0; j < songs.length; j++) {
                System.out.println(songs[j].getSong() + " " + songs[j].getSingers());
            }
        }
    }
}
