import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.MovieList;
import ru.netology.MovieManager;

public class MovieManagerTest {
    MovieList movie1 = new MovieList("Бладшот");
    MovieList movie2 = new MovieList("Вперёд");
    MovieList movie3 = new MovieList("Отель Белград");
    MovieList movie4 = new MovieList("Джентльмены");
    MovieList movie5 = new MovieList("Человек-невидимка");
    MovieList movie6 = new MovieList("Тролли. Мировой тур");
    MovieList movie7 = new MovieList("Номер один");

    @Test
    public void shouldAddMovie() {
        MovieManager manager = new MovieManager();
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);

        MovieList[] expected = {movie1, movie2, movie3, movie4, movie5, movie6, movie7};
        MovieList[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastWithParameterBelowListLength() {
        MovieManager manager = new MovieManager(5);
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);

        manager.findLast();

        MovieList[] expected = {movie7, movie6, movie5, movie4, movie3};
        MovieList[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastWithParameterAboveListLength() {
        MovieManager manager = new MovieManager(15);
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);

        manager.findLast();

        MovieList[] expected = {movie7, movie6, movie5, movie4, movie3, movie2, movie1};
        MovieList[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastWithoutParameter() {
        MovieManager manager = new MovieManager();
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);

        manager.findLast();

        MovieList[] expected = {movie7, movie6, movie5, movie4, movie3, movie2, movie1};
        MovieList[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }


}
