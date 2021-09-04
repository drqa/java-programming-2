import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;

public class bankGUI implements ActionListener{
    //Creation of all GUI components
   private JFrame bankFrame;
   private JPanel bankPanel;

   private JLabel depositLabel;
   private JButton depositBtn1;
   private JButton depositBtn10;
   private JButton depositBtn100;

   private JLabel withdrawlLabel;
   private JButton withdrawlBtn1;
   private JButton withdrawlBtn10;
   private JButton withdrawlBtn100;

   private JTextField displayBalance;
    
   int balance;
    
    public bankGUI() {
        //get starting account balance from user
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter starting account balance: ");
        balance = scan.nextInt();

        //Create GUI Frame, Panels, Labels, and Buttons
        FlowLayout flow = new FlowLayout();
        bankFrame = new JFrame();
        bankPanel = new JPanel();
        bankPanel.setLayout(flow);
        depositLabel =  new JLabel("Enter amount to be deposited:");
        depositBtn1 = new JButton("Deposit $1");
        depositBtn1.addActionListener(
            new ActionListener() {
              public void actionPerformed(ActionEvent e) {
                balance = balance + 1;
                displayBalance.setText("Current Balance is: " + balance);
            }
        }
        );
        
        depositBtn10 = new JButton("Deposit $10");
        depositBtn10.addActionListener(
            new ActionListener() {
              public void actionPerformed(ActionEvent e) {
                balance = balance + 10;
                displayBalance.setText("Current Balance is: " + balance);
            }
        }
        );

        depositBtn100 = new JButton("Deposit $100");
        depositBtn100.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                  balance = balance + 100;
                  displayBalance.setText("Current Balance is: " + balance);
              }
          }
          );

        withdrawlLabel =  new JLabel("Enter amount to be withdrawn:");
        withdrawlBtn1 = new JButton("Withdrawal $1");
        withdrawlBtn1.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                  balance = balance  - 1;
                  displayBalance.setText("Current Balance is: " + balance);
              }
          }
          );
    

        withdrawlBtn10 = new JButton("Withdrawal $10");
        withdrawlBtn10.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                  balance = balance - 10;
                  displayBalance.setText("Current Balance is: " + balance);
              }
          }
          );

        withdrawlBtn100 = new JButton("Withdrawal $100");
        withdrawlBtn100.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                  balance = balance - 100;
                  displayBalance.setText("Current Balance is: " + balance);
              }
          }
          );
          //Format the layout of elements across the GUI
        displayBalance = new JTextField(15);
        displayBalance.setText("Current Balance is: " + balance);
        displayBalance.setEditable(false);

        bankPanel.add(depositLabel);
        bankPanel.add(depositBtn1, BorderLayout.CENTER);
        bankPanel.add(depositBtn10, BorderLayout.CENTER);
        bankPanel.add(depositBtn100, BorderLayout.CENTER);

        bankPanel.add(withdrawlLabel);
        bankPanel.add(withdrawlBtn1, BorderLayout.CENTER);
        bankPanel.add(withdrawlBtn10, BorderLayout.CENTER);
        bankPanel.add(withdrawlBtn100, BorderLayout.CENTER);

        bankPanel.add(displayBalance);

        bankFrame.add(bankPanel, BorderLayout.CENTER);
        bankFrame.setSize(600, 200);
        bankFrame.setTitle("Banking Frame");
        bankFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        bankFrame.setVisible(true);
        bankFrame.setResizable(true);

    }

    public static void main(String[] args){
        new bankGUI();
    }

    public void actionPerformed(ActionEvent e){
        
    }
}


