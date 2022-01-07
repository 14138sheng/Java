package class11;
/**
 * 排序输出
 * @author HuaWei
 *
 */
public class Demo58 {
	public static void main(String[] args) {
		int [] arr = {90,34,-23,18,12};
		for(int i = 0;i < arr.length-1;i++) {
			//控制比较趟数
			for (int j = 0;j < arr.length-i-1;j++) {
			//控制比较次数
			//length=i+j j=length-i
				if(arr[j] > arr[j+1]) {
					int a = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = a;
					//交换位置
				}
			}
		}
		for(int i = 0;i < arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
