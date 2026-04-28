package Patterns;

public class Inv_Pyramid2 {
    static void Pattern() {

		int n = 4;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= (i - 1); j++) {
				System.out.print(" ");
			}
			
			for (int j = 1; j <= ((2 * n) - (2 * i) + 1); j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Inv_Pyramid2.Pattern();
	}
}
