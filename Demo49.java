package class9;
/**
 * 账号登陆模拟
 * @author HuaWei
 *    a.equals(b)   a和b的String类型比较
 */
import java.util.Scanner;

public class Demo49 {
	public static void main(String[] args) { 
		String a="admin";
		String b="123456";
		for(int x=1;x<=3;x++) {
		Scanner s = new Scanner(System.in);
			System.out.println("请输入账号：");
			String a1 = s.nextLine();
		Scanner m = new Scanner(System.in);
			System.out.println("请输入密码：");
			String a2 = m.nextLine();
			boolean b1=a1.equals(a);
			boolean b2=a2.equals(b);
			if(b1==true && b2==true){
			System.out.println("登录成功");
			break;
			}else {
			System.out.println("密码错误"); 
			}
			if(x<3) { 
			System.out.println("还剩"+(3-x)+"次机会");
			}
			else {
			System.out.println("登录失败，请重试");
			}
		}
	}
}