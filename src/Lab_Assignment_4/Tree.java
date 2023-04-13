package Lab_Assignment_4;

public class Tree {
    private String name;
    private String type;
    private boolean evergreen;
    private double height;
    private boolean fruitful;

    public Tree(String name, String type, boolean evergreen, double height, boolean fruitful) {
        this.name = name;
        this.type = type;
        this.evergreen = evergreen;
        this.height = height;
        this.fruitful = fruitful;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isEvergreen() {
        return evergreen;
    }

    public void setEvergreen(boolean evergreen) {
        this.evergreen = evergreen;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean isFruitful() {
        return fruitful;
    }

    public void setFruitful(boolean fruitful) {
        this.fruitful = fruitful;
    }

    public void Print() {
        System.out.println("Tree's Info:\n" + name + ", "+ type+ ", Height: "+ height+ ", is Evergreen: "+evergreen+ ", is fruitful: "+ fruitful);
    }

    public boolean CutTree() {
        //If the height of the Tree
        //is greater than 4 meters
        //and the Tree in not
        //fruitful nor evergreen,
        if (height > 4 && !isEvergreen() && !isFruitful()) {
            return true;
        } else return false;
    }
}