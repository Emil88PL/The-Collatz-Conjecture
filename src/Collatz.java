import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Collatz {
    
    public static void printCollatzSequence(int number) throws IOException {

        ArrayList<Integer> collatzArray = new ArrayList<Integer>();
        System.out.println(number + " ");
        collatzArray.add(number);
        
        while (number != 1) {
            if (number % 2 == 0) {
                number = number / 2;
                collatzArray.add(number);
            } else {
                number = (number * 3) + 1;
                collatzArray.add(number);
            }
            System.out.println(number + " ");
        }
        System.out.println("Size of that collection is: " + collatzArray.size());

        File file = new File("Collatz.txt");
        boolean fileExists = file.exists();
        FileWriter fr = new FileWriter(file, true);
        BufferedWriter br = new BufferedWriter(fr);
         if (!fileExists) {
                fr.write("The Collatz Conject:\n");
            }
        br.write("Collatz sequence for number: "+ collatzArray.get(0) + " is: " + collatzArray + " How many \"hops\" to get to 1: " + collatzArray.size() + " \"hops\"" +"\n");

        br.close();
        fr.close();
        }
}   



