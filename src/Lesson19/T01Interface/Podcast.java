package Lesson19.T01Interface;

public class Podcast extends MediaFile{
    public static final String PlayableMediaPLAY = "Stop PlayableMedia";
    public static final String PlayableMediaPAUSE = "Pause PlayableMedia";
    public static final String PlayableMediaSTOP = "Stop PlayableMedia";
    public static final String PlayableMediaREWIND = "Rewind PlayableMedia";

    public Podcast(String memberFamily, String contentType){
        super(memberFamily, contentType);
    }

    public String play(){
        return PlayableMediaPLAY;
    }

    public String pause(){
        return PlayableMediaPAUSE;
    }

    public String stop(){
        return PlayableMediaSTOP;
    }

    public String rewind(){
        return PlayableMediaREWIND;
    }
}
