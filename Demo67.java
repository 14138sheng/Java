package class12;

import java.util.Scanner;

public class Demo67 {
	public static void main(String[] args) {
        main1();
    }

    public static void main1() {
        System.out.println("��ѡ��1.ע�� 2.��¼ 3.�˳�");
        String b ;
        do {
        	Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        if(a == 1){System.out.println("��ӭ����ע����棡");}
        else if(a == 2){System.out.println("��ӭ�����¼���棡");}
        else if(a == 3){System.out.println("�˳��ɹ���");}
        else{System.out.println("��������");}
        System.out.println("�Ƿ������Y/N");
            b = s.next();
        }while(b.equals("Y"));
        System.out.println("�������˳�");
    }
}
