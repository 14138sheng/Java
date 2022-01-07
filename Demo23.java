package class5;

import java.util.Scanner;

public class Demo23 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("«Î ‰»Î£∫");
		String date = s.next();
		switch(date) {
		case "a":
			System.out.println("A");
			break;
		case "b":
			System.out.println("B");
			break;
		case "c":
			System.out.println("C");
			break;
		case "d":
			System.out.println("D");
			break;
		case "e":
			System.out.println("E");
			break;
		default:
			System.out.println("other");
			break;
		}
	}
}