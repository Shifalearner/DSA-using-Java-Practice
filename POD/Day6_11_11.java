package POD;

import java.util.Scanner;

public class Day6_11_11 {
    
    public void findClosestPerson(int x, int y, int z){

        int xd = Math.abs(z - x);
        int yd = Math.abs(z - y);

        if(xd < yd){
            System.out.println(1);
        }else if(yd < xd){
            System.out.println(2);
        }else{
            System.out.println(0);
        }

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter position of person 1:");
        int x = sc.nextInt();

        System.out.println("Enter position of person 2:");
        int y = sc.nextInt();

        System.out.println("Enter position of person 3:");
        int z = sc.nextInt();

        Day6_11_11 d = new Day6_11_11();
        d.findClosestPerson(x, y, z);

        sc.close();
    }
}
