package class8;
/**
 * ¡‚–Œ
 * @author HuaWei
 *
 */
public class Demo45 {
	public static void main(String[] args) {
		for(int a=1;a<=5;a++) {
			for(int b=5;b>=a;b--) {
				System.out.print(" ");
			}
			{
				for(int c=1;c<=a;c++) {
					System.out.print("* ");
				}
			}System.out.println();
		}
		
		for(int d=1;d<=4;d++) {
			for(int e=0;e<=d;e++) {
				System.out.print(" ");
			}
			{
				for(int f=4;f>=d;f--) {
					System.out.print("* ");
				}
			}System.out.println();
		}
	}
}