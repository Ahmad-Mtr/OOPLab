package Mavenproject10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI8 implements ActionListener {

    private JFrame f1;
    private JPanel p, p2, p3, p4, p5;
    private JButton b1, b2, b3;
    private JLabel l1, l2, l3;
    private TextField t1, t2, t3;
    private JMenuBar mb1;
    private JMenu m1, m2;
    private JMenuItem i1, i2, i3;
    private String x1, x2, x3;
    private String c1 = "Ali", c2 = "cs", c3 = "Jordan";

    private int c = 0;

    public void m1() {

        //1
        f1 = new JFrame("LabFinal");
        f1.setSize(400, 200);

        //2
        p = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        p4 = new JPanel();
        p5 = new JPanel();
        b1 = new JButton("Save");
        b2 = new JButton("Cancel");
        b3 = new JButton("Print");
        l1 = new JLabel("First Name");
        l2 = new JLabel("Name");
        l3 = new JLabel("Country");
        t1 = new TextField(c1);
        t2 = new TextField(c2);
        t3 = new TextField(c3);
        mb1 = new JMenuBar();
        m2 = new JMenu("About");
        m1 = new JMenu("Data");
        i1 = new JMenuItem("Set ID");
        i2 = new JMenuItem("Delete");
        i3 = new JMenuItem("About");

        //3
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        i1.addActionListener(this);
        i2.addActionListener(this);
        i3.addActionListener(this);

        //4
        p.setLayout(new GridLayout(5, 1));
        p2.setLayout(new GridLayout(1, 2));
        p3.setLayout(new GridLayout(1, 2));
        p4.setLayout(new GridLayout(1, 2));
        p5.setLayout(new GridLayout(1, 3));

        m1.add(i1);
        m1.add(i2);
        m2.add(i3);

        mb1.add(m1);
        mb1.add(m2);

        p.add(mb1);

        p2.add(l1);
        p2.add(t1);

        p3.add(l2);
        p3.add(t2);

        p4.add(l3);
        p4.add(t3);

        p5.add(b1);
        p5.add(b2);
        p5.add(b3);

        p.add(p2);
        p.add(p3);
        p.add(p4);
        p.add(p5);

        f1.getContentPane().add(p);

        //
        f1.setVisible(true);

    }

    public static void main(String[] args) {
        GUI8 J = new GUI8();
        J.m1();
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == b1) {
            x1 = t1.getText();
            x2 = t2.getText();
            x3 = t3.getText();
        }

        if (e.getSource() == b2) {
            t1.setText((x1));
            t2.setText((x2));
            t3.setText((x3));
        }

        if (e.getSource() == b3) {
            x1 = t1.getText();
            x2 = t2.getText();
            x3 = t3.getText();
            System.out.println(x1);
            System.out.println(x2);
            System.out.println(x3);
        }

        if (e.getSource() == i1) {
            t1.setText((c1));
            t2.setText((c2));
            t3.setText((c3));
        }

        if (e.getSource() == i2) {
            x1 = "";
            x2 = "";
            x3 = "";
        }

        if (e.getSource() == i3) {
            JOptionPane.showMessageDialog(f1, "Final-lab");
        }

    }

}
