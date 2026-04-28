package Patterns;

public class Solid_Rect {
    static void Pattern2() {
		int n = 3;
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= 5; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		
		Solid_Rect.Pattern2();
	}
}
