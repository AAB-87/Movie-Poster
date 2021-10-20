import org.junit.jupiter.api.Test;
import ru.netology.domain.MoviePoster;
import ru.netology.manager.MovieManager;
import org.junit.jupiter.api.BeforeEach;


import static org.junit.jupiter.api.Assertions.*;


class ManagerTest { // Подготовка начального состояния
//    public MovieManager manager = new MovieManager();

    private MoviePoster first = new MoviePoster(1, 151, "Бладшот");
    private MoviePoster second = new MoviePoster(2, 152, "Вперёд");
    private MoviePoster third = new MoviePoster(3, 153, "Отель Белград");
    private MoviePoster fourth = new MoviePoster(4, 154, "Джентельмены");
    private MoviePoster fifth = new MoviePoster(5, 155, "Человек-Невидимка");
    private MoviePoster sixth = new MoviePoster(6, 156, "Тролли");
    private MoviePoster seventh = new MoviePoster(7, 157, "Номер один");
    private MoviePoster eighth = new MoviePoster(8, 158, "Такси");
    private MoviePoster ninth = new MoviePoster(9, 159, "Судный день");
    private MoviePoster tenth = new MoviePoster(10, 160, "Неудержимые");
    private MoviePoster eleventh = new MoviePoster(11, 161, "Отступники");

//    @BeforeEach
//    public void setUp() {
//        manager.save(first);
//        manager.save(second);
//        manager.save(third);
//        manager.save(fourth);
//        manager.save(fifth);
//        manager.save(sixth);
//        manager.save(seventh);
//        manager.save(eighth);
//        manager.save(ninth);
//        manager.save(tenth);
//        manager.save(eleventh);
//    }

    @Test
    void shouldSaveMovies() {
        MovieManager manager = new MovieManager();
        manager.save(first);
        MoviePoster[] expected = new MoviePoster[]{first};
        MoviePoster[] actual = manager.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void getLast10Movies() {
        MovieManager manager = new MovieManager();

        manager.save(second);
        manager.save(third);
        manager.save(fourth);
        manager.save(fifth);
        manager.save(sixth);
        manager.save(seventh);
        manager.save(eighth);
        manager.save(ninth);
        manager.save(tenth);
        manager.save(eleventh);

        MoviePoster[] expected = new MoviePoster[]{eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};
        MoviePoster[] actual = manager.getAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void getLast5Movies() {
        MovieManager manager = new MovieManager();

        manager.save(seventh);
        manager.save(eighth);
        manager.save(ninth);
        manager.save(tenth);
        manager.save(eleventh);

        MoviePoster[] expected = new MoviePoster[]{eleventh, tenth, ninth, eighth, seventh};
        MoviePoster[] actual = manager.getAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void ifLessThan10Movies() {
        MovieManager manager = new MovieManager();

        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(fourth);

        MoviePoster[] expected = new MoviePoster[]{fourth, third, second, first};
        MoviePoster[] actual = manager.getAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void getLast8Movies() { // выдаёт меньше (8) чем есть (11)
        MovieManager manager = new MovieManager(8);

        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(fourth);
        manager.save(fifth);
        manager.save(sixth);
        manager.save(seventh);
        manager.save(eighth);
        manager.save(ninth);
        manager.save(tenth);
        manager.save(eleventh);

        MoviePoster[] expected = new MoviePoster[]{eleventh, tenth, eighth, ninth, seventh, sixth, fifth, fourth};
        MoviePoster[] actual = manager.showTheLastAddedMovies();

        assertArrayEquals(expected, actual);
    }
}


