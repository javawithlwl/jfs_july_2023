package com.careerit.jsf.day19;
import java.util.ArrayList;
import java.util.List;

interface MusicInstrument {
    void sound();
}
class Guitar implements MusicInstrument{
    @Override
    public void sound() {
        System.out.println("TIN TIN TIN TIN TIN");
    }
}
class Piano implements MusicInstrument{
    @Override
    public void sound() {
        System.out.println("PEEE PEEE PEEE PEEE PEEE");
    }
}
class Flute implements MusicInstrument{
    @Override
    public void sound() {
        System.out.println("TUU TUU TUU TUU TUU");
    }
}

public class MusicInstrumentManager {

    public static void main(String[] args) {
            List<MusicInstrument> musicInstruments = getInstruments(10);
            for(MusicInstrument obj:musicInstruments){
                obj.sound();
            }

    }
    public static List<MusicInstrument> getInstruments(int n){
        List<MusicInstrument> list = new ArrayList<>();
        for(int i=1;i<=10;i++){
            int num = (int)(Math.random()*3+1);
            MusicInstrument obj = switch (num) {
                case 1 -> new Guitar();
                case 2 -> new Piano();
                case 3 -> new Flute();
                default -> throw new IllegalStateException("Unexpected value: " + num);
            };
            list.add(obj);
        }
        return list;
    }
}
