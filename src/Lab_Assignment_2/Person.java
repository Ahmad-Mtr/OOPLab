package Lab_Assignment_2;

public class Person {
    private String name;
    private String phoneNb;
    private String address;
    private House rentedHouse;
    private House ownedHouse;

    public Person(String name, String phoneNb, String address) {
        this.name = name;
        this.phoneNb = phoneNb;
        this.address = address;
        this.ownedHouse = null;
        this.rentedHouse = null;
    }

    public String getName() {
        return name;
    }

    public House getRentedHouse() {
        return rentedHouse;
    }

    public House getOwnedHouse() {
        return ownedHouse;
    }

    public String getPhoneNb() {
        return phoneNb;
    }

    public void setPhoneNb(String phoneNb) {
        this.phoneNb = phoneNb;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Other Methods:
    public void rentHouse(House h) {
        h.setTenant(this);
        rentedHouse = h; // Added this to assign the new info for this field
    }

    public void buyHouse(House h) {
        h.setOwner(this);
        ownedHouse = h; // Added this to assign the new info for this field
    }

    public void printHouse() {
        if (ownedHouse != null) {
            ownedHouse.printAllInformation();
            System.out.println();
        } else {
            System.out.println("You don't own a house");
        }
    }

    public void printRentedHouse() {
        if (rentedHouse != null) {
            rentedHouse.printAllInformation();
            System.out.println();
        } else {
            System.out.println("You don't rent a house");
        }
    }
}
