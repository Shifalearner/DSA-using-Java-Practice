package POD;

import java.util.Scanner;

public class Day4_09_11 {
    
    public void calculateFactorial(int n){

        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of "+ n + " is " + fact);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = sc.nextInt();

        Day4_09_11 d = new Day4_09_11();
        d.calculateFactorial(n);

        sc.close();

    }
}
