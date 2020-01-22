package Prototype_T;

public abstract class Shape implements Cloneable {

    private String id;
    protected String type;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Object clone() {

        Object clone = null;

        try {
            clone = super.clone();

        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
        }
        return clone;
    }

    public abstract void draw();
}
