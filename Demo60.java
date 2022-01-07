package class11;
/**
 * 评委评分去除最值求平均pant.2
 */
import java.util.Scanner;

public class Demo60 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int [] arr = new int[10];
		for(int i = 0;i< arr.length;i++) {
			System.out.println("请输入第"+(i+1)+"位评委的评分");
			arr[i] = s.nextInt();
		}
		for(int i = 0;i < arr.length-1;i++) {
			for (int j = 0;j < arr.length-i-1;j++) {
				if(arr[j] > arr[j+1]) {
					int a = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = a;
				}
			}
		}
		int [] arr1 = new int[arr.length-2];
		for (int i = 0;i < arr.length-2;i++) {
			arr1[i] = arr[i+1];	
		}
		int b = 0;
		for(int a = 0;a < arr1.length;a++) {
			b += arr1[a];
			}
		System.out.println("最低分数是 "+arr[0]+" 分");
		System.out.println("最高分数是 "+arr[arr.length-1]+" 分");
		System.out.print("得到的数组为 ");
		for(int i=0;i<arr1.length;i++){
			System.out.print(+arr1[i] + " ");
		}
		System.out.println();
		System.out.println("去除最低分和最高分的平均分是 "+b/arr1.length+" 分");
	}
}
