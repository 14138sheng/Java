package class12;

import java.util.Scanner;

public class Demo67 {
	public static void main(String[] args) {
        main1();
    }

    public static void main1() {
        System.out.println("请选择：1.注册 2.登录 3.退出");
        String b ;
        do {
        	Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        if(a == 1){System.out.println("欢迎进入注册界面！");}
        else if(a == 2){System.out.println("欢迎进入登录界面！");}
        else if(a == 3){System.out.println("退出成功！");}
        else{System.out.println("输入有误！");}
        System.out.println("是否继续？Y/N");
            b = s.next();
        }while(b.equals("Y"));
        System.out.println("程序已退出");
    }
}
