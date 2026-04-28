package Patterns;

public class Solid_Sqr {
    static void Pattern() {
		int n = 4;
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void main(String args[]) {
		
	
		Solid_Sqr.Pattern();
		
	}
}
