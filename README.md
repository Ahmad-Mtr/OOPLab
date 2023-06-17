# Object-oriented Programming 

##### Almost all of what I've written this Semester is here for CS214/0, Navigate to `src` Enjoy :)
## Important
    Keep Scrolling down for CS214 CheatSheet/Summary(Exceptions, Radio Buttons,...)

#### Some Notes:
1. Feel Free to Fork or Clone the Repository and Edit as u want.
2. In case there is any Problem in my Code or if you want to Contribute, you can use GitHub issues or pull requests (Assuming you know Github), If no,  U can reach out to me from the one who told you about this Repo.

## Iterator
_**Forward Iteration**_
* `itr.hasNext()` _true_ if there is a next element in the collection.
* `itr.hasNext()` Returns the next object.

_**Backward Iteration**_
* `itr.hasPrevious()` _true_ if there is a previous element.
* `itr.previous()` Returns the previous element.

_**Getting the Index of an Element**_
* `itr.nextIndex()` Returns index of element that would be returned by subsequent call to next().
* `itr.previousIndex()` 


## Sets

* Testing if s2 is a **subset** of s1
 `s1.containsAll(s2)` The answer is _True_ or _False_
* Setting s1 to the **union** of s1 and s2
`s1.addAll(s2)`
* Setting s1 to the **intersection** of s1 and s2
`s1.retainAll(s2)`
* Setting s1 to the **difference** of s1 and s2
`s1.removeAll(s2)`

## instanceof
    if(post instanceof MessagePost )
    MessagePost msg = ( MessagePost )
    … access MessagePost methods via msg ...

##
    
## Radio Buttons
    import javax.swing.*;
    import java.awt.*;
    import java.awt.event.*;

    public class RadioButton implements ActionListener{
        static JRadioButton first;
        static JRadioButton second;
        static JTextField text;

        public static void main(String[] args){
            JFrame frame = new JFrame ("Radio Button");
            frame.setSize(500,500);
            frame.setBackground(Color.white);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            //Create a text field
            text = new JTextField();
            text.setBounds(0,0,500,50);
            frame.add(text);
            //Creat two radio Buttons
            first = new JRadioButton("First");
            second =  new JRadioButton("Second");
            first.setBounds(210, 100, 80, 60);
            second.setBounds(210, 200, 80, 60);
            frame.add(first);
            frame.add(second);
            //Create a radio Button Object
            RadioButton obj = new RadioButton();
            //Associate the radio buttons with ActionListener
            first.addActionListener(obj);
            second.addActionListener(obj);
            //Display the Frame
            frame.setVisible(true);
            }

        //Display the text of the selected Button
        public void actionPerformed(ActionEvent e) {
            String x = e.getActionCommand();
            if (x.equals("First")) {
                if (second.isSelected())
                    second.setSelected(false);
            } else {
                if (first.isSelected())
                    first.setSelected(false);
            }
            text.setText("The Button selected is: " + x);
    }
    }
## CheckBox
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

# Exceptions
#### Types of Exceptions
1. _Checked Exceptions:_ Checked for at Compile time.
2. _Unchecked exceptions:_ Aren't checked at Compile time. 
#### Standart Exception Types with Examples:
* `IndexOutOfBoundsException`  U have an array _arr_ of length _n_ ---> arr[n+2] 
* `IllegalArgumentException` calling a method **print(int value)** with _print();_
* `EOFException` An end of file mark has been seen.
* `ArithmeticException` Division by zero
* `NumberFormatException` Using Illegal Number Format, like using a float instead of integer
* `NullPointerException` a class method is being called by an object instance that is currently _null_
#### Notes:
1. `throw` !(in Methods), u can use `throw new Exception_type("Error Msg");`
2. `throws` Methods throwing **Checked** Exception must have `throws` for Exceptions that can be raised by a method.
3. U can use Multiple `catch` statements with `try`
4. u can use `catch` for Multiple Options (1 || 2)
5. `finally` Perform any Common Actions whether an Exception is thrown or not, check Below:
##
    try{
      writingthisFile();
    } 
    catch (FileNotFoundException e){
      CatchtheMSGifUCan();
    }
    finally{   // الي مبين انه وجوده وعدمه واحد
      closetheFile(); 
    }