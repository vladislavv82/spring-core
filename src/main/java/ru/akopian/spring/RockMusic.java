package ru.akopian.spring;

import org.springframework.stereotype.Component;

@Component//id
public class RockMusic implements Music{
    private RockMusic(){}
    public static RockMusic getRockMusic(){
        return new RockMusic();
    }
    public void doMyInit(){
        System.out.println("Doing my initialization");
    }
    public void doMyDestroy(){
        System.out.println("Doing my destriction");
    }
   @Override
    public String getSong() {
        return "Rock music";
    }
}
