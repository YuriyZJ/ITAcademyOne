package Lesson18.T3Player;

public class FootballPlayer extends Player {
    public static final String ACTION = "Забиваю голы";

    public FootballPlayer(String name, String sportType) {
        super(name, sportType);
    }

    public String play() {
        return ACTION;
    }
}
