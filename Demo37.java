package class7;

import java.util.Scanner;

public class Demo37 {
	public static void main(String[] args) {
			int b = (int)(Math.random()*100+1);
			//随机数
			for(int a = 1;a<6;a++){
			Scanner s = new Scanner(System.in);
			System.out.println("请输入：");
			int c = s.nextInt();
			if(c==b) {System.out.println("对了");break;}
			else if(c<b)System.out.println("小了\n你还剩"+(5-a)+"次机会");
			else System.out.println("大了\n你还剩"+(5-a)+"次机会");
			if(a==5)System.out.println("正确答案是"+b);
		}
	}
}
