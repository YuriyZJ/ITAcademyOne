package Lesson19.T01Interface;

/*Playable Media

Интерфейс: воспроизводится с помощью методов play(), pause(), stop(), and rewind().
Классы, реализующие интерфейс: MP3, Video, Podcast.
Каждый класс должен предоставлять собственную реализацию методов.*/

/*        Flying Abilities

Интерфейс: возможность полета с помощью методов takeOff(), land() и fly().
Классы, реализующие этот интерфейс: Bird, Airplane, Drone.
Каждый класс должен предоставить собственную реализацию этих методов.
*/


public class Main {
    public static void main(String[] args) {
        MediaFile mp3 = new MP3("Wife", "MP3");
        MediaFile video = new Video("Son", "Video");
        MediaFile podcast = new Podcast("Dote", "Podcast");

        System.out.println(mp3.play());
    }
}
