package ru.akopian.spring;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component//id
public class RockMusic implements Music{
    private ArrayList<String> songs = new ArrayList<>();

    // Блок инициализации объекта
    // Выполняется каждый раз, когда создается объект класса
    {
        songs.add("Wind cries Mary");
        songs.add("Paint it black");
        songs.add("Can't seem to make you mine");
    }

    @Override
    public List<String> getSongs() {
        return songs;
    }
}
