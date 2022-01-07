package class4;

import java.util.Scanner;

public class Demo18 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("请输入：");
		int a = s.nextInt();
		if (a>=90 && a<=100) {
			System.out.println("非常棒");
		}
		else if(a>=80) {
			System.out.println("优秀");
		}
		else if(a>=60) {
			System.out.println("良好");
		}
		else if(a<=60 && a>=0) {
			System.out.println("不及格");
		}
	}
	}
