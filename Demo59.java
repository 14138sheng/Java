package class11;
/**
 * ��ί����ȥ����ֵ��ƽ��pant.1
 */
import java.util.Scanner;

public class Demo59 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int [] arr = new int[10];
		for(int i = 0;i< arr.length;i++) {
			System.out.println("�������"+(i+1)+"λ��ί������");
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
			System.out.println("��ͷ����� "+min+" ��");
			System.out.println("��߷����� "+max+" ��");
			System.out.print("�õ�������Ϊ ");
			for(i=0;i<arr1.length;i++){
			System.out.print(+arr1[i] + " ");
			}
			System.out.println();
			System.out.println("ȥ����ͷֺ���߷ֵ�ƽ������ "+b/arr1.length+" ��");
	}
}
