package class11;
/**
 * 输出最值
 * @author HuaWei
 *
 */
public class Demo57 {
	public static void main(String[] args) {
		int [] arr = {90,34,-23,18,12};
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
		System.out.println("最大"+max+" "+"最小"+min);
	}
}
