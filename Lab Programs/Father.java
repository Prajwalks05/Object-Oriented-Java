class WrongAgeException extends Exception {
    public WrongAgeException(String message) {
        super(message);
    }
}

class Father {
    int age;
    public Father(int age) throws WrongAgeException {
        if (age < 0)
            throw new WrongAgeException("Age cannot be negative!");
        this.age = age;
    }
}

class Son extends Father {
    int sonAge;
    public Son(int fatherAge, int sonAge) throws WrongAgeException {
        super(fatherAge);
        if (sonAge < 0 || sonAge >= fatherAge)
            throw new WrongAgeException("Son's age must be less than father's and non-negative!");
        this.sonAge = sonAge;
    }
}

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        // Valid case
        try {
            Father father = new Father(45);
            Son son = new Son(45, 20);
            System.out.println("Father's age: " + father.age + ", Son's age: " + son.sonAge);
        } catch (WrongAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
        try {
            new Son(30, 35);
        } catch (WrongAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
        try {
            new Father(-10);
        } catch (WrongAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}