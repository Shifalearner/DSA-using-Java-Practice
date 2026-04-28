package Patterns;

public class Solid_Rhombus {
    static void Pattern() {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			// for each row => printing spaces , starts
			
			// spaces
			for (int j = 1; j <= (n - i); j++) {
				System.out.print(" ");
			}
			
			//starts
			for (int j = 1; j <= n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Solid_Rhombus.Pattern();
	}
}
