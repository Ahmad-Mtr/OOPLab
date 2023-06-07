package Mavenproject10;

import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class GUI6 implements ActionListener {

    private JFrame f1;
    private JPanel p1;
    private JButton b1;
    private JFileChooser fc;
    private FileReader fr;
    private BufferedReader br;

    public void m1() {

        //1
        f1 = new JFrame("Fc");
        f1.setSize(300, 100);

        //2
        p1 = new JPanel();
        b1 = new JButton("Select");
        fc = new JFileChooser();

        //3
        b1.addActionListener(this);

        //4
        p1.add(b1);
        f1.getContentPane().add(p1);

        //
        f1.setVisible(true);

    }

    public static void main(String[] args) {
        GUI6 J = new GUI6();
        J.m1();
    }

    public void actionPerformed(ActionEvent e) {
        fc.showOpenDialog(null);
        File r = fc.getSelectedFile();
        String p = r.getAbsolutePath();

        try {
            String x = "";

            fr = new FileReader(p);
            br = new BufferedReader(fr);
            while ((x = br.readLine()) != null) {
                System.out.println(x + "\n");
            }

        } catch (Exception ex) {
            Logger.getLogger(ReadFile.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
