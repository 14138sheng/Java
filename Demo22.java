package class5;

import java.util.Scanner;

public class Demo22 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("�������·ݣ�");
		int a = s.nextInt();
		switch(a) {
		case 1:
		case 2:
		case 12:
			System.out.println("����");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("�ļ�");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("�＾");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("����");
			break;
		default:
			System.out.println("������·ݲ���ȷ");
		}
}
}