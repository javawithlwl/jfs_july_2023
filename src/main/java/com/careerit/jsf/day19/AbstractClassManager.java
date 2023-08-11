package com.careerit.jsf.day19;

abstract class Game{
    public void start(){
        System.out.println(this.getClass().getSimpleName()+" game is going to start");
    }
    public abstract  void play();

    public void stop(){
        System.out.println(this.getClass().getSimpleName()+" game is going to stop");
    }

}
class Car extends  Game{
    @Override
    public void play() {
        System.out.println("You are playing car game, ensure player is wearing seat belt");
    }
}
class Bike extends  Game{
    @Override
    public void play() {
        System.out.println("You are playing bike game, ensure player is wearing helmet");
    }
}
class Ship extends  Game{
    @Override
    public void play() {
        System.out.println("You are playing ship game, ensure player is wearing life jacket");
    }
}
enum GameType{
    CAR,BIKE,SHIP;
}
public class AbstractClassManager {

    public static void main(String[] args) {
        Game obj = getGame(GameType.BIKE);
        obj.start();
        obj.play();
        obj.stop();
    }

    private static Game getGame(GameType gameType) {
        return switch (gameType) {
            case CAR -> new Car();
            case BIKE -> new Bike();
            case SHIP -> new Ship();
        };
    }
}
