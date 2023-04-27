package Lab_Assignment_3;

/**
 * Write a description of class classAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Account {
    // instance variables - replace the example below with your own
    private int number;
    private float balance;
    private Client client;
    private Clerk clerk;

    private float credit;
    private String[] transactions;
    private int transactionNumber;

    /**
     * Constructor for objects of class classAccount
     */
    public Account(int number, float balance, Client client) {
        // initialise instance variables
        this.number = number;
        this.balance = balance;
        this.client = client;

        clerk = null;
        credit = 0;

        transactions = new String[5];
        transactionNumber = 0;
    }

    public Account(int number, float balance, Client client, float credit) {
        // initialise instance variables
        this.number = number;
        this.balance = balance;
        this.client = client;

        clerk = null;

        if (credit >= 0) this.credit = credit;
        else credit = 0;

        transactions = new String[5];
        transactionNumber = 0;
    }


    public int getNumber() {
        return number;
    }

    public Client getClient() {
        return client;
    }

    public Clerk getClerk() {
        return clerk;
    }

    public float getBalance() {
        return balance;
    }

    public void setClerk(Clerk clerk) {
        this.clerk = clerk;
    }

    public void PayIn(float sum) {
        balance += sum;
        ++transactionNumber;
        String transString = "PayIn: " + sum + ", new Balance: " + balance;
        insertTransaction(transString);
    }

    public boolean TakeOff(float sum) {
        if (balance - sum >= credit) {
            balance -= sum;
            transactionNumber++;
            String transString = "Take off: " + sum + ", new Balance: " + balance;
            insertTransaction(transString);
            return true;
        } else return false;
    }

    public float getCredit() {
        return credit;
    }

    public void setCredit(float c) {
        if (c >= 0) credit = c;
    }

    //  New Methods go Here
    public void insertTransaction(String Mansaf) {
        if (transactionNumber < transactions.length) {
            //the String is written in the array at position transactionNumber-1
            transactions[transactionNumber - 1] = Mansaf;
        } else {
            //InShort: move transactions to keep track of the new ones only :)
            //in a for loop the elements at [index 1 to (arraylength-1)] of the
            //array are copied to the 1st(index 0) to (arraylenth-1)th(index
            //arraylength – 2) position.
            for (int i = 0; i < transactions.length; i++) {
                transactions[i] = transactions[i + 1];
            }

            transactions[transactions.length - 1] = Mansaf;

            /*the String is written at index “arraylength-1” of the array*/
        }
    }

    public void printTransactions() {
        for (String s : transactions) {
            System.out.println(s);
        }
    }

}

