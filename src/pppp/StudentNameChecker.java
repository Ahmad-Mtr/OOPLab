package pppp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentNameChecker {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();
        // Add student names to the ArrayList
        students.add("John");
        students.add("Jane");
        students.add("John");
        students.add("Alice");
        students.add("John");
        students.add("Bob");

        HashMap<String, Integer> HM = new HashMap<>();
        int deletionCount = 0;

        // Count the occurrences of each name
        for (String student : students) {
            if (HM.containsKey(student)) {
                int count = HM.get(student);
                HM.put(student, count + 1);
            } else {
                HM.put(student, 1);
            }
        }

        // Remove repeated names and keep track of deletion count
        for (Map.Entry<String, Integer> entry : HM.entrySet()) {
            String name = entry.getKey();
            int count = entry.getValue();

            if (count > 1) {
                deletionCount += count - 1;
                while (count > 1) {
                    students.remove(name);
                    count--;
                }
            }
        }

        // Print the number of times the repeated name is deleted
        System.out.println("Deleted " + deletionCount + " repeated student names.");

        // Print the updated list of students
        System.out.println("Updated student list:");
        for (String student : students) {
            System.out.println(student);
        }
    }
}
