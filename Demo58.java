package class11;
/**
 * �������
 * @author HuaWei
 *
 */
public class Demo58 {
	public static void main(String[] args) {
		int [] arr = {90,34,-23,18,12};
		for(int i = 0;i < arr.length-1;i++) {
			//���ƱȽ�����
			for (int j = 0;j < arr.length-i-1;j++) {
			//���ƱȽϴ���
			//length=i+j j=length-i
				if(arr[j] > arr[j+1]) {
					int a = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = a;
					//����λ��
				}
			}
		}
		for(int i = 0;i < arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
