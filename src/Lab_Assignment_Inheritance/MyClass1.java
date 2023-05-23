package Lab_Assignment_Inheritance;

public abstract class MyClass1 implements MyInterface1{
    private int value;

    public MyClass1(int value) {
        this.value = value;
    }
    public int getNumber(){
        return value;
    }
    public void print(){
        System.out.println("MYclass1:\t"+ value);
    }

}
