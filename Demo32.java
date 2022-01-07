package class6;

import java.util.Scanner;

public class Demo32 {
	public static void main(String[] args) {
	int i = 1;
	int a = 0;
	while(i<=5){
	Scanner s = new Scanner(System.in);
	System.out.println("请输入第"+i+"名学生的年龄");
	int age = s.nextInt();
	if(age>18)
		a++;
		i++;
	}
	System.out.println("有"+a+"名同学大于18岁");
	}
}