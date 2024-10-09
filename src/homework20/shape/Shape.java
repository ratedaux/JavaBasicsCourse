package homework20.shape;

public class Shape {

    private String name;

    public Shape(String name) {
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String displayInfo(){
        return "Shape name: " + name;
    }


}
