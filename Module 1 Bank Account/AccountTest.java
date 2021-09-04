import java.util.Scanner;

public class AccountTest {
    
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String ans;
        //Create new instance of CheckingAccount object
        CheckingAccount account = new CheckingAccount("Daniel", "Ramirez", 123456789, 100, 0.04);
        //Set balance to 0
        account.constructor();

        System.out.println("-----------Account Information----------");
        System.out.println(account.displayAccount());
        System.out.println("-----------------------");

        System.out.print("Enter deposit amount: ");
        //Ask for and accept user deposit and apply it to the account balance
        account.deposit();

        System.out.print("Enter withdrawl amount: ");
        //Ask for and accept user withdrawal and deduct it from the account balance
        account.processWithdrawal();

        System.out.println("");
        //print account details if user input is "Y" or "y"
        System.out.print("Would you like to see a summary of your account? Y / N: ");
        ans = scan.nextLine();
        
        if(ans.equalsIgnoreCase("Y")){
            System.out.println("-----------Account Information----------");
            System.out.println(account.displayAccount());
        }
        else{
            System.out.println("Have a nice day!");
        }

        scan.close();
    }
}
