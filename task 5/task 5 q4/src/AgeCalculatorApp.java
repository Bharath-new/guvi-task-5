import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculatorApp {
    public static void main(String[] args) {
        // Create a Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for their birthdate
        System.out.print("Enter your birthdate (yyyy-mm-dd): ");
        String birthDateString = scanner.nextLine();

        try {
            // Parse the input date
            LocalDate birthDate = LocalDate.parse(birthDateString);

            // Get the current date
            LocalDate currentDate = LocalDate.now();

            // Calculate the age using Period
            Period age = Period.between(birthDate, currentDate);

            // Print the calculated age
            System.out.println("Your age is: "
                    + age.getYears() + " years, "
                    + age.getMonths() + " months, and "
                    + age.getDays() + " days.");
        } catch (Exception e) {
            // Handle invalid input
            System.out.println("Invalid date format. Please enter the date in yyyy-mm-dd format.");
        }

        // Close the scanner
        scanner.close();
    }
}
