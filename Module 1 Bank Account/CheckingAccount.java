//CheckingAccount is a subclass of BankAccount. In additon to BankAccounts properties it has a interestRate property as well.
class CheckingAccount extends BankAccount{
    double interestRate = .04;

    public CheckingAccount() {

    }

    public CheckingAccount(String firstName, String lastName, int accountID, double balance, double interestRate){
        super(firstName, lastName, accountID, balance);
        setInterestRate(interestRate);

    }
    //function to add a $30 fee is the account balance goes below 0
    public void processWithdrawal() {
        withdrawal();

        if(balance < 0) {
            balance -= 30;
            System.out.println("You have overdrawn your account. A $30 fee has also been deducted from your account" + "\n" + "Your account balance is now: " + balance);
           ;
        }
        else {
            System.out.print("Your current account balance is: " + getBalance());

        }
    }

    public String displayAccount(){
        String temp = "";

        temp = temp + "Name: " + getFirstName() + " " + getLastName() + "\n";
        temp = temp + "Account ID: " + getAccountID() + "\n";
        temp = temp + "Balance: " + getBalance() + "\n";
        temp = temp + "Interest Rate: " + getInterestRate() + "\n";

        return(temp);
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestRate(){
        return interestRate;
    }


}