package Lab_Assignment_Inheritance;

public class Person extends Creature{
    private String name;

    public Person(int age, String name) {
        super(age);
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void print(){
        System.out.println("Person\t"+ name);
    }
}
