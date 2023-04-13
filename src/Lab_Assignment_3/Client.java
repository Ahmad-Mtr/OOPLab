package Lab_Assignment_3;

import java.util.ArrayList;

/**
 * Write a description of class Client here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Client {
    // instance variables - replace the example below with your own
    private String name;
    private int id;
    private String address;
    private int accountNumber;
    private ArrayList<Account> accounts;


    /**
     * Constructor for objects of class Client
     */
    public Client(int id, String name, String address) {
        // initialise instance variables
        this.id = id;
        this.name = name;
        this.address = address;
        accounts = new ArrayList<Account>();
        accountNumber = 1;

    }


    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Account getAccount(int maqlubah) {
        if (accounts.get(maqlubah) != null)
            return accounts.get(maqlubah);
        else
            return null;
    }

    public void newAccount(float InitialBalance)//ts now creates a new account (using accountNumber)
    {//and adds it to accounts. Then accountNumber is incremented.
        accounts.add(accountNumber, new Account(accountNumber, InitialBalance, this));
        accountNumber++;
    }

    public void printClerkPhoneNumber() {

        for (Account account : accounts) {
            if (account.getClerk() != null) {
                System.out.println("Account Num: " + account.getNumber());
                System.out.println(account.getClerk().getName() + " has phone number " + account.getClerk().getPhoneNb());
            } else
                System.out.println("Sorry, there is no clerk assigned to your account!");
        }
    }


    public void printBalance() {
        for (int i = 0; i < accounts.size(); i++) {
            System.out.println(accounts.get(i).getNumber());
            System.out.println("Balance is: " + accounts.get(i).getBalance());
        }
    }

    public void TakeOffMoney(float sum, int maqlubah) {
        if (accounts != null) { //if an account exists at all
            if (accounts.get(maqlubah) != null) { //  if an account at maqlubah(index) exists
                accounts.get(maqlubah).TakeOff(sum);
                printBalance();
            } else {
                System.out.println("Index d.n.e, using 1st Account...");
                accounts.get(0).TakeOff(sum);
                printBalance();
            }
        } else {
            System.out.println("accounts == null ;(");
        }
    }

    public void PayInMoney(float sum, int maqlubah) {
        if (accounts != null) { //if an account exists at all
            if (accounts.get(maqlubah) != null) { //  if an account at maqlubah(index) exists
                accounts.get(maqlubah).PayIn(sum);
                printBalance();
            } else {
                System.out.println("Index d.n.e, using 1st Account...");
                accounts.get(0).PayIn(sum);
                printBalance();
            }
        } else {
            System.out.println("accounts == null ;(");
        }
    }

    public void setClerk(Clerk c, int maqlubah) {
        if (accounts != null) { //if an account exists at all
            if (accounts.get(maqlubah) != null) { //  if an account at maqlubah(index) exists
                accounts.get(maqlubah).setClerk(c);
                printBalance();
            } else {
                System.out.println("Index d.n.e, using 1st Account...");
                accounts.get(0).setClerk(c);
                printBalance();
            }
        } else {
            System.out.println("accounts == null ;(");
        }
    }
}
