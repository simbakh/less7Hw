package less7HW;

import java.util.Scanner;

public class Hw3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a bin number");
		String  a = sc.nextLine();
		int b =  Integer.parseInt(a, 2);
		System.out.println(b);
	}
}
