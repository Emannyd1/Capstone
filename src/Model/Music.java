package Model;

import java.util.Objects;

public class Music extends Media {
    private String mArtist;
    private String mAlbum;

    public Music(String name, boolean forChildren, String artist, String album) {
        super(name, forChildren);
        mArtist = artist;
        mAlbum = album;
    }

    public String getArtist() {
        return mArtist;
    }

    public void setArtist(String artist) {
        mArtist = artist;
    }

    public String getAlbum() {
        return mAlbum;
    }

    public void setAlbum(String album) {
        mAlbum = album;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Music)) return false;
        if (!super.equals(o)) return false;
        Music music = (Music) o;
        return getArtist().equals(music.getArtist()) &&
                getAlbum().equals(music.getAlbum());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getArtist(), getAlbum());
    }
}

