package class12;
/**
 * 方法的调用
 * @author HuaWei
 *
 */
public class Demo65 {
	public static void main(String[] args) {
        aa(5);
    }
    public static void aa(int b){
        int a = 1;
        for (int i = 1;i <= b;i++){
            a*=i;
        }
        System.out.println(a);
    }
}
