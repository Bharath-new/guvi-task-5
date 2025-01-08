import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.List;

public class ConvertToUppercaseExample {
    public static void main(String[] args) {
        // Create a stream of strings
        Stream<String> namesStream = Stream.of("abc", "d", "ef");

        // Use map() to convert each string to uppercase
        List<String> upperCaseNames = namesStream
                .map(String::toUpperCase) // Convert each string to uppercase
                .collect(Collectors.toList()); // Collect the results into a list

        // Print the result
        System.out.println("Uppercase Strings: " + upperCaseNames);
    }
}
