package FinalRev_CS214;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RadioButton implements ActionListener {
    static JRadioButton first;
    static JRadioButton second;
    static JTextField text;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Radio Button");
        frame.setSize(500, 500);
        frame.setBackground(Color.white);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Create a text field
        text = new JTextField();
        text.setBounds(0, 0, 500, 50);
        frame.add(text);
        //Creat two radio Buttons
        first = new JRadioButton("First");
        second = new JRadioButton("Second");
        first.setBounds(210, 100, 80, 60);
        second.setBounds(210, 200, 80, 60);
        frame.add(first);
        frame.add(second);
        //Create a radio Button Object
        RadioButton obj = new RadioButton();
        //Associate the radio buttons with ActionListener
        first.addActionListener(obj);
        second.addActionListener(obj);
        //Display the Frame
        frame.setVisible(true);
    }

    //Display the text of the selected Button
    public void actionPerformed(ActionEvent e) {
        String x = e.getActionCommand();
        if (x.equals("First")) {
            if (second.isSelected())
                second.setSelected(false);
        } else {
            if (first.isSelected())
                first.setSelected(false);
        }
        text.setText("The Button selected is: " + x);
    }
}