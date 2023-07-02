import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        
        // The Collatz Conjecture has two simple rules to be followed indefinitely: 
        // Take a number and check if it's even or odd 2. If it's even divide it with two else multiply it with 3 and add 1 to the result. 
        // When performed with any number indefinitely, at some point the result is reduced to 1
       

        Scanner scanner = new Scanner(System.in);
        System.out.print("Type number to calculate Collatz Conjecture: ");

        int number = scanner.nextInt();
        
        System.out.println("Collatz sequence for number " + number + ":");
        Collatz.printCollatzSequence(number);

        scanner.close();


    }
}
