package src.CoreJava;

public class Custmoer implements Comparable<Custmoer> {
    int ID;
    String Name;

    public Custmoer(int ID, String name) {
        this.ID = ID;
        this.Name = name;
    }

    @Override
    public String toString() {
        return "Custmoer{" +
                "ID=" + ID +
                ", Name='" + Name + '\'' +
                '}';
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public int compareTo(Custmoer o) {
        return Integer.compare(this.ID, o.ID);
    }
}
