package Inheritance_Practice;

public class Flower extends Plant {
    private String name;

    public Flower(String plantcode, String name) {
        super(plantcode);
        this.name = name;
    }
    public String toString(){
        return super.toString() + ", " + name;
    }
    public void print(){System.out.println(name);}
}
