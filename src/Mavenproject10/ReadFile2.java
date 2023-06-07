package Mavenproject10;

import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReadFile2 {

    private ArrayList<Integer> c;
    private FileReader f1;
    private BufferedReader b1;

    public void read() {
        c = new ArrayList<Integer>();
        String x;
        try {

            f1 = new FileReader("C:\\Users\\Student\\Pictures\\11.txt");
            b1 = new BufferedReader(f1);

            while ((x = b1.readLine()) != null) {
                int v = Integer.parseInt(x);
                c.add(v);

            }

        } catch (Exception ex) {
            Logger.getLogger(ReadFile.class.getName()).log(Level.SEVERE, null, ex);
        }

        int max = c.get(0);
        for (int i = 1; i < c.size(); i++) {
            if (c.get(i) > max) {
                max = c.get(i);
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        ReadFile2 b = new ReadFile2();
        b.read();
    }

}
