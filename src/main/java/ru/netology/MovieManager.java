package ru.netology;

public class MovieManager {
    private MovieList[] movies = new MovieList[0];

    public void add(MovieList movie) {
        MovieList[] tmp = new MovieList[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }

        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public MovieList[] findAll() {
        return movies;
    }

    private int lengthLimit = 10;

    public MovieManager(int lengthLimit) {

        this.lengthLimit = lengthLimit;
    }

    public MovieManager() {

    }

    public MovieList[] findLast() {
        int resultLength;
        if (lengthLimit < movies.length) {
            resultLength = lengthLimit;
        } else {
            resultLength = movies.length;
        }

        MovieList[] result = new MovieList[resultLength];
        for (int i = 0; i < resultLength; i++) {
            result[i] = movies[movies.length - 1 - i];
        }
        return result;
    }


}

