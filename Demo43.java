package class8;
/**
 * 输出打印反
 */
import java.util.Scanner;

public class Demo43 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("请输入：");
		int a = s.nextInt();
		for(int c=1;c<=a;c++) {
			for(int d=1;d<=c;d++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
