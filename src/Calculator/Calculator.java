package Calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener {
    //0 Declaring the Components
    private JFrame _DaFrame;
    private JPanel _DaPanel;
    private JButton[] _DaButton;
    private JLabel _DaLabel_A, _DaLabel_B, _DaLabel_Result, _NullLabel;
    private JTextField _TF_A, _TF_B, _TF_Result;
    private Calc_Operations oper_x = new Calc_Operations();
    private String X = "";
    private String Y = "";
    private boolean Visibility = true;
    /////////////////////////////////////

    public boolean switchVisibility() {
        if (Visibility) {
            Visibility = false;
        } else Visibility = true;
        return Visibility;
    }

    public JFrame get_DaFrame() {
        return _DaFrame;
    }

    public JPanel get_DaPanel() {
        return _DaPanel;
    }

    public JButton[] get_DaButton() {
        return _DaButton;
    }

    public JLabel get_DaLabel_A() {
        return _DaLabel_A;
    }

    public JLabel get_DaLabel_B() {
        return _DaLabel_B;
    }

    public JTextField get_TF_A() {
        return _TF_A;
    }

    public JTextField get_TF_B() {
        return _TF_B;
    }

    public void set_TF_A(JTextField _TF_A) {
        this._TF_A = _TF_A;
    }

    public void set_TF_B(JTextField _TF_B) {
        this._TF_B = _TF_B;
    }

    public void set_TF_Result(JTextField _TF_Result) {
        this._TF_Result = _TF_Result;
    }

    public JLabel get_DaLabel_Result() {
        return _DaLabel_Result;
    }

    public JTextField get_TF_Result() {
        return _TF_Result;
    }

    /////////////////////////////////////////////////
    public void makeframe() {
        // 1 Creating the Components    # Done
        {
            _DaFrame = new JFrame("Caclulator");
            _DaPanel = new JPanel();
            _DaLabel_A = new JLabel("A:");
            _DaLabel_B = new JLabel("B:");
            _TF_A = new JTextField();
            _TF_B = new JTextField();
            _DaButton = new JButton[16];
            _DaLabel_Result = new JLabel("Result");
            _TF_Result = new JTextField();
            _NullLabel = new JLabel("");
        }
        // 2 Initializing the Comp.s    # Done
        {

            _DaButton[0] = new JButton("1");
            _DaButton[1] = new JButton("2");
            _DaButton[2] = new JButton("3");
            _DaButton[3] = new JButton(" - ");  // 3- 7+ 12/ 14* 15E
            _DaButton[4] = new JButton("4");
            _DaButton[5] = new JButton("5");
            _DaButton[6] = new JButton("6");
            _DaButton[7] = new JButton(" + ");
            _DaButton[8] = new JButton("7");
            _DaButton[9] = new JButton("8");
            _DaButton[10] = new JButton("9");
            _DaButton[11] = new JButton("Hide/Show");
            _DaButton[12] = new JButton("/");
            _DaButton[13] = new JButton("0");
            _DaButton[14] = new JButton("*");
            _DaButton[15] = new JButton("Backspace");

        }
        // 3 Regestring Buttons     # Done
        for (int i = 0; i < 16; i++) {
            _DaButton[i].addActionListener(this);
        }
        // 4 Adding to Panel to Frame   # Done
        add_Components();
        _DaFrame.getContentPane().add(_DaPanel);


        // 5.1 Setting Dimensions
        _DaFrame.setSize(1200, 1920);
        _DaPanel.setLayout(new GridLayout(6, 2));

        // 5.2 Setting Visibility   # Done
        _DaFrame.setVisible(true);
        // 6 Implementing the Methods
        // 7 Getting the Actions

    }

    public void add_Components() {
        _DaPanel.add(_DaLabel_A);
        _DaPanel.add(_TF_A);
        _DaPanel.add(_DaLabel_B);
        _DaPanel.add(_TF_B);
        _DaPanel.add(_DaButton[0]);
        _DaPanel.add(_DaButton[1]);
        _DaPanel.add(_DaButton[2]);
        _DaPanel.add(_DaButton[3]);
        _DaPanel.add(_DaButton[4]);
        _DaPanel.add(_DaButton[5]);
        _DaPanel.add(_DaButton[6]);
        _DaPanel.add(_DaButton[7]);
        _DaPanel.add(_DaButton[8]);
        _DaPanel.add(_DaButton[9]);
        _DaPanel.add(_DaButton[10]);
        _DaPanel.add(_DaButton[11]);
        _DaPanel.add(_DaButton[12]);
        _DaPanel.add(_DaButton[13]);
        _DaPanel.add(_DaButton[14]);
        _DaPanel.add(_DaButton[15]);
        _DaPanel.add(_NullLabel);
        _DaPanel.add(_DaLabel_Result);
        _DaPanel.add(_TF_Result);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       /* if (e.getSource() == _TF_A) {
            _TF_A.setEditable(true);
            _TF_B.setEditable(false);
        } else {
            _TF_A.setEditable(false);
            _TF_B.setEditable(true);
        }*/
        String field1 = _TF_A.getText();

        String field2 = _TF_B.getText();
//        if (field1.equals("") || field2.equals(""))
//            JOptionPane.showMessageDialog(_DaFrame, "Error, At least one field is empty");
//        else {

            if (e.getSource() == _DaButton[11]) {
                if (Visibility) {
                    _TF_A.setEditable(false);
                } else _TF_A.setEditable(true);
                switchVisibility();
            }
            // Visibility button

            else if (e.getSource() == _DaButton[0]) { // #1

                if (_TF_A.isEditable()) {
                    X += "1";
                    _TF_A.setText(X);
                } else {
                    Y += "1";
                    _TF_B.setText(Y);
                }

            } else if (e.getSource() == _DaButton[1]) { // #2

                if (_TF_A.isEditable()) {
                    X += "2";
                    _TF_A.setText(X);
                } else {
                    Y += "2";
                    _TF_B.setText(Y);
                }

            } else if (e.getSource() == _DaButton[2]) { // #3

                if (_TF_A.isEditable()) {
                    X += "3";
                    _TF_A.setText(X);
                } else {
                    Y += "3";
                    _TF_B.setText(Y);
                }

            } else if (e.getSource() == _DaButton[4]) { // #4

                if (_TF_A.isEditable()) {
                    X += "4";
                    _TF_A.setText(X);
                } else {
                    Y += "4";
                    _TF_B.setText(Y);
                }

            } else if (e.getSource() == _DaButton[5]) { // #5

                if (_TF_A.isEditable()) {
                    X += "5";
                    _TF_A.setText(X);
                } else {
                    Y += "5";
                    _TF_B.setText(Y);
                }

            } else if (e.getSource() == _DaButton[6]) { // #6

                if (_TF_A.isEditable()) {
                    X += "6";
                    _TF_A.setText(X);
                } else {
                    Y += "6";
                    _TF_B.setText(Y);
                }

            } else if (e.getSource() == _DaButton[8]) { // #7

                if (_TF_A.isEditable()) {
                    X += "7";
                    _TF_A.setText(X);
                } else {
                    Y += "7";
                    _TF_B.setText(Y);
                }

            } else if (e.getSource() == _DaButton[9]) { // #8

                if (_TF_A.isEditable()) {
                    X += "8";
                    _TF_A.setText(X);
                } else {
                    Y += "8";
                    _TF_B.setText(Y);
                }

            } else if (e.getSource() == _DaButton[10]) { // #9

                if (_TF_A.isEditable()) {
                    X += "9";
                    _TF_A.setText(X);
                } else {
                    Y += "9";
                    _TF_B.setText(Y);
                }

            } else if (e.getSource() == _DaButton[13]) { // # 0

                if (_TF_A.isEditable()) {
                    X += "0";
                    _TF_A.setText(X);
                } else {
                    Y += "0";
                    _TF_B.setText(Y);
                }

            }
            // 3- 7+ 12/ 14* 15E

            else if (e.getSource() == _DaButton[3]) { // # Subtraction
                double value1 = Double.parseDouble(field1);
                double value2 = Double.parseDouble(field2);

                double rrresult = oper_x.Subtraction(value1, value2);
                String Text_rrresult = String.valueOf(rrresult);

                _TF_Result.setText(Text_rrresult);

            } else if (e.getSource() == _DaButton[7]) { // # Addition
                double value1 = Double.parseDouble(field1);
                double value2 = Double.parseDouble(field2);

                double rrresult = oper_x.Addition(value1, value2);
                String Text_rrresult = String.valueOf(rrresult);

                _TF_Result.setText(Text_rrresult);

            } else if (e.getSource() == _DaButton[12]) { // # Division
                double value1 = Double.parseDouble(field1);
                double value2 = Double.parseDouble(field2);

                double rrresult = oper_x.Division(value1, value2);
                String Text_rrresult = String.valueOf(rrresult);

                _TF_Result.setText(Text_rrresult);

            } else if (e.getSource() == _DaButton[14]) { // # Multipication
                double value1 = Double.parseDouble(field1);
                double value2 = Double.parseDouble(field2);

                double rrresult = oper_x.Multiply(value1, value2);
                String Text_rrresult = String.valueOf(rrresult);

                _TF_Result.setText(Text_rrresult);

            } else {         // # backspace


                if (e.getSource() == _DaButton[15]) {
                    // Get the current text and caret position
                    if (_TF_A.isEditable()) {
                        field1 = _TF_A.getText();
                        int caretPosition = _TF_A.getCaretPosition();

                        if (caretPosition > 0) {
                            // Remove the character before the caret position
                            String modifiedText = field1.substring(0, caretPosition - 1) + field1.substring(caretPosition);
                            _TF_A.setText(modifiedText);

                            // Move the caret position back by one
                            _TF_A.setCaretPosition(caretPosition - 1);
                        }
                    } else {

                        field2 = _TF_B.getText();
                        int caretPosition = _TF_B.getCaretPosition();

                        if (caretPosition > 0) {
                            // Remove the character before the caret position
                            String modifiedText = field2.substring(0, caretPosition - 1) + field2.substring(caretPosition);
                            _TF_B.setText(modifiedText);

                            // Move the caret position back by one
                            _TF_B.setCaretPosition(caretPosition - 1);
                        }

                    }
                }
            }
        //}
    }
}
