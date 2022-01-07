package class11;
/**
 * 评委评分去除最值求平均pant.1
 */
import java.util.Scanner;

public class Demo59 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int [] arr = new int[10];
		for(int i = 0;i< arr.length;i++) {
			System.out.println("请输入第"+(i+1)+"位评委的评分");
			arr[i] = s.nextInt();
		}
		int max = arr[0];
		int min = arr[0];
		for(int i = 0;i < arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		int i,j;
		for (i=0;i<arr.length;i++){
			if (arr[i]==max){
				break;
			}
		}
			if(i < arr.length-1){
				for(j=i;j<arr.length-1;j++){
					arr[j]=arr[j+1];
				}
			}
		for (i=0;i<arr.length;i++){
			if (arr[i]==min){
				break;
			}
		}
			if(i < arr.length-2){
				for(j=i;j<arr.length-2;j++){
					arr[j]=arr[j+1];
				}
			}
		int [] arr1 = new int [arr.length-2];
			for(i=0;i<arr.length-2;i++){
				arr1[i]=arr[i];
			}
			  	
			int b = 0;
			for(int a = 0;a < arr1.length;a++) {
				b += arr1[a];
				}
			System.out.println("最低分数是 "+min+" 分");
			System.out.println("最高分数是 "+max+" 分");
			System.out.print("得到的数组为 ");
			for(i=0;i<arr1.length;i++){
			System.out.print(+arr1[i] + " ");
			}
			System.out.println();
			System.out.println("去除最低分和最高分的平均分是 "+b/arr1.length+" 分");
	}
}
