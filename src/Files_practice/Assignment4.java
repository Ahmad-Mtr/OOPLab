package Files_practice;

import java.io.*;


public class Assignment4 {
    private FileReader _FileRead;
    private BufferedReader _BuffRead;
    private FileWriter _FileWrite;
    private BufferedWriter _BuffWrite;
    private String _InputFileStr = "";

    public void read() {
        try {
            _FileRead = new FileReader("C:\\Users\\YOUSEF MAHMOUD\\IdeaProjects\\OOPLab\\src\\Files_practice\\Readme.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        _BuffRead = new BufferedReader(_FileRead);

        String _InputFileLine = "";

        while (true) {
            try {
                if (!((_InputFileLine = _BuffRead.readLine()) != null)) break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            _InputFileStr = _InputFileStr + _InputFileLine + "\n";
        }
        System.out.println(_InputFileStr);
    }

    public void write() {
        try {
            _FileWrite = new FileWriter("C:\\Users\\YOUSEF MAHMOUD\\IdeaProjects\\OOPLab\\src\\Files_practice\\Mydata.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        _BuffWrite = new BufferedWriter(_FileWrite);

        try {

            _BuffWrite.write(_InputFileStr);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            _BuffWrite.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


    public static void main(String[] arr) {
        Assignment4 x = new Assignment4();
        x.read();
        x.write();
        System.out.println("Proccess Done Successfully ;)");

    }
}
