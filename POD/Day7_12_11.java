package POD;

import java.util.Scanner;

public class Day7_12_11 {
    public void checkPalindrome(String s){

       s =  s.toLowerCase();
       s = s.replaceAll("[^a-z0-9]", "");
        int i = 0;
        int j = s.length()-1;

        while (i < j) {
            if( s.charAt(i) != s.charAt(j)){
                System.out.println("Entered string is not a palindrome.");
            }else{
                i = i + 1;
                j = j - 1;
                System.out.println("Entered string is palindrome.");
            }
            
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any string ");

        String s = sc.nextLine();


        Day7_12_11 d = new Day7_12_11();

        d.checkPalindrome(s);

        sc.close();
    }
}
