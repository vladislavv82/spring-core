package ru.akopian.spring;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

@Component//id
@Scope("singleton")
public class RockMusic implements Music{
    @PostConstruct
    public void doMyInit(){
        System.out.println("Inizilization");
    }
    @PreDestroy
    public void doMyDestroy(){
        System.out.println("Destroy");
    }
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
