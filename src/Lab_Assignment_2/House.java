package Lab_Assignment_2;

public class House {
    private int id;
    private int roomNb;
    private float rent;
    private Person owner;
    private Person tenant;

    public House(int id, int roomNb, float rent) {
        this.id = id;
        this.roomNb = roomNb;
        this.rent = rent;
        this.owner = null;
        this.tenant = null;
    }

    public void setRent(float rent) {
        this.rent = rent;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public void setTenant(Person tenant) {
        this.tenant = tenant;
    }

    public int getId() {
        return id;
    }

    public int getRoomNb() {
        return roomNb;
    }

    public float getRent() {
        return rent;
    }

    public Person getOwner() {
        return owner;
    }

    public Person getTenant() {
        return tenant;
    }

    // Other Methods:
    public void printHouseInformation() {
        System.out.println("ID/RoomNbs/Rent: " + id + "/" + roomNb + "/" + rent);
    }

    public void printOwnerInformation() {
        if (owner == null)
            System.out.println("There's no owner");
        else
            System.out.println(owner.getName() +"/" + owner.getPhoneNb() + "/" + owner.getAddress());
    }

    public void printTenantInformation() {
        if (tenant == null)
            System.out.println("TThe house isn't rent");
        else
            System.out.println(tenant.getName() +"/" + tenant.getPhoneNb() +"/" + tenant.getAddress());
    }

    public void printAllInformation() {
        printHouseInformation();
        printOwnerInformation();
        printTenantInformation();
    }
}
