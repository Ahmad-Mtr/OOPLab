package GUI_Practice;

import java.awt.event.*;

import java.awt.*;
import java.awt.image.*;
import javax.swing.*;

public class GUI implements ActionListener {
    private JFrame DaFrame;                     //  #1 Declaring Compononets
    private JPanel DaPanel;
    private JLabel DaLabel;
    private JButton DaButton;
    private int c = 0;

    public void makeframe(){
        //  #2 initializing Components
        DaFrame = new JFrame("Assignment");
        DaPanel = new JPanel();
        DaLabel = new JLabel();
        DaButton = new JButton();
        //  #3 Registering Buttons
        DaButton.addActionListener(this);
        //  #4 Adding Components
        DaPanel.add(DaLabel);
        DaPanel.add(DaButton);
        DaFrame.getContentPane().add(DaPanel);
        //  #5 Setting size, DefCloseOper, Visibility,...
        DaFrame.setSize(500,300);
        DaPanel.setLayout(new GridLayout(2, 1));
        DaFrame.setDefaultCloseOperation(DaFrame.EXIT_ON_CLOSE);
        DaFrame.setVisible(true);
        //  #6 Implementing AL Methods
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == DaButton){
            c++;
            if (c==1)
                DaLabel.setText("Welcome");
            if (c==2)
                DaLabel.setText("GoodBye");
        }
    }
    public static void main (String[] arr){
        GUI x= new GUI();
        x.makeframe();
    }
}
