package _Rev;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger.*;

public class MenuThing implements ActionListener {
    private JFrame _Frame;
    private JMenuBar _MenuBar;
    private JMenu _Data, _About;
    private JMenuItem SetInitData, DeleteData, AboutItem;
    private JPanel _PanelMain, _Panel2, _Panel3, _Panel4, _Panel5;
    private JLabel VorName, NachName, Ort;
    private JTextField TF_VorName, TF_NachName, TF_Ort;
    private JButton save, cancel, print;
    private String tf1, tf2, tf3;
    private String cst1 = "Ahmad" ,cst2 = "Karajah", cst3 = "Sudan";

    public void make() {

        //1 Initializing COmponents
        _Frame = new JFrame("Menu Thing");
        _MenuBar = new JMenuBar();
        _Data = new JMenu("Data");
        _About = new JMenu("About");
        SetInitData = new JMenuItem("Set Initial Data");
        DeleteData = new JMenuItem("Delete Data");
        AboutItem = new JMenuItem("About");
        VorName = new JLabel("First Name");
        NachName = new JLabel("Family Name");
        Ort = new JLabel("Country");
        TF_VorName = new JTextField(cst1);  //
        TF_NachName = new JTextField(cst2);
        TF_Ort = new JTextField(cst3);
        save = new JButton("save");
        cancel = new JButton("cancel");
        print = new JButton("print");
        _PanelMain = new JPanel();
        _Panel2 = new JPanel();
        _Panel3 = new JPanel();
        _Panel4 = new JPanel();
        _Panel5 = new JPanel();

        // 3 Registring Buttons
        save.addActionListener(this);
        cancel.addActionListener(this);
        print.addActionListener(this);
        SetInitData.addActionListener(this);
        DeleteData.addActionListener(this);
        AboutItem.addActionListener(this);

        // 4 Setting Dimensions
        _Frame.setSize(400, 300);
        _PanelMain.setLayout(new GridLayout(5,2));
        _Panel2.setLayout(new GridLayout(1,2));
        _Panel3.setLayout(new GridLayout(1,2));
        _Panel4.setLayout(new GridLayout(1,2));
        _Panel5.setLayout(new GridLayout(1,3));
        // 5 Add-ADd-AdD-aDD
        _Data.add(SetInitData);
        _Data.add(DeleteData);
        _About.add(AboutItem);
        _MenuBar.add(_Data);
        _MenuBar.add(_About);
        _PanelMain.add(_MenuBar);
        //******************
        _Panel2.add(VorName);
        _Panel2.add(TF_VorName);
        _Panel3.add(NachName);
        _Panel3.add(TF_NachName);
        _Panel4.add(Ort);
        _Panel4.add(TF_Ort);
        _Panel5.add(save);
        _Panel5.add(cancel);
        _Panel5.add(print);
        //***********
        _PanelMain.add(_Panel2);
        _PanelMain.add(_Panel3);
        _PanelMain.add(_Panel4);
        _PanelMain.add(_Panel5);
        // 6
        _Frame.getContentPane().add(_PanelMain);
        _Frame.setDefaultCloseOperation(_Frame.EXIT_ON_CLOSE);
        _Frame.setVisible(true);
    }

    public static void main(String[] a) {
        MenuThing x = new MenuThing();
        x.make();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == save){
            tf1 = TF_VorName.getText();
            tf2 = TF_NachName.getText();
            tf3 = TF_Ort.getText();
        }
        if (e.getSource() == cancel){
            TF_VorName.setText(tf1);
            TF_NachName.setText(tf2);
            TF_Ort.setText(tf3);
        }
        if (e.getSource() == print){
            tf1 = TF_VorName.getText();
            tf2 = TF_NachName.getText();
            tf3 = TF_Ort.getText();
            System.out.println(tf1);
            System.out.println(tf2);
            System.out.println(tf3);
        }
        if (e.getSource() == SetInitData){
            TF_VorName.setText(cst1);
            TF_NachName.setText(cst2);
            TF_Ort.setText(cst3);
        }
        if (e.getSource() == DeleteData){
            tf1 = "";
            tf2 = "";
            tf3 = "";
        }
        if (e.getSource() == AboutItem){
            JOptionPane.showMessageDialog(_Frame, "ELEMENT OF SURPRISE!!!");
        }
    }
}
