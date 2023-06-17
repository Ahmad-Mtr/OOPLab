package FinalRev_CS214;

import javax.swing.*;

public class CheckBoxExample {
    CheckBoxExample() {
        JFrame myFrame =  new JFrame ("CheckBox Example ");

        JCheckBox pythonCheckBox  = new JCheckBox(" Python");
        pythonCheckBox.setBounds(100, 100, 90, 90);

        JCheckBox javaCheckBox = new JCheckBox("Java", true);
        javaCheckBox.setBounds(100, 190, 90, 90);

        myFrame.add(pythonCheckBox);
        myFrame.add(javaCheckBox);

        myFrame.setSize(400, 400);
        myFrame.setLayout(null);
        myFrame.setVisible(true);
    }
    public static void main(String[] arr){
        new CheckBoxExample();
    }
}
