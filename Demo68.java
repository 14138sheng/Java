package class12;
/**
 * 没有返回值，有参数的方法
 */
public class Demo68 {
    public static void main(String[] args) {
        //参数为常量
        number(10);
        //参数为变量
        int a = 13;
        number(a);
    }
    public static void number(int a){
        if(a%2==0){
            System.out.println(a+"是偶数");
        }else{
            System.out.println(a+"是奇数");
        }
    }
}