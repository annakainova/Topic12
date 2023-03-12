package ru.netology.poster;

public class MoviesManager {

    private MovieItem[] movies = new MovieItem[0];
    private int lastMoviesCount;

    public MoviesManager() {
        lastMoviesCount = 5;
    }

    public MoviesManager(int lastMoviesCount) {
        this.lastMoviesCount = lastMoviesCount;
    }

    public void addMovie(MovieItem movie) {
        MovieItem[] tmp = new MovieItem[movies.length + 1];

        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }

        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public MovieItem[] findAll() {
        return movies;
    }

    public MovieItem[] findLast() {

        int resultLength = 0;

        if (movies.length < lastMoviesCount) {
            resultLength = movies.length;
        }
        else {
            resultLength = lastMoviesCount;
        }

        MovieItem[] last = new MovieItem[resultLength];
        for (int i = 0; i < last.length; i++) {
            last[i] = movies[movies.length - 1 - i];
        }
        return last;
    }
}
