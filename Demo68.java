package class12;
/**
 * û�з���ֵ���в����ķ���
 */
public class Demo68 {
    public static void main(String[] args) {
        //����Ϊ����
        number(10);
        //����Ϊ����
        int a = 13;
        number(a);
    }
    public static void number(int a){
        if(a%2==0){
            System.out.println(a+"��ż��");
        }else{
            System.out.println(a+"������");
        }
    }
}