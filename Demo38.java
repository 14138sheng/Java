package class7;

import java.util.Scanner;

public class Demo38 {
	public static void main(String[] args) { 
		Scanner s = new Scanner(System.in);
	String b ; 
	do {
		int a = (int)(Math.random()*100+1);
	for(int i=1;i<=5;i++) {
		System.out.println("�������������֣�");
		int input = s.nextInt();
		if(input>a) {
			System.out.println("�´��ˣ�"); 
		}else if(input<a) {
		System.out.println("��С�ˣ�"); 
		}else {
		System.out.println("�¶��ˣ�");
		break;
		}
		if(i<5) { 
		System.out.println("��ʣ"+(5-i)+"�β²����");
		}
	}
	System.out.println("��ȷ�����ǣ�"+a);
	System.out.println("�Ƿ������Y/N"); 
	b = s.next(); 
	}while(b.equals("Y"));
	System.out.println("��Ϸ������");
	}
}

