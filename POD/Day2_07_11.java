package POD;

import java.util.Scanner;

public class Day2_07_11 {
    public void print(int n){
       
        
        for(int i = 1; i <= n; i++){
      
            if(i % 3 == 0 && i % 5 == 0 ){
                System.out.println("FizzBuzz");
            }else if(i % 3 == 0){
                System.out.println("Fizz");
            }else if(i % 5 == 0){
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         
        System.out.println("Enter any number");
        int n = sc.nextInt();
        Day2_07_11 d = new Day2_07_11();
        d.print(n);
        sc.close();
    }
}
