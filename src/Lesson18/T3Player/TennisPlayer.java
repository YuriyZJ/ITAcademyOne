package Lesson18.T3Player;

public class TennisPlayer extends Player{
    public static final String ACTION = "Бегаю по корту с ракеткой";

    public TennisPlayer(String name, String sportType) {
        super(name, sportType);
    }

    public String play() {
        return ACTION;
    }
}
