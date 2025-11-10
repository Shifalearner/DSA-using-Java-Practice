package POD;

import java.util.Scanner;

public class Day3_08_11 {
    
    public void yearCheck(int year){
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.println(year + " is a leap year.");
        }else{
            System.out.println(year + " is not a leap year");
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter year: ");
        int year = sc.nextInt();

        Day3_08_11 d = new Day3_08_11();
        d.yearCheck(year);

        sc.close();

    }
}
