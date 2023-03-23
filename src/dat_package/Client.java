package dat_package;

public class Client {
    private String name;
    private int id;
    private String address;
    private Account account;

    public Client(String name, int id, String address) {
        this.name = name;
        this.id = id;
        this.address = address;
        this.account = null;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Account getAccount() {
        return account;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void newAccount(int initialBalance) {
        account = new Account(12, initialBalance, this);
    }

    public void printClerkPhoneNb() {
        if (account.getClerk() != null) {
            System.out.println(account.getClerk().getName());
            System.out.println(account.getClerk().getPhoneNb());
        } else {
            System.out.println("Sorry there is no clerk assigned to your account");
        }
    }

    public void printBalance() {
        System.out.println(account.getBalance());
    }

    public void takeOffMoney(float sum) {
        if (account != null) {
            account.takeOff(sum);
            printBalance();
        } else {
            System.out.println("no account founded");
        }
    }

    public void payInMoney(float sum) {
        if (account != null) {
            account.payIn(sum);
            printBalance();
        } else {
            System.out.println("no account founded");
        }
    }

    public void setClerk(Clerk x) {
        if (account != null) {
            account.setClerk(x);
        } else {
            System.out.println("no account founded");
        }
    }

}
