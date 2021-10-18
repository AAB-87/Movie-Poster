package ru.netology.manager;

import ru.netology.domain.MoviePoster;


public class MovieManager {
    private MoviePoster[] movies = new MoviePoster[0];
    private int numberOfMoviesDisplayed = 10;

    public MovieManager(int numberOfMoviesDisplayed) { // конструктор с параметром, берущий значение лимита для менеджера из параметра конструктора
        this.numberOfMoviesDisplayed = numberOfMoviesDisplayed;
    }

    public MovieManager() { //конструктор  без параметров, выставляющий лимит менеджера в 10,
    }

    public void save(MoviePoster movie) { // Добавление нового фильма. Передаём его в параметром муфи в массив МувиПостер
        int length = movies.length + 1; // вычисляем и создаём новый массив размером на единицу больше
        MoviePoster[] tmp = new MoviePoster[length]; // создаём временный массив с новой длиной (на единицу больше)
        for (int i = 0; i < movies.length; i++) { // пишем логику копирования в новый массив
            tmp[i] = movies[i]; // заполняем новый массив.Копируем поэлементно старый массив в новый
        }
        int lastIndex = tmp.length - 1; // добавляем последний новый фильм
        tmp[lastIndex] = movie;
        movies = tmp; // в поле муфис запоминает тот адрес массива который лежит в тмп
    }

    public MoviePoster[] getAll() {  // перебираем массив в прямом порядке но кладём в результаты в обратном
        MoviePoster[] result = new MoviePoster[movies.length]; // создаем новый массив как мувис
        for (int i = 0; i < movies.length; i++) { // проходимся циклом, где i это новая ячейка. Для каждого i вычисляется ячейка старого массива
            int index = result.length - 1 - i; // в обратном порядке ячейка 0 для нового массива станет длина старой - 1 - i ( по умолчанию i = 0, но с каждым циклом увеличивается на 1 соответственно) А нам нужен размер нового массива на единицу меньше
            result[i] = movies[index]; // после заполнения нового массива, он
        }
        return result; // отдаёт в качестве результата все фильмы в обратном порядке
    }

    public MoviePoster[] findAll() { // возвращает массив весь
//        MoviePoster[] result = new MoviePoster[movies.length]; // создаем новый массив как мувис
        return movies;
//        for (int i = 0; i < result.length; i++) { // проходимся циклом, где i это новая ячейка. Для каждого i вычисляется ячейка старого массива
//            result[i] = movies[i];
//        }
//        return result; // отдаёт в качестве результата все фильмы
    }


    public MoviePoster[] showTheLastAddedMovies() { //Выдать последние 10 добавленных фильмов в обратном порядке
        int resultLength; // создаём целочисленную переменную в которую сохраним желаемый размер создаваемого массива
        if (movies.length < numberOfMoviesDisplayed) { //если фильмов меньше 10, то
            resultLength = movies.length; // выдаёте столько, сколько есть.
        } else { // если нет, то
            resultLength = numberOfMoviesDisplayed; // выдаётся сколько сколько заложено при создании менеджера
        }
        MoviePoster[] result = new MoviePoster[resultLength]; // создаём новый массив как резалтЛенф
        for (int i = 0; i < resultLength; i++) { // проходимся циклом, где i это новая ячейка. Для каждого i вычисляется ячейка старого массива
            int index = movies.length - 1 - i; // заполняем result из массива что лежит в поле
            result[i] = movies[index];// в обратном порядке

        }
        return result; // отдаёт в качестве результата все фильмы
    }
}
