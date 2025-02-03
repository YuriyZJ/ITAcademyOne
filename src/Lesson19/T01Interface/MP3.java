package Lesson19.T01Interface;
            //есть или является
public class MP3 extends MediaFile{
    public static final String MP3PLAY = "Play mp3";
    public static final String MP3PAUSE = "Pause mp3";
    public static final String MP3STOP = "Stop mp3";
    public static final String MP3REWIND = "Rewind mp3";

    public MP3(String memberFamily, String contentType){
        super(memberFamily, contentType);
    }

    public String play(){
        return MP3PLAY;
    }

    public String pause(){
        return MP3PAUSE;
    }

    public String stop(){
        return MP3STOP;
    }

    public String rewind(){
        return MP3REWIND;
    }
}
