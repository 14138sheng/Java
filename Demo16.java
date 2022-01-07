package class4;
import java.util.Scanner;
public class Demo16 {
		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			System.out.println("请输入：");
			int a = s.nextInt();
		boolean b = a%4==0;
		boolean c = a%100!=0;
		boolean d = a%400==0;
		if((b && c) || d) {
			System.out.println("是闰年");
		}
		if(!((b && c) || d)) {
			System.out.println("不是闰年");
		}
	}
}
