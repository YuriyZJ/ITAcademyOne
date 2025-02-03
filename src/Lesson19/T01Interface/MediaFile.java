package Lesson19.T01Interface;

/*Playable Media

Интерфейс: воспроизводится с помощью методов play(), pause(), stop(), and rewind().
Классы, реализующие интерфейс: MP3, Video, Podcast.
Каждый класс должен предоставлять собственную реализацию методов.*/

import java.util.Objects;

public abstract class MediaFile implements Manage{
    private String memberFamily;
    private String contentType;

    public MediaFile() {
    }

    public MediaFile(String memberFamily, String contentType) {
        this.memberFamily = memberFamily;
        this.contentType = contentType;
    }

    public String getMemberFamily() {
        return memberFamily;
    }

    public void setMemberFamily(String memberFamily) {
        this.memberFamily = memberFamily;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        MediaFile that = (MediaFile) o;
        return Objects.equals(memberFamily, that.memberFamily) && Objects.equals(contentType, that.contentType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(memberFamily, contentType);
    }

    @Override
    public String toString() {
        return "PlayableMedia{" +
                "memberFamily='" + memberFamily + '\'' +
                ", contentType='" + contentType + '\'' +
                '}';
    }
}
