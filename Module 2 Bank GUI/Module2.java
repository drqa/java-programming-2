import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.*;

public class Module2 implements ActionListener{
    
        public static void main(String[] args){
            JFrame bankFrame = new JFrame();

            JButton balanceBtn = new JButton("Set Balance");

            JPanel bankPanel = new JPanel();

            bankPanel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
            bankPanel.setLayout(new GridLayout(0, 1));
            bankPanel.add(balanceBtn);

            final int F_WIDTH = 250;
            final int F_HEIGHT = 250;
            bankFrame.add(bankPanel, BorderLayout.CENTER);
            bankFrame.setSize(F_WIDTH, F_HEIGHT);
            bankFrame.setTitle("Banking Frame");
            bankFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            bankFrame.setVisible(true);
        }

        public void actionPerformed(ActionEvent e){

        }
    }
