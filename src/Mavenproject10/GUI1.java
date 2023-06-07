package Mavenproject10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI1 implements ActionListener {
    
    private JFrame f1;
    private JPanel p1;
    private JButton b1, b2;
    private JLabel l1;
    private int c = 0;

    public void m1() {

        //1
        f1 = new JFrame("Counter");
        f1.setSize(300, 100);

        //2
        p1 = new JPanel();
        b1 = new JButton("Increment");
        b2 = new JButton("Decrement");
        l1 = new JLabel("Value: 0");

        //3
        b1.addActionListener(this);
        b2.addActionListener(this);

        //4
        p1.add(l1);
        p1.add(b1);
        p1.add(b2);
        f1.getContentPane().add(p1);

        //
        f1.setVisible(true);

    }

    public static void main(String[] args) {
        GUI1 J = new GUI1();
        J.m1();
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == b1) {
            c++;
            l1.setText("Value: " + c);
        }

        if (e.getSource() == b2) {
            c--;
            l1.setText("Value: " + c);
        }

    }

}
