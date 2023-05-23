package Lab_Assignment_Inheritance;

public class MyClass2 extends MyClass1{
    public MyClass2(int value) {
        super(value);
    }
    public int getNumber(){
        return super.getNumber();
    }
    public static void main(String[] args){
        MyClass2 _3mk = new MyClass2(24);
        System.out.println( _3mk.getNumber());
    }

}
