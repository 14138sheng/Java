package class8;
/**
 * �����ӡ��
 */
import java.util.Scanner;

public class Demo42 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("�����룺");
		int a = s.nextInt();
		for(int c=1;c<=a;c++) {
			for(int d=a;d>=c;d--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
