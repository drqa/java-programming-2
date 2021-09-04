import java.util.Scanner;
import java.util.Arrays;

public class RecursionPractice{

    public static void main(String[] args){

        int[] numArray = new int[5];
        System.out.println("Enter 5 numbers: ");
        getSum(0, numArray, 0);
    }

    public static void getSum(int n, int[] numArray, int sum) {
        Scanner scan = new Scanner(System.in);
        int i;
        if(n == 5) {
            System.out.println("Sum of all entered integers is: " + sum);
        } else {
           i = scan.nextInt();
           numArray[n] = i;  
           sum = sum + i;
           n++;
           getSum(n, numArray, sum);
        }
    }
}