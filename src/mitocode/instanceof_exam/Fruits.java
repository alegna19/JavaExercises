package mitocode.instanceof_exam;

public class Fruits {

    private String name;

    public Fruits(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Fruits{" +
                "name='" + name + '\'' +
                '}';
    }
}
