package class5;

import java.util.Scanner;

public class Demo24 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("��������ݣ�");
		int year = s.nextInt();
		Scanner s1 = new Scanner(System.in);
		System.out.println("�������·ݣ�");
		int yue = s1.nextInt();
		Scanner s2 = new Scanner(System.in);
		System.out.println("���������ڣ�");
		int ri = s2.nextInt();
			switch(yue) {
			case 12:
				yue += (31);
			case 11:
				yue += (30);
			case 10:
				yue += (31);
			case 9:
				yue += (30);
			case 8:
				yue += (31);
			case 7:
				yue += (30);
			case 6:
				yue += (31);
			case 5:
				yue += (30);
			case 4:
				yue += (31);
			case 3:
				yue += (28);
			case 2:
				yue += (31);
			case 1:
				yue += (0);
			}
			if(year%4 == 0 && year%100 != 0 || year%400 == 0) {
				System.out.println("����"+year+"��ĵ�"+(yue+ri+1)+"��");
			}
			else {
				System.out.println("����"+year+"��ĵ�"+(yue+ri)+"��");
			}
			}
}