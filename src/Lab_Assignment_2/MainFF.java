package Lab_Assignment_2;

public class MainFF {
    public static void main(String args[]){
        System.out.println("Hellow Wolrds!");
        Person Ahmad = new Person("Ahmad","07772", "Amman");
        Person Nokia630 = new Person("Nokia", "5555", "Beijing" );
        House MyHouse = new House(25, 5, 150);
        House DatHouse =new House(10,3,200);

        Nokia630.rentHouse(MyHouse);
        Ahmad.buyHouse(MyHouse);
        Ahmad.rentHouse(DatHouse);

        Ahmad.printHouse();
        Ahmad.printRentedHouse();

        System.out.println();
        MyHouse.printAllInformation();


    }
}
