package Model;

import java.io.Serializable;
import java.util.Objects;

public class VideoGames extends Media implements Serializable {
    private String mESRB;
    private boolean mIsMultipler;

    public VideoGames(String name, boolean forChildren, String ESRB, boolean isMultipler) {
        super(name, forChildren);
        mESRB = ESRB;
        mIsMultipler = isMultipler;
    }

    public String getESRB() {
        return mESRB;
    }

    public void setESRB(String ESRB) {
        mESRB = ESRB;
    }

    public boolean isMultipler() {
        return mIsMultipler;
    }

    public void setMultipler(boolean multipler) {
        mIsMultipler = multipler;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof VideoGames)) return false;
        if (!super.equals(o)) return false;
        VideoGames that = (VideoGames) o;
        return isMultipler() == that.isMultipler() &&
                getESRB().equals(that.getESRB());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getESRB(), isMultipler());
    }

    @Override
    public String toString() {
        return "VideoGames{" +
                "mESRB='" + mESRB + '\'' +
                ", mIsMultipler=" + mIsMultipler +
                '}';
    }

}
