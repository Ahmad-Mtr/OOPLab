package Mavenproject10;

import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class GUI5 implements ActionListener {

    private JFrame f1;
    private JPanel p1;
    private JButton b1;
    private JTextArea t1;
    private FileReader fr;
    private BufferedReader br;

    public void m1() {

        //1
        f1 = new JFrame("Counter");
        f1.setSize(600, 300);

        //2
        p1 = new JPanel();
        b1 = new JButton("Read");
        t1 = new JTextArea();

        //3
        b1.addActionListener(this);

        //4
        p1.add(b1);
        p1.add(t1);
        f1.getContentPane().add(p1);

        //
        f1.setVisible(true);

    }

    public static void main(String[] args) {
        GUI5 J = new GUI5();
        J.m1();
    }

    public void actionPerformed(ActionEvent e) {
        String r = "";

        try {
            String x = "";

            fr = new FileReader("C:\\Users\\Student\\Pictures\\courses.txt");
            br = new BufferedReader(fr);

            while ((x = br.readLine()) != null) {
                r = r + x + "\n";
            }

        } catch (Exception ex) {
            Logger.getLogger(ReadFile.class.getName()).log(Level.SEVERE, null, ex);
        }

        t1.setText(r);

    }

}
