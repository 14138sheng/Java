package class7;

import java.util.Scanner;

public class Demo37 {
	public static void main(String[] args) {
			int b = (int)(Math.random()*100+1);
			//�����
			for(int a = 1;a<6;a++){
			Scanner s = new Scanner(System.in);
			System.out.println("�����룺");
			int c = s.nextInt();
			if(c==b) {System.out.println("����");break;}
			else if(c<b)System.out.println("С��\n�㻹ʣ"+(5-a)+"�λ���");
			else System.out.println("����\n�㻹ʣ"+(5-a)+"�λ���");
			if(a==5)System.out.println("��ȷ����"+b);
		}
	}
}
