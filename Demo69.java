package class12;

import java.util.Scanner;
/**
 * �����������������÷����������
 */
public class Demo69 {
	 public static void main(String[] args) {
	        Scanner s = new Scanner(System.in);
	        System.out.println("�������һ����:");
	        int a = s.nextInt();
	        System.out.println("������ڶ�����:");
	        int b = s.nextInt();
	        number(a,b);

	    }

	    public static void number(int a,int b){
	        if(a>b){
	            System.out.println("a="+a);
	        }else{
	            System.out.println("b="+b);
	        }
	    }
}
