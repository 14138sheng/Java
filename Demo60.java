package class11;
/**
 * ��ί����ȥ����ֵ��ƽ��pant.2
 */
import java.util.Scanner;

public class Demo60 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int [] arr = new int[10];
		for(int i = 0;i< arr.length;i++) {
			System.out.println("�������"+(i+1)+"λ��ί������");
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
		System.out.println("��ͷ����� "+arr[0]+" ��");
		System.out.println("��߷����� "+arr[arr.length-1]+" ��");
		System.out.print("�õ�������Ϊ ");
		for(int i=0;i<arr1.length;i++){
			System.out.print(+arr1[i] + " ");
		}
		System.out.println();
		System.out.println("ȥ����ͷֺ���߷ֵ�ƽ������ "+b/arr1.length+" ��");
	}
}
