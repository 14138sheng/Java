package class5;

import java.util.Scanner;

public class Demo26 {
	private static String con;
	private static String ome;
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("�����룺1.ʯͷ 2.���� 3.��");
		int a = s.nextInt();
			switch(a) {
				case 1:
					ome = "ʯͷ";break;
				case 2:
					ome = "����";break;
				case 3:
					ome = "��";break;
			}
		int b = (int)(Math.random()*3+1);
			switch(b) {
				case 1:
					con = "ʯͷ";break;
				case 2:
					con = "����";break;
				case 3:
					con = "��";break;
			}
		if(a == b) 
			System.out.println("������ǣ�"+ome+"\n���Գ����ǣ�"+con+"\n����ǣ�ƽ��");
		else {
		if(a==1&&b==2||a==2&&b==3||a==3&&b==1) 
			System.out.println("������ǣ�"+ome+"\n���Գ����ǣ�"+con+"\n����ǣ���Ӯ��");
		else
			System.out.println("������ǣ�"+ome+"\n���Գ����ǣ�"+con+"\n����ǣ�������");
		}
	}
}