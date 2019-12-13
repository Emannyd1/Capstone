package Model;

import java.io.Serializable;
import java.util.Objects;

public class Media implements Serializable {
    private String mName;
    private boolean forChildren;

    public Media(String name, boolean forChildren) {
        mName = name;
        this.forChildren = forChildren;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public boolean isForChildren() {
        return forChildren;
    }

    public void setForChildren(boolean forChildren) {
        this.forChildren = forChildren;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Media)) return false;
        Media media = (Media) o;
        return isForChildren() == media.isForChildren() &&
                getName().equals(media.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), isForChildren());
    }

}
