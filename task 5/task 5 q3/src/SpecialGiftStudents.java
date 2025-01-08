import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SpecialGiftStudents {
    public static void main(String[] args) {
        // Create a list to store student names
        List<String> studentNames = new ArrayList<>();
        studentNames.add("Aarav");
        studentNames.add("Ananya");
        studentNames.add("Rohit");
        studentNames.add("Arya");
        studentNames.add("Bhavna");
        studentNames.add("Aditi");
        studentNames.add("Chetan");
        studentNames.add("Anmol");
        studentNames.add("Divya");
        studentNames.add("Ajay");

        // Use Stream API and lambda expression to filter students whose names start with "A"
        List<String> studentsWithA = studentNames.stream()
                .filter(name -> name.startsWith("A")) // Filter names starting with "A"
                .collect(Collectors.toList()); // Collect the filtered names into a list

        // Display the students who will receive special gifts
        System.out.println("Students who will receive special gifts: " + studentsWithA);
    }
}
