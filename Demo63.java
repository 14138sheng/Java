package class11;
/**
 * 二维数组求和
 * @author HuaWei
 *
 */
public class Demo63 {
	public static void main(String[] args) {
		int [][] arr = {{70,80,90},{90,85,80},{99,97,98}};
		int a = 0;
		for(int i = 0;i < arr.length;i++) {
			for(int j = 0;j < arr[i].length;j++) {
				a += arr[i][j];
			}
		}
			System.out.println(a);
	}
}
