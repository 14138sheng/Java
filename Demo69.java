package class12;

import java.util.Scanner;
/**
 * 键盘输入两个数，用方法输出最大的
 */
public class Demo69 {
	 public static void main(String[] args) {
	        Scanner s = new Scanner(System.in);
	        System.out.println("请输入第一个数:");
	        int a = s.nextInt();
	        System.out.println("请输入第二个数:");
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
