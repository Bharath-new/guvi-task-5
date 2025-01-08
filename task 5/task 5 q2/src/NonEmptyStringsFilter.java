import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NonEmptyStringsFilter {
    public static void main(String[] args) {
        // Create a list of strings
        List<String> listStrings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");

        // Use Stream API to filter out non-empty strings
        List<String> nonEmptyStrings = listStrings.stream()
                .filter(str -> !str.isEmpty()) // Check if the string is not empty
                .collect(Collectors.toList()); // Collect the results into a list

        // Print the list of non-empty strings
        System.out.println("Non-Empty Strings: " + nonEmptyStrings);
    }
}
