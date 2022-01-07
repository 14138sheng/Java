package class10;

public class Demo55 {
/**
 * 旧数组排除指定值用新数组输出
 * @param args
 */
	public static void main(String[] args) {
		int [] arr1 = new int [] {1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
		int a = 0;
		for (int i = 0;i < arr1.length;i++) {
			if(arr1[i] != 0) {
				a++;
			}
		}
		int []arr2 = new int[a];
		int b = 0;
		for(int i = 0;i < arr1.length;i++) {
			if(arr1[i] != 0) {
				arr2[b] = arr1[i];
				b++;
			}
		}
		for (int i = 0;i < arr2.length;i++) {
			System.out.print(arr2[i]+" ");
		}
	}
}
