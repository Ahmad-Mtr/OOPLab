package Mavenproject10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI8 implements ActionListener {

    private JFrame frame;
    private JPanel _Panel, _Panel_2, _Panel_3, _Panel_4, _Panel_5;
    private JButton button1, button2, button3;
    private JLabel label1, label2, label3;
    private TextField _TField1, _TField2, _TField3;
    private JMenuBar _MenuBar;
    private JMenu Menu1, Menu2;
    private JMenuItem Item1, Item2, Item3;
    private String x1, x2, x3;
    private String _Cnst1 = "Ali", _Cnst2 = "cs", _Cnst3 = "Jordan";

    private int c = 0;

    public void m1() {

        //1
        frame = new JFrame("LabFinal");
        frame.setSize(400, 200);

        //2
        _Panel = new JPanel();
        _Panel_2 = new JPanel();
        _Panel_3 = new JPanel();
        _Panel_4 = new JPanel();
        _Panel_5 = new JPanel();
        button1 = new JButton("Save");
        button2 = new JButton("Cancel");
        button3 = new JButton("Print");
        label1 = new JLabel("First Name");
        label2 = new JLabel("Name");
        label3 = new JLabel("Country");
        _TField1 = new TextField(_Cnst1);
        _TField2 = new TextField(_Cnst2);
        _TField3 = new TextField(_Cnst3);
        _MenuBar = new JMenuBar();
        Menu2 = new JMenu("About");
        Menu1 = new JMenu("Data");
        Item1 = new JMenuItem("Set ID");
        Item2 = new JMenuItem("Delete");
        Item3 = new JMenuItem("About");

        //3
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        Item1.addActionListener(this);
        Item2.addActionListener(this);
        Item3.addActionListener(this);

        //4
        _Panel.setLayout(new GridLayout(5, 1));
        _Panel_2.setLayout(new GridLayout(1, 2));
        _Panel_3.setLayout(new GridLayout(1, 2));
        _Panel_4.setLayout(new GridLayout(1, 2));
        _Panel_5.setLayout(new GridLayout(1, 3));

        Menu1.add(Item1);       // MenuBar --> Menu --> Menu Item
        Menu1.add(Item2);       // Add Items to Menu
        Menu2.add(Item3);

        _MenuBar.add(Menu1);    // Add Menus --> MenuBar
        _MenuBar.add(Menu2);

        _Panel.add(_MenuBar);   // Add MenuBar --> to its Panel

        _Panel_2.add(label1);   // Add Other Components to their Labels
        _Panel_2.add(_TField1);

        _Panel_3.add(label2);
        _Panel_3.add(_TField2);

        _Panel_4.add(label3);
        _Panel_4.add(_TField3);

        _Panel_5.add(button1);
        _Panel_5.add(button2);
        _Panel_5.add(button3);

        _Panel.add(_Panel_2);   // Add Panels to the main Panel ( The one that has the MenuBar)
        _Panel.add(_Panel_3);
        _Panel.add(_Panel_4);
        _Panel.add(_Panel_5);

        frame.getContentPane().add(_Panel); //Add that Panel with all Components to the Frame

        //
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        GUI8 J = new GUI8();
        J.m1();
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == button1) {
            x1 = _TField1.getText();
            x2 = _TField2.getText();
            x3 = _TField3.getText();
        }

        if (e.getSource() == button2) {
            _TField1.setText((x1));
            _TField2.setText((x2));
            _TField3.setText((x3));
        }

        if (e.getSource() == button3) {
            x1 = _TField1.getText();
            x2 = _TField2.getText();
            x3 = _TField3.getText();
            System.out.println(x1);
            System.out.println(x2);
            System.out.println(x3);
        }

        if (e.getSource() == Item1) {
            _TField1.setText((_Cnst1));
            _TField2.setText((_Cnst2));
            _TField3.setText((_Cnst3));
        }

        if (e.getSource() == Item2) {
            x1 = "";
            x2 = "";
            x3 = "";
        }

        if (e.getSource() == Item3) {
            JOptionPane.showMessageDialog(frame, "Final-lab");
        }

    }

}
