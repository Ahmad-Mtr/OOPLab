package Lab_Assignment_Inheritance;

public class Pet extends Animal {
    private String name;

    public Pet(int age, String name) {
        super(age);
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void print(){
        System.out.println("Pet\t"+ name);
    }
}
