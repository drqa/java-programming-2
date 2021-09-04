import java.util.Scanner;

public class BankAccount {

    String firstName;
    String lastName;
    int accountID;
    double balance;
    Scanner scan = new Scanner(System.in);

    public BankAccount() {

    }

    public BankAccount(String firstName, String lastName, int accountID, double balance) {
        setFirstName(firstName);
        setLastName(lastName);
        setAccountID(accountID);
    }
//Initialize balance to 0
    public void constructor() {
        balance = 0;
    }
//define functions to accept desposits, withdrawals, and to print account details
    public void deposit() {
        balance += scan.nextDouble();
    }

    public void withdrawal() {
        balance -= scan.nextDouble();
    }

    public double getBalance() {
        return balance;
    }

    public String accountSummary() {
        String temp = "";

        temp = temp + "Name: " + getFirstName() + " " + getLastName() + "\n";
        temp = temp + "Account ID: " + getAccountID() + "\n";
        temp = temp + "Balance: " + getBalance() + "\n";

        return temp;
    }

    // setters and getters for firstName lastName and accountID
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public int getAccountID() {
        return accountID;
    }

}

