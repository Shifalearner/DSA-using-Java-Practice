package POD;

import java.util.Scanner;

public class Day5_10_11 {
    
    public void checkNumber(int n){

        int original_number = n;
        int last_digit = 0;
        int sum = 0;
        int count = 0;

        while (n != 0) {
            count++;
            n = n / 10;
        }

        n = original_number;

        while(n != 0){
            last_digit = n % 10;
            sum = sum + (int) Math.pow(last_digit, count);
            n = n / 10;
        }

        
        if(sum == original_number){
            System.out.println( original_number + " is an Armstrong number.");
        }else{
            System.out.println(original_number + " It is not an Armstrong number.");
        }


    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number: ");

        int n = sc.nextInt();

        Day5_10_11 d = new Day5_10_11();
        d.checkNumber(n);

        sc.close();
    }
}
