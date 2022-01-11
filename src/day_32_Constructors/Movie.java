package day_32_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class Movie {
    /*
    Movie Task:

	3.1. Create a class named Movie
	    Attributes:
	        country (String), title (String), Genre (String), releaseDate (String), director (String), casts (ArrayList<String>)

		Add a constructor to set the country, title, release date, and director of the Movie

	    Actions
	        addCast(String): adds the given string argument to the arrayList casts
	        addCasts(String[]): adds the given string array argument to the arrayList casts
	        toString(): returns the name of country, title, release date, and total number of casts


     */


    //Attributes:
    //	        country (String), title (String), Genre (String), releaseDate (String), director (String), casts (ArrayList<String>)


    public String country, Genre, title, releaseDate, director;
    public ArrayList<String>casts = new ArrayList<>();

    //Add a constructor to set the country, title, release date, and director of the Movie


    public Movie(String country, String title, String Genre, String releaseDate, String director) {
        this.country = country;
        this.title = title;
        this.Genre = Genre;
        this.releaseDate = releaseDate;
        this.director = director;
    }

    /*
     Actions
	        addCast(String): adds the given string argument to the arrayList casts
	        addCasts(String[]): adds the given string array argument to the arrayList casts
	        toString(): returns the name of country, title, release date, and total number of casts
     */

    public void addCast(String cast){
        casts.add(cast);

    }

    public void addCasts(String[] newCasts){
        casts.addAll(Arrays.asList(newCasts));
    }

    public String toString() {
        return "Movie{" +
                "country='" + country + '\'' +
                ", title='" + title + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", total number of casts=" + casts.size() +
                '}';
    }
}
