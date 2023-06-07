package Mavenproject10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI2 implements ActionListener {

    private JFrame f1;
    private JPanel p1;
    private JButton b[];
    private JLabel l1;
    private JTextField t1;

    public void m1() {

        //1
        f1 = new JFrame("Telephone");
        f1.setSize(300, 300);

        //2
        p1 = new JPanel();
        b = new JButton[12];

        b[0] = new JButton("1");
        b[1] = new JButton("2");
        b[2] = new JButton("3");
        b[3] = new JButton("4");
        b[4] = new JButton("5");
        b[5] = new JButton("6");
        b[6] = new JButton("7");
        b[7] = new JButton("8");
        b[8] = new JButton("9");
        b[9] = new JButton("*");
        b[10] = new JButton("0");
        b[11] = new JButton("#");

        l1 = new JLabel("Number to dial");
        t1=new JTextField("");

        //3
        for(int i=0;i<12;i++)
        b[i].addActionListener(this);
       

        //4
        p1.setLayout(new GridLayout(5,3));
        
        for(int i=0;i<12;i++)
        p1.add(b[i]);
    
        p1.add(l1);
        p1.add(t1);
        
        
        f1.getContentPane().add(p1);

        //5
        f1.setVisible(true);

    }

    public static void main(String[] args) {
        GUI2 J = new GUI2();
        J.m1();
    }

    public void actionPerformed(ActionEvent e) {
        String x= t1.getText();
        if(e.getSource()==b[0]){
        x=x+"1";
        t1.setText(x);
        }
        if(e.getSource()==b[1]){
        x=x+"2";
        t1.setText(x);
        }
        if(e.getSource()==b[2]){
        x=x+"3";
        t1.setText(x);
        }
        if(e.getSource()==b[3]){
        x=x+"4";
        t1.setText(x);
        }
        if(e.getSource()==b[4]){
        x=x+"5";
        t1.setText(x);
        }
        if(e.getSource()==b[5]){
        x=x+"6";
        t1.setText(x);
        }
        if(e.getSource()==b[6]){
        x=x+"7";
        t1.setText(x);
        }
        if(e.getSource()==b[7]){
        x=x+"8";
        t1.setText(x);
        }
        if(e.getSource()==b[8]){
        x=x+"9";
        t1.setText(x);
        }
        if(e.getSource()==b[9]){
        x=x+"*";
        t1.setText(x);
        }
        if(e.getSource()==b[10]){
        x=x+"0";
        t1.setText(x);
        }
        if(e.getSource()==b[11]){
        JOptionPane.showMessageDialog(f1,"Dialing: " + x);
        }

    }

}
