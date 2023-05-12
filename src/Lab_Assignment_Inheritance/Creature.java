package Lab_Assignment_Inheritance;

public class Creature {
    private int age;

    public Creature(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    public void print(){
        System.out.println("Creature\t"+ age);
    }
}
