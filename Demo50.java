package class10;
/**
 * 数组
 * @author HuaWei
 *
 */
public class Demo50 {
	public static void main(String[] args) {
		//数组的声明
		//方式一
		int [] arr;
		//方式二
		double arr1 [];
		//静态初始化
		String [] arr3 = {"布加迪","保时捷","法拉利","科尔维特","玛莎拉蒂","梅赛德斯","柯尼塞格","兰博基尼"};
		//动态初始化
		arr = new int [10];
		int [] arr2 = new int [] {1,2,3,4};
		//数组的调用
		System.out.println(arr2[2]);//3
		//修改数组中的元素
		arr3[2] = "劳斯莱斯";
		System.out.println(arr3[2]);//劳斯莱斯
		//System.out.println(arr3[8]);数组下标越界
		//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 8
		//at class9.Demo50.main(Demo50.java:24)

		//获取数组的长度
		System.out.println(arr2.length);//4
		//数组的遍历
		for (int i = 0;i < arr2.length;i++) {
			System.out.print(arr2[i]+" ");
		}
		
	}
}
