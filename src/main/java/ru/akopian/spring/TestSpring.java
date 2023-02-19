package ru.akopian.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        ); //конфигурационный файл
        RockMusic rockMusic = context.getBean("musicBean",RockMusic.class);
        System.out.println(rockMusic.getSong());

        //Music music = context.getBean("musicBean", Music.class);
        //MusicPlayer musicPlayer = new MusicPlayer(music);
        // выше внедряли зависимости вручную

        // здесь используем DI, Sping сам будет внедрять зависимость из контекста
//        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
//        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
//        boolean comparision = firstMusicPlayer == secondMusicPlayer;
//
//
//        System.out.println(comparision);
//        System.out.println(firstMusicPlayer);
//        System.out.println(secondMusicPlayer);

        //musicPlayer.playMusic();

        context.close();
    }
}
