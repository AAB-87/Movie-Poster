import ru.netology.domain.MoviePoster;
import ru.netology.manager.MovieManager;
import org.junit.jupiter.api.BeforeEach;


import static org.junit.jupiter.api.Assertions.*;

class MovieManagerTest {


    public class ManagerTest {

        public MovieManager manager = new MovieManager();

        private Movie first = new Movie(1, 151, "Бладшот");
        private Movie second = new Movie(2, 152, "Вперёд");
        private Movie third = new Movie(3, 153, "Отель Белград");
        private Movie fourth = new Movie(4, 154, "Джентельмены");
        private Movie fifth = new Movie(5, 155, "Человек-Невидимка");
        private Movie sixth = new Movie(6, 156, "Тролли");
        private Movie seventh = new Movie(7, 157, "Номер один");
        private Movie eighth = new Movie(8, 158, "Такси");
        private Movie ninth = new Movie(9, 159, "Судный день");
        private Movie tenth = new Movie(10, 160, "Неудержимые");


        @BeforeEach

        public void setUp() {
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

        }
    }

}