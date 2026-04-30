package Patterns;

public class Hollow_Rect {

   static void Pattern(){
        int n = 4; 
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 6; j++) {
                if(i == 1 || i == n){
                    System.out.print("* ");
                }else{
                    if(j == 1 || j == 6){
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Hollow_Rect.Pattern();
    }
    
}
