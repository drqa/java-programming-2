import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;  
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class MenuFrame implements ActionListener {
    
    private JFrame frame;
    private JPanel panel;
    private JMenuBar menuBar;
    private JMenu menu;
    private JMenuItem menuItem1;
    private JMenuItem menuItem2;
    private JMenuItem menuItem3;
    private JMenuItem menuItem4; 
    private JTextArea dateTime;
    private JTextField textF;
    String text;
    Random rand;
    private int hueLow = 170;
    private int hueHigh = 255;
    File file;
    FileWriter fw;
    PrintWriter pw;
    
    public MenuFrame() throws IOException{
        frame = new JFrame();
        panel = new JPanel();
        menuBar = new JMenuBar();
        menu = new JMenu("Menu");
        //Set formated date in text box when menuItem1 is pressed
        menuItem1 = new JMenuItem("Date & Time");
        menuItem1.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
                    LocalDateTime now = LocalDateTime.now(); 
                    dateTime.setText(dtf.format(now));
                }
            }
        );
        //Copy user text to a .txt file after menuItem2 is pressed
        menuItem2 = new JMenuItem("Text");
        menuItem2.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    text = textF.getText();
                    pw.println(text);
                    pw.close();
                }
            }
        );
        //Change background color of GUI to a random shade of green when menuItem3 is pressed
        menuItem3 = new JMenuItem("Random Green");
        menuItem3.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    panel.setBackground(new Color(rand.nextInt(90 / 2), rand.nextInt((hueHigh - hueLow) + hueLow) ,rand.nextInt(90 / 2)));
                }
            }
        );
        //Terminate the GUI when menuItem4 is pressed
        menuItem4 = new JMenuItem("Exit");
        menuItem4.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
                }
            }
        );

        //Arrange placement and size of various GUI elements
        dateTime = new JTextArea(1,15);
        dateTime.setEditable(false);
        textF =  new JTextField("Enter text here",15);
        rand = new Random();
        hueLow = 20;
        hueHigh = 255;
        file = new File("log.txt");
        fw = new FileWriter(file);
        pw = new PrintWriter(fw);
        
        //add all elements to the menu frame and panel
        menuBar.add(menu);
        menu.add(menuItem1);
        menu.add(menuItem2);
        menu.add(menuItem3);
        menu.add(menuItem4);
        
        panel.setLayout(new FlowLayout());
        panel.setVisible(true);
        panel.add(menuBar);
        panel.add(dateTime);
        panel.add(textF);

        frame.add(panel, BorderLayout.CENTER);
        frame.setSize(250, 250);
        frame.setTitle("Multiple Menu Options");
        //allow exit button to close the GUI
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(true);
        frame.setJMenuBar(menuBar);
    
    }
    //Create a new instance of MenuFrame
    public static void main(String[] args) throws IOException{
        new MenuFrame();
    }

    public void actionPerformed(ActionEvent e){
        
    }
}
