package class9;
/**
 * 一百以内质数和
 * @author HuaWei
 *
 */
public class Demo48 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 2;i <= 100;i++) {
			int a = 0;
			for(int j = 2; j < i;j++) {
				if(i % j == 0)
					a++;
			}
			if(a == 0)
				sum += i;
		}
		System.out.println(sum);
	}
}
