class Fact {
    int fact(int n) {
        if (n == 0) {
            return 1; 
        } else {
            return n * fact(n - 1);
        }
    }
}

public class FactDemo {
    public static void main(String args[]) {
        Fact obj = new Fact();  
        int result = obj.fact(5);  
        System.out.println("The factorial is: " + result); 
    }
}
