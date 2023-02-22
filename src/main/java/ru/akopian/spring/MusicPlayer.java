package ru.akopian.spring;

import java.util.Random;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;



@Component
public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;
    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }
    private Music music1;
    private Music music2;

@Autowired
    public MusicPlayer(@Qualifier("rockMusic")Music music1,
                       @Qualifier("classicalMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public void playMusic(MusicGenre genre) {
        Random random = new Random();

        // случайное целое число между 0 и 2
        int randomNumber = random.nextInt(3);

        if (genre == MusicGenre.CLASSICAL) {
            // случайная классическая песня
            System.out.println(music1.getSongs().get(randomNumber));
        } else {
            // случайная рок песня
            System.out.println(music2.getSongs().get(randomNumber));
        }
    }
}