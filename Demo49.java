package class9;
/**
 * �˺ŵ�½ģ��
 * @author HuaWei
 *    a.equals(b)   a��b��String���ͱȽ�
 */
import java.util.Scanner;

public class Demo49 {
	public static void main(String[] args) { 
		String a="admin";
		String b="123456";
		for(int x=1;x<=3;x++) {
		Scanner s = new Scanner(System.in);
			System.out.println("�������˺ţ�");
			String a1 = s.nextLine();
		Scanner m = new Scanner(System.in);
			System.out.println("���������룺");
			String a2 = m.nextLine();
			boolean b1=a1.equals(a);
			boolean b2=a2.equals(b);
			if(b1==true && b2==true){
			System.out.println("��¼�ɹ�");
			break;
			}else {
			System.out.println("�������"); 
			}
			if(x<3) { 
			System.out.println("��ʣ"+(3-x)+"�λ���");
			}
			else {
			System.out.println("��¼ʧ�ܣ�������");
			}
		}
	}
}