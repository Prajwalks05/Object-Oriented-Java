import SEE.External;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();
        External[] students = new External[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Student " + (i + 1));
            System.out.print("USN: ");
            String usn = scanner.next();
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("Semester: ");
            int sem = scanner.nextInt();

            int[] internalMarks = new int[5];
            int[] externalMarks = new int[5];

            System.out.println("Enter internal marks for 5 courses:");
            for (int j = 0; j < 5; j++) {
                System.out.print("Course " + (j + 1) + ": ");
                internalMarks[j] = scanner.nextInt();
            }

            System.out.println("Enter external marks for 5 courses:");
            for (int j = 0; j < 5; j++) {
                System.out.print("Course " + (j + 1) + ": ");
                externalMarks[j] = scanner.nextInt();
            }

            students[i] = new External(usn, name, sem, internalMarks, externalMarks);
        }

        // Displaying final marks for each student
        for (External student : students) {
            System.out.println("Student: " + student.getName() + " (" + student.getUsn() + ")");
            int[] finalMarks = student.getFinalMarks();
            System.out.print("Final Marks: ");
            for (int mark : finalMarks) {
                System.out.print(mark + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}