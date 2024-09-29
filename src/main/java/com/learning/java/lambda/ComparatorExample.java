package com.learning.java.lambda;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class ComparatorExample {
    public static void main(String[] args) {
        List<Movie> movies = List.of(
            new Movie("a", 10),
            new Movie("c", 40),
            new Movie("c", 30),
            new Movie("b", 20)
        );
        Function<Movie, String> keyExtractor1 = Movie::getTitle;
        Function<Movie, Integer> keyExtractor2 = Movie::getLikes;
        movies.stream()
            .sorted(Comparator.comparing(keyExtractor1).thenComparing(keyExtractor2))
            .forEach(System.out::println);
    }
}


class Movie {
    private String title;
    private int likes;

    @Override
    public String toString() {
        return "Movie{" +
            "title='" + title + '\'' +
            ", likes=" + likes +
            '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public Movie(String title, int likes) {
        this.title = title;
        this.likes = likes;
    }
}
