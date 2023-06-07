package Mavenproject10;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WriteFile {

    private FileWriter f1;
    private BufferedWriter b1;
    private FileReader fr;
    private BufferedReader br;

    public void Write() {
        String h = "";
        String s = "";
        try {

            fr = new FileReader("C:\\Users\\Student\\Pictures\\11.txt");
            br = new BufferedReader(fr);
            while ((h = br.readLine()) != null) {
                s = s + h + "\n";
            }

            f1 = new FileWriter("C:\\Users\\Student\\Pictures\\11.txt");
            b1 = new BufferedWriter(f1);
            b1.append(s+"\n"+"77777");

            b1.close();

        } catch (Exception c) {
            System.out.println("error");
        }

    }

    public static void main(String[] args) {
        WriteFile o = new WriteFile();
        o.Write();
    }

}
