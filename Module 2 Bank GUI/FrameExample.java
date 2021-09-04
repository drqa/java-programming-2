import javax.swing.*;
import java.awt.event.*;

public class FrameExample implements ActionListener {

    //Add GUI components
    private JFrame myFrame;
    private JPanel myPanel;
    private JButton myButton;
    private JTextField displayClicks;

    int numClicks = 0;

    public FrameExample(){
        //Create new instances of each GUI component
        myFrame = new JFrame();
        myPanel = new JPanel();
        displayClicks = new JTextField(15);
        displayClicks.setText("Clicks: " + numClicks);
        displayClicks.setEditable(false);
        myButton = new JButton("CLICK ME");
        
        //Add an ActionListener to myButton that tracks the number of times it has been clicked
        myButton.addActionListener(
            new ActionListener() {
              public void actionPerformed(ActionEvent e) {
                numClicks+=1;
                displayClicks.setText("Clicks: " + numClicks);
            }
        }
        );
        //Add JTextField and JButton to JPanel
        myPanel.add(displayClicks);
        myPanel.add(myButton);

        //Add JPanel to JFrame and format the window
        myFrame.add(myPanel);
        myFrame.setSize(300, 100);
        myFrame.setTitle("Test");
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
    }

    public static void main(String[] args){
        new FrameExample();
    }

    public void actionPerformed(ActionEvent e){
        
    }
    
}
