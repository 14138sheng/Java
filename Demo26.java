package class5;

import java.util.Scanner;

public class Demo26 {
	private static String con;
	private static String ome;
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("请输入：1.石头 2.剪刀 3.布");
		int a = s.nextInt();
			switch(a) {
				case 1:
					ome = "石头";break;
				case 2:
					ome = "剪刀";break;
				case 3:
					ome = "布";break;
			}
		int b = (int)(Math.random()*3+1);
			switch(b) {
				case 1:
					con = "石头";break;
				case 2:
					con = "剪刀";break;
				case 3:
					con = "布";break;
			}
		if(a == b) 
			System.out.println("你出的是："+ome+"\n电脑出的是："+con+"\n结果是：平局");
		else {
		if(a==1&&b==2||a==2&&b==3||a==3&&b==1) 
			System.out.println("你出的是："+ome+"\n电脑出的是："+con+"\n结果是：你赢了");
		else
			System.out.println("你出的是："+ome+"\n电脑出的是："+con+"\n结果是：你输了");
		}
	}
}