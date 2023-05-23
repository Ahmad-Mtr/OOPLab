package Inheritance_Practice;

public class Color extends Flower{
    private String name;

    public Color(String plantcode, String Fname, String Cname1) {
        super(plantcode, Fname);
        this.name = Cname1;
    }
    public void print(){System.out.println("Color Name: " + name);}

    public String toString(){
        System.out.println(super.toString() + ", " + name);
        return super.toString() + ", " + name;

    }


}
