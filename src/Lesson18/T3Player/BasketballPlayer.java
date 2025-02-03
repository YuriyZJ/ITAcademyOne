package Lesson18.T3Player;

public class BasketballPlayer extends Player {
    private static final String ACTOIN = "Забрасываю мяч в баскетбольное кольцо";

    public BasketballPlayer(String name, String sportType) {
        super(name, sportType);
    }

    @Override
    public String play() {
        return ACTOIN;
    }
}
