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
        } else
            Visibility = true;
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
            _DaButton[1] = new JButton("" + (1 + 1));
            _DaButton[2] = new JButton("" + (2 + 1));
            _DaButton[3] = new JButton(" - ");
            _DaButton[4] = new JButton("" + 4);
            _DaButton[5] = new JButton("" + 5);
            _DaButton[6] = new JButton("" + 6);
            _DaButton[7] = new JButton(" + ");
            _DaButton[8] = new JButton("" + 7);
            _DaButton[9] = new JButton("8");
            _DaButton[10] = new JButton("9");
            _DaButton[11] = new JButton("Hide/Show");
            _DaButton[12] = new JButton("/");
            _DaButton[13] = new JButton("0");
            _DaButton[14] = new JButton("*");
            _DaButton[15] = new JButton("Enter");

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
        // 5.2 Add action listeners to Buttons
        // 5.3 Setting Visibility   # Done
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
        if (e.getSource() == _DaButton[11]){
            if (Visibility){
                _TF_A.setEditable(false);
            }else
                _TF_A.setEditable(true);
            switchVisibility();
        }
        if (e.getSource() == _DaButton[0]) {

            if (_TF_A.isEditable()) {
                X += "1";
                _TF_A.setText(X);
            } else {
                Y += "1";
                _TF_B.setText(Y);
            }

        }
    }
}
