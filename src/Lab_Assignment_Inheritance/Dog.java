package Lab_Assignment_Inheritance;

public class Dog extends Pet {
    private boolean familyDog;


    public Dog(int age, String name, boolean familyDog) {
        super(age, name);
        this.familyDog = familyDog;
    }

    public boolean isFamilyDog() {
        return familyDog;
    }
    public void print(){
        System.out.println("Dog:\t"+ familyDog);
    }
}
