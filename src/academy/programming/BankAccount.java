package academy.programming;

public class BankAccount {

    //fields
    private String account;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    //constructor
    public BankAccount() {
        this("56789", 2.50, "Default Name", "Default Email Address", "Default Phone");
        System.out.println("Empty constructor called");

    }

    public BankAccount(String account, double balance, String customerName,
                       String customerEmailAddress, String customerPhoneNumber) {
        System.out.println("Account contructor with parameters called");
        this.account = account;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public BankAccount(String customerName, String customerEmailAddress, String customerPhoneNumber) {
        this("9999", 100.55, customerName, customerEmailAddress, customerPhoneNumber );

    }

    // methods
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Deposit amount of " + depositAmount
                + " made. New balance is " + this.balance);
    }

    public void withdrawl(double withdrawlAmount) {
        if(this.balance - withdrawlAmount < 0) {
            System.out.println("Only " + this.balance + " available, not processed");
        } else {
            this.balance -= withdrawlAmount;
            System.out.println("Withdrawl of " + withdrawlAmount +
                    " processed. Remaining balace = " + this.balance);

        }
    }

}
