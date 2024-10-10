import java.util.Scanner;

class StudentDet {
    String usn;
    String name;
    int marks[] = new int[3];
    int credits[] = new int[3]; // Array to hold credits for each subject
    Scanner sc = new Scanner(System.in);

    void putData() {
        System.out.println("Enter USN:");
        usn = sc.next();
        System.out.println("Enter Name:");
        name = sc.next();
        System.out.println("Enter marks for 3 subjects:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Marks for subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            System.out.print("Credits for subject " + (i + 1) + ": ");
            credits[i] = sc.nextInt();
        }
    } // putData end

    void calSGPA() {
        int totalCredits = 0;
        int total = 0;
        
        for (int i = 0; i < 3; i++) {
            total += marks[i] * credits[i];
            totalCredits += credits[i];
        }
        
        if (totalCredits != 0) {
            double sgpa = (double) total / totalCredits;
            System.out.printf("SGPA: %.2f%n", sgpa);
        } else {
            System.out.println("Total credits cannot be zero.");
        }
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("USN: " + usn);
        for (int i = 0; i < 3; i++) {
            System.out.println("Marks of subject " + (i + 1) + ": " + marks[i]);
            System.out.println("Credits of subject " + (i + 1) + ": " + credits[i]);
        }
    } // display end
} // class end

public class Student {
    public static void main(String args[]) {
        StudentDet s1[] = new StudentDet[3];
        for (int i = 0; i < 3; i++) {
            s1[i] = new StudentDet();
        } // for end
        
        for (int j = 0; j < 3; j++) {
            System.out.println("Enter the details of student " + (j + 1));
            s1[j].putData();
        } // for end
        
        for (int k = 0; k < 3; k++) {
            System.out.println("\nDetails of student " + (k + 1) + ":");
            s1[k].display();
            s1[k].calSGPA();
        } // for end
    } // main class end
}
