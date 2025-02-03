package Lesson19.T01Interface;

public class Video extends MediaFile{
    public static final String VIDEOPLAY = "Stop video";
    public static final String VIDEOPAUSE = "Pause video";
    public static final String VIDEOSTOP = "Stop video";
    public static final String VIDEOREWIND = "Rewind video";

    public Video (String memberFamily, String contentType){
        super(memberFamily, contentType);
    }

    public String play(){
        return VIDEOPLAY;
    }

    public String pause(){
        return VIDEOPAUSE;
    }

    public String stop(){
        return VIDEOSTOP;
    }

    public String rewind(){
        return VIDEOREWIND;
    }
}

