package class7;

import java.util.Scanner;

public class Demo38 {
	public static void main(String[] args) { 
		Scanner s = new Scanner(System.in);
	String b ; 
	do {
		int a = (int)(Math.random()*100+1);
	for(int i=1;i<=5;i++) {
		System.out.println("请输入所猜数字：");
		int input = s.nextInt();
		if(input>a) {
			System.out.println("猜大了！"); 
		}else if(input<a) {
		System.out.println("猜小了！"); 
		}else {
		System.out.println("猜对了！");
		break;
		}
		if(i<5) { 
		System.out.println("还剩"+(5-i)+"次猜测机会");
		}
	}
	System.out.println("正确数字是："+a);
	System.out.println("是否继续？Y/N"); 
	b = s.next(); 
	}while(b.equals("Y"));
	System.out.println("游戏结束！");
	}
}

