package day_32_Constructors;

public class MovieObjects {
    public static void main(String[] args) {



    /*
    3.2create a class called MovieObjects
            1. create an object of the movie:
                    title: Journey to SDET: Cydeo Batch 23
                    country: USA
                    Genre: Adventure, Comedy, Thriller
                    release date: 10/25/2021
                    director: Kuzzat Altay
                    Casts: Asiya, Adam, Muhtar and 5 more students from your group

        print the full info of the movie
     */

        Movie movie1 = new Movie("USA", "Journey to SDET: Cydeo Batch 23", "Adventure, Comedy, Thriller", "10/25/2021", "Kuzzat Altay");

        movie1.addCast("Asiya");
        movie1.addCast("Adam");
        movie1.addCast("Muhtar");



        System.out.println(movie1);


        String [] newCasts = {"Magda","Duygu", "Farangis", "Farangez", "Edison"};

        movie1.addCasts(newCasts);
        System.out.println(movie1);

    }
}