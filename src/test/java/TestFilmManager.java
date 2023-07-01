import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestFilmManager {

    @Test
    public void findAllTest() {
        FilmManager manager = new FilmManager();

        manager.addMovie("Film1");
        manager.addMovie("Film2");
        manager.addMovie("Film3");

        String[] expected = {"Film1", "Film2", "Film3"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastMore5Test() {
        FilmManager manager = new FilmManager();

        manager.addMovie("Film1");
        manager.addMovie("Film2");
        manager.addMovie("Film3");
        manager.addMovie("Film4");
        manager.addMovie("Film5");
        manager.addMovie("Film6");


        String[] expected = {"Film6", "Film5", "Film4", "Film3", "Film2"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastLess5Test() {
        FilmManager manager = new FilmManager();

        manager.addMovie("Film1");
        manager.addMovie("Film2");
        manager.addMovie("Film3");



        String[] expected = {"Film3", "Film2", "Film1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastLess5LimitChangeTest() {
        FilmManager manager = new FilmManager(2);

        manager.addMovie("Film1");
        manager.addMovie("Film2");
        manager.addMovie("Film3");



        String[] expected = {"Film3", "Film2"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

}
