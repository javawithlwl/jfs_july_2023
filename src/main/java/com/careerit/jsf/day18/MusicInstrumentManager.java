package com.careerit.jsf.day18;

class MusicInstrument{
     String brand="Yamaha";
     public void play(){
        System.out.println("Playing music instrument");
    }
}
class Guitar extends MusicInstrument{
    String brand="Gibson";
    @Override
    public void play(){
        System.out.println("Playing Guitar");
     }
}
class Piano extends MusicInstrument{
    String brand="Yamaha";
    @Override
    public void play(){
        System.out.println("Playing Piano");
    }
}
class Flute extends MusicInstrument{
    @Override
    public void play(){
        System.out.println("Playing Flute");
    }
}
enum InstrumentType{
    GUITAR,PIANO,FLUTE;
}
public class MusicInstrumentManager {

    public static void main(String[] args) {

            MusicInstrument obj = getInstrument(InstrumentType.GUITAR);
            System.out.println(obj.brand);
            obj.play();

    }
    // Factory method
    public static MusicInstrument getInstrument(InstrumentType type){
        return switch (type) {
            case GUITAR -> new Guitar();
            case PIANO -> new Piano();
            case FLUTE -> new Flute();
        };
    }
}
