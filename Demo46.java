package class9;
/**
 * break”Ôæ‰
 * @author HuaWei
 *
 */
public class Demo46 {
	public static void main(String[] args) {
		int a = 0;
		int i = 1;
		for(;i<=10;i++) {
			a += i;
			if(a>20)	
			break;	
		}
		System.out.println(i);
	}
}