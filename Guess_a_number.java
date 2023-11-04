import java.util.Random;
import java.util.Scanner;

public class Guess_a_number {
    public static void main(String[] args) {
        System.out.println("Computer Choose his Number, Means ab apke Guess krne ki bari");

        Random random = new Random();
        int Computer = random.nextInt(100);
        Scanner scan = new Scanner(System.in);
        int st = scan.nextInt();
        int count = 0;

        while(st != Computer){
            if(st>Computer){
                System.out.println("Your Number are Bigger than Computer Choose Number");
            }
            else{
                System.out.println("Your Number are Lesser than Computer Choose Number");
            }
            st = scan.nextInt();
            count++;
        }
        scan.close();
        System.out.println("Your Score is :- "+count);
        System.out.println("Means You Find the Computer Choose Number in "+count+" Steps!");
    }
}