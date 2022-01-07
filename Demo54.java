package class10;
/**
 * 十三位斐波那契数列和
 * @author HuaWei
 *
 */
public class Demo54 {
	public static void main(String[] args) {
		int [] arr = new int [13];
		int b=0;
		arr[0]=1;
		arr[1]=1;
		for(int c = 2;c<arr.length;c++) {
			arr[c]=arr[c-2]+arr[c-1];
		}
		for(int a=0;a<arr.length;a++) {
			b+=arr[a];
		}System.out.println(b);
	}
}
