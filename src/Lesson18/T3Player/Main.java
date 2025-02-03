package Lesson18.T3Player;

/*Базовый класс: Player с атрибутами name, sportType и методом play().
Производные классы: FootballPlayer, BasketballPlayer, TennisPlayer.
Каждый производный класс может переопределить метод play() для отображения сообщений, относящихся к конкретному виду спорта.
Создавайте объекты для каждого типа игроков и демонстрируйте их игровые действия.*/

public class Main {
    public static void main(String[] args) {
        Player basketballPlayer = new BasketballPlayer("Abrams", "Basketball");
        Player tennisPlayer = new TennisPlayer("Mika", "Tennis");
        Player footballPlayer = new FootballPlayer("Zidan", "Football");

        basketballPlayer.play();
        System.out.println(basketballPlayer.getName() + "/" + basketballPlayer.getSportType() + "/" + basketballPlayer.play());
    }
}
