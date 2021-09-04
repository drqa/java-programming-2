import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;


public class VehicleSort{

    public static void main(String[] args) throws IOException{
       LinkedList vehicleList = new LinkedList();
       Scanner scan = new Scanner(System.in);
       File file = new File("vehicle.txt");
       FileWriter fw = new FileWriter(file);
       PrintWriter pw = new PrintWriter(fw);

       int numVehicles;

       System.out.println("How many vehicles do you want to enter? ");
       numVehicles = Integer.parseInt(scan.nextLine());

       int x = 0;
       while(x < numVehicles){
           System.out.println("Enter Make: ");
           String make = scan.nextLine();
           System.out.println("Enter Model: ");
           String model = scan.nextLine();
           System.out.println("Enter MPG: ");
           boolean isDouble = true;
           double mpg = 0;
           try{
                mpg = Double.parseDouble(scan.nextLine());
           }
           catch (Exception E){
                isDouble = false;
           }
           while(isDouble == false){
                try{
                    System.out.println("MPG must be a number: ");
                    mpg = Double.parseDouble(scan.nextLine());
                    isDouble = true;
                }
                catch (Exception E){
                    isDouble = false;
                }
            }
           vehicleList.add(new Vehicle(make, model, mpg));
           x++;
       }

      vehicleList.head = vehicleList.mergeSort(vehicleList.head);
       
      LinkedList temp = vehicleList;
      while(temp.head != null){
          pw.println(temp.head.data.toString());
          temp.head = temp.head.next;
      }
       
      scan.close();
      pw.close();
    }
}