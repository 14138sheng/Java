package class10;
/**
 * ����
 * @author HuaWei
 *
 */
public class Demo50 {
	public static void main(String[] args) {
		//���������
		//��ʽһ
		int [] arr;
		//��ʽ��
		double arr1 [];
		//��̬��ʼ��
		String [] arr3 = {"���ӵ�","��ʱ��","������","�ƶ�ά��","��ɯ����","÷����˹","��������","��������"};
		//��̬��ʼ��
		arr = new int [10];
		int [] arr2 = new int [] {1,2,3,4};
		//����ĵ���
		System.out.println(arr2[2]);//3
		//�޸������е�Ԫ��
		arr3[2] = "��˹��˹";
		System.out.println(arr3[2]);//��˹��˹
		//System.out.println(arr3[8]);�����±�Խ��
		//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 8
		//at class9.Demo50.main(Demo50.java:24)

		//��ȡ����ĳ���
		System.out.println(arr2.length);//4
		//����ı���
		for (int i = 0;i < arr2.length;i++) {
			System.out.print(arr2[i]+" ");
		}
		
	}
}
