package class12;

import java.util.Scanner;
/**
 * ��¼�ķ���
 * @author HuaWei
 *
 */
public class Demo70 {
	 public static void main(String[] args) {
	        Scanner s = new Scanner(System.in);
	        System.out.println("�������˺�");
	        String userName = s.next();
	        System.out.println("����������");
	        String passWord = s.next();
	        if(LoginInfo(userName,passWord)){
	            System.out.println("��¼�ɹ�");
	        }else{
	            System.out.println("�������");
	        }
	    }

	    public static boolean LoginInfo(String userName,String passWord) {
	        String [] userNames = new String[10];
	        String [] passWords = new String[10];
	        userNames[0] = "admin";
	        passWords[0] = "123456";
	        for (int i = 0; i < passWords.length;i++){
	           if(userName.equals(userNames[i]) && passWord.equals(passWords[i])){
	                return true;
	           }
	        }
	        return false;
	    }
}
