package class10;
/**
 * 判断数组重复
 * @author HuaWei
 *
 */
public class Demo53 {
	public static void main(String[] args) {
		int [] arr = new int [] {1,2,3,1};
		int a = 0;
		for (int i = 0;i < arr.length;i++) {
			for (int j = i+1;j < arr.length;j++) {
				if(arr[i] == arr[j]) {
					a++;
				}
			}
		}
		if(a==0)System.out.println("不重复");
		else System.out.println("重复");
	}
}
