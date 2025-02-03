package Lesson18.T3Player;

/*Базовый класс: Player с атрибутами name, sportType и методом play().
Производные классы: FootballPlayer, BasketballPlayer, TennisPlayer.
Каждый производный класс может переопределить метод play() для отображения сообщений, относящихся к конкретному виду спорта.
Создавайте объекты для каждого типа игроков и демонстрируйте их игровые действия.*/

import java.util.Objects;

public abstract class Player {
    private String name;
    private String sportType;

    public Player(){
    }

    public Player(String name, String sportType){
        this.name = name;
        this.sportType = sportType;
    }

    public String getName(){
        return name;
    }

    public void serName(String name){
        this.name = name;
    }

    public String getSportType() {
        return sportType;
    }

    public void setSportType(String sportType) {
        this.sportType = sportType;
    }

    public abstract String play();

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return Objects.equals(name, player.name) && Objects.equals(sportType, player.sportType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sportType);
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", sportType='" + sportType + '\'' +
                '}';
    }
}
