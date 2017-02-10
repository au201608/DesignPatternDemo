package PrototypePattern;

/**
 * Created by thuang on 2/7/17.
 */
public class AuthorizedSignatory implements Cloneable {
    private String name;
    private String Designation;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "[AuthorizedSignatory: Name - " + getName() + ", Designation - " + getDesignation() + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String designation) {
        Designation = designation;
    }
}
