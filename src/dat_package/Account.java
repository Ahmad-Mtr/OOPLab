package dat_package;

public class Account {
    private int number;
    private float balance;
    private Client client;
    private Clerk clerk;

    public Account(int number, float balance, Client client) {
        this.number = number;
        this.balance = balance;
        this.client = client;
        this.clerk = null;
    }

    public float getBalance() {
        return balance;
    }

    public Clerk getClerk() {
        return clerk;
    }

    public void setClerk(Clerk clerk) {
        this.clerk = clerk;
    }

    public void payIn(float sum) {
        balance += sum;
    }

    public void takeOff(float sum) {
        if (balance > sum) {
            balance -= sum;
            System.out.println("Process done succesfuly");
        } else
            System.out.println("Error, not enough balance");
    }

}
