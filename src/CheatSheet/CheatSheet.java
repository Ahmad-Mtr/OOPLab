package CheatSheet;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;

public class CheatSheet {
    private String[] _AllLibraries;
    private String[] _GUISummary;
    private String[] _FileSummary;
    private String[] _ExceptionSummary;
    private String[] _ExceptionTypes;
    private FileReader _DataReader;

    private BufferedReader _BuffReadData;

    private FileWriter _FileWrite;

    private BufferedWriter _BuffWrite;

    private String _InputFileStr = "";
    private int c = 0;

    public void read_AllData() {
        ConsoleColors colours = new ConsoleColors();

        try {
            _DataReader = new FileReader("src/CheatSheet/Data.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        _BuffReadData = new BufferedReader(_DataReader);
        String readLine = "";
        while (true) {
            try {
                if (!((readLine = _BuffReadData.readLine()) != null)) break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            _InputFileStr = _InputFileStr + readLine + "\n";

            switch (c) {
                case 0:
                    if (!(readLine.contains("//")) && !(readLine.contains("----"))) {
                        System.out.println(" " + colours.BLACK_BACKGROUND + colours.YELLOW + readLine +
                                colours.RESET);
                    } else if (readLine.contains("------------------------------------------")) {
                        System.out.println(readLine);
                        c++;
                    } else System.out.println(readLine);
                    break;
                case 1:
                    if (!(readLine.contains("//"))&& !(readLine.contains("----"))) {
                        System.out.println(" " + colours.BLACK_BACKGROUND + colours.BLUE + readLine +
                                colours.RESET);
                    } else if (readLine.contains("------------------------------------------")) {
                        System.out.println(readLine);
                        c++;
                    } else System.out.println(readLine);

                    break;
                case 2:
                    if (!(readLine.contains("//"))&& !(readLine.contains("----"))) {
                        System.out.println(" " + colours.BLACK_BACKGROUND + colours.GREEN + readLine +
                                colours.RESET);
                    } else if (readLine.contains("------------------------------------------")) {
                        System.out.println(readLine);
                        c++;
                    } else System.out.println(readLine);

                    break;
                case 3:
                    if (!(readLine.contains("//")) && !(readLine.contains("----"))) {
                        System.out.println(" " + colours.BLACK_BACKGROUND + colours.RED + readLine +
                                colours.RESET);
                    } else if (readLine.contains("------------------------------------------")) {
                        System.out.println(readLine);
                        c++;
                    } else System.out.println(readLine);

                    break;
                default:
                    if (!(readLine.contains("//")) && !(readLine.contains("----"))) {
                        System.out.println(" " + colours.BLACK_BACKGROUND + colours.PURPLE + readLine +
                                colours.RESET);
                    } else if (readLine.contains("------------------------------------------")) {
                        System.out.println(readLine);
                        c++;
                    } else System.out.println(readLine);
            }
        }


    }
}
//Libraries
//GUI
//FileRead
//        FileWrite
//Exceptions
//