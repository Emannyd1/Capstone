package Model;

public class TV extends Media {
  private String mRating;
    private int mTime;

    public TV(String rating, int time) {
        //super()
        mRating = rating;
        mTime = time;
    }

    public String getRating() {
        return mRating;
    }

    public void setRating(String rating) {
        mRating = rating;
    }

    public int getTime() {
        return mTime;
    }

    public void setTime(int time) {
        mTime = time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TV)) return false;
        TV TV = (TV) o;
        return mTime == TV.mTime &&
                mRating.equals(TV.mRating);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mRating, mTime);
    }
}

