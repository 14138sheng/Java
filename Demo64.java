package class12;
import java.util.Arrays;

/**
 *����
 */
public class Demo64 {
	public static void main(String[] args) {
        int [] arr = {20,10,30,60,50};
        //��������
        Arrays.sort(arr);
        for (int i = 0;i < arr.length;i++) {
        	System.out.print(arr[i]+" ");
        	}
    }
}
