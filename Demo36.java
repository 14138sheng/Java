package class7;

public class Demo36 {
	public static void main(String[] args) {
		for(int a = 100;a<1000;a++){
				int b = a/100%10;
				int c = a/10%10;
				int d = a%10;
			if((b*b*b+c*c*c+d*d*d)==a)
				System.out.println(a);
		}
	}
}
