package pppp;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;

public class MainPP {
    ArrayList<String> students = new ArrayList<>();


    public MainPP() {
        this.students = new ArrayList<>();
    }

    public ArrayList<String> getStudents() {
        return students;
    }


    public void addnames(){

        students.add("John");
        students.add("Jane");
        students.add("John");
        students.add("Alice");
        students.add("John");
        students.add("Bob");

    }
    public void addtoHM(){
        HashMap<String, Integer> names = new HashMap<>();//declared the names HM
        int c =1;
        for (String student : students) {
            if (names.containsKey(student)) {
                int count = names.get(student);
                names.put(student, count + 1);
            } else {
                names.put(student, 1);
            }
        }

        // Remove repeated names and keep track of deletion count
        for (Map.Entry<String, Integer> entry : names.entrySet()) {
            String name = entry.getKey();
            int count = entry.getValue();

            if (count > 1) {
                while (count > 1) {
                    students.remove(name);
                    count--;
                }
            }
        }
        //check if exists,  c++
        // count occurences
        // forezch
        //

    }
    public void finalprint() {
        for (String x : students) {
            System.out.println(x);
        }
    }
    public static void main(String[] arr) {

        MainPP k = new MainPP();
        // Add student names to the ArrayList
        k.addnames();
        k.addtoHM();
        k.finalprint();
    }
}
/*  arraylist names { Ahamd , Ahmad , Lafi, op3mk, samer, tareq, samer, nofal }*/
