package class4;

import java.util.Scanner;

public class Demo18 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("�����룺");
		int a = s.nextInt();
		if (a>=90 && a<=100) {
			System.out.println("�ǳ���");
		}
		else if(a>=80) {
			System.out.println("����");
		}
		else if(a>=60) {
			System.out.println("����");
		}
		else if(a<=60 && a>=0) {
			System.out.println("������");
		}
	}
	}
