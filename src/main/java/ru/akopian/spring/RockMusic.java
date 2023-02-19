package ru.akopian.spring;

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
