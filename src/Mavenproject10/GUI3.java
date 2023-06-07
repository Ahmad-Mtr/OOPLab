package Mavenproject10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI3 implements ActionListener {

    private JFrame f1;
    private JPanel p1;
    private JButton b1, b2, b3, b4;
    private JLabel l1, l2, l3;
    private JTextField t1, t2, t3;

    public void m1() {

        //1
        f1 = new JFrame("Cal");
        f1.setSize(300, 200);

        //2
        p1 = new JPanel();

        b1 = new JButton("+");
        b2 = new JButton("-");
        b3 = new JButton("*");
        b4 = new JButton("/");

        l1 = new JLabel("A:");
        l2 = new JLabel("B:");
        l3 = new JLabel("Result:");

        t1 = new JTextField("");
        t2 = new JTextField("");
        t3 = new JTextField("");

        //3
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

        //4
        p1.setLayout(new GridLayout(5, 2));

        p1.add(l1);
        p1.add(t1);
        p1.add(l2);
        p1.add(t2);
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        p1.add(b4);
        p1.add(l3);
        p1.add(t3);

        f1.getContentPane().add(p1);

        //5
        f1.setVisible(true);

    }

    public static void main(String[] args) {
        GUI3 J = new GUI3();
        J.m1();
    }

    public void actionPerformed(ActionEvent e) {

        String a = t1.getText();
        String b = t2.getText();

        if (a.equals("") || b.equals("")) {
            JOptionPane.showMessageDialog(f1, "Error!");
        } else {

            if (e.getSource() == b1) {

                double x = Double.parseDouble(a);
                double y = Double.parseDouble(b);

                double z = x + y;

                String h = String.valueOf(z);

                t3.setText(h);

            }

            if (e.getSource() == b2) {

                double x = Double.parseDouble(a);
                double y = Double.parseDouble(b);

                double z = x - y;

                String h = String.valueOf(z);

                t3.setText(h);

            }

            if (e.getSource() == b3) {

                double x = Double.parseDouble(a);
                double y = Double.parseDouble(b);

                double z = x * y;

                String h = String.valueOf(z);

                t3.setText(h);

            }

            if (e.getSource() == b4) {

                double x = Double.parseDouble(a);
                double y = Double.parseDouble(b);

                double z = x / y;

                String h = String.valueOf(z);

                t3.setText(h);

            }
        }
    }
}
