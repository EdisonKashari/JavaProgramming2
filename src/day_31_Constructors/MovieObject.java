package day_31_Constructors;

public class MovieObject {

    public static void main(String[] args) {

        Movie movie1 = new Movie("USA","CYDEO25","Comedy","10/25/2021","Kuzzat Altay");

        movie1.addCast("Tom Hanks");

        System.out.println(movie1);

        String [] cast={"Will Smith","Ben Afleck","Richard Gere"};

        movie1.addCasts(cast);
        System.out.println(movie1);

    }
}
/*
	        3.2create a class called MovieObjects
            1. create an object of the movie:
                    title: Journey to SDET: Cydeo Batch 23
                    country: USA
                    Genre: Adventure, Comedy, Thriller
                    release date: 10/25/2021
                    director: Kuzzat Altay
                    Casts: Asiya, Adam, Muhtar and 5 more students from your group

        print the full info of the movie*/