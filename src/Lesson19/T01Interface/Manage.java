package Lesson19.T01Interface;

/*Playable Media

Интерфейс: воспроизводится с помощью методов play(), pause(), stop(), and rewind().
Классы, реализующие интерфейс: MP3, Video, Podcast.
Каждый класс должен предоставлять собственную реализацию методов.*/

public interface Manage {
    String play();
    String pause();
    String stop();
    String rewind();
}
