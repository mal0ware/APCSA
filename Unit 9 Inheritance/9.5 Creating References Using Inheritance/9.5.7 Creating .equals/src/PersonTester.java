import java.util.Scanner;

public class PersonTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for Person details
        System.out.print("Please enter the Person's name: ");
        String personName = scanner.nextLine();
        System.out.print("Please enter the Person's birthday: ");
        String personBirthday = scanner.nextLine();

        // Create Person object
        Person person = new Person(personName, personBirthday);

        // Prompt user for Student details
        System.out.print("Please enter the Student's name: ");
        String studentName = scanner.nextLine();
        System.out.print("Please enter the Student's birthday: ");
        String studentBirthday = scanner.nextLine();
        System.out.print("Please enter the Student's grade: ");
        int studentGrade = scanner.nextInt();

        // Create Student object
        Student student = new Student(studentName, studentBirthday, studentGrade);

        // Compare and print result
        System.out.println("Same: " + person.equals(student));

        scanner.close();
    }
}