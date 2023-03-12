package ru.netology.poster;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerWithoutParameterTest {

    MoviesManager manager = new MoviesManager();

    MovieItem item1 = new MovieItem("Bloodshot", 2020, "action movie");
    MovieItem item2 = new MovieItem("Onward", 2019, "cartoon");
    MovieItem item3 = new MovieItem("Hotel Belgrade", 2020, "comedy");
    MovieItem item4 = new MovieItem("The Gentlemen", 2019, "action movie");
    MovieItem item5 = new MovieItem("The Invisible Man", 2020, "horror movie");
    MovieItem item6 = new MovieItem("Trolls World Tour", 2020, "cartoon");
    MovieItem item7 = new MovieItem("Number One", 2020, "comedy");


    @Test
    public void checkIfArrayIsEmptyTest() {
        MovieItem[] expected = {};
        MovieItem[] actual = manager.findAll();

        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void addOneMovieItemTest() {
        manager.addMovie(item1);

        MovieItem[] expected = {item1};
        MovieItem[] actual = manager.findAll();

        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void addAllMovieItemTest() {
        manager.addMovie(item1);
        manager.addMovie(item2);
        manager.addMovie(item3);
        manager.addMovie(item4);
        manager.addMovie(item5);
        manager.addMovie(item6);
        manager.addMovie(item7);

        MovieItem[] expected = {item1, item2, item3, item4, item5, item6, item7};
        MovieItem[] actual = manager.findAll();

        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void addSameMovieItemTest() {
        manager.addMovie(item1);
        manager.addMovie(item1);

        MovieItem[] expected = {item1, item1};
        MovieItem[] actual = manager.findAll();

        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void findLastMoreDefaultMovieItemTest() {
        manager.addMovie(item1);
        manager.addMovie(item2);
        manager.addMovie(item3);
        manager.addMovie(item4);
        manager.addMovie(item5);
        manager.addMovie(item6);
        manager.addMovie(item7);

        MovieItem[] expected = {item7, item6, item5, item4, item3};
        MovieItem[] actual = manager.findLast();

        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void findLastLessDefaultMovieItemTest() {
        manager.addMovie(item1);
        manager.addMovie(item2);
        manager.addMovie(item3);

        MovieItem[] expected = {item3, item2, item1};
        MovieItem[] actual = manager.findLast();

        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void findLastEqualDefaultMovieItemTest() {
        manager.addMovie(item1);
        manager.addMovie(item2);
        manager.addMovie(item3);
        manager.addMovie(item4);
        manager.addMovie(item5);

        MovieItem[] expected = {item5, item4, item3, item2, item1};
        MovieItem[] actual = manager.findLast();

        Assertions.assertArrayEquals(actual, expected);
    }
}
