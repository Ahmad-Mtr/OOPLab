package Mavenproject10;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReadFile {
    
    private FileReader f1;
    private BufferedReader b1;
    
    
    public void read(){
    
        try {
            String x="";
            
            f1= new FileReader("C:\\Users\\Student\\Pictures\\Database2.txt");
            b1= new BufferedReader(f1);
                while( (x= b1.readLine())!=null){
                    System.out.println(x+"\n");
                }
            
        } catch (Exception ex) {
            Logger.getLogger(ReadFile.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }

    public static void main(String[] args) {
       ReadFile b= new ReadFile();
       b.read();
    }

}
