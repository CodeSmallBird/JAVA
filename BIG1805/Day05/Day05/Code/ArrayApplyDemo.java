import java.util.Arrays;
public class ArrayApplyDemo {

	public static void main(String[] args){
		
		int[] arr = {4,5,8,2,9,7,3,1,6,4};
		
		// ��������
		for(int i = 1; i < arr.length; i++){ // ��������
			for(int j = 1; j <= arr.length - i; j++){ // ���ƴ���
				if(arr[j - 1] > arr[j]){
					int temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
		// ��ȡ����ĳ���
		/*
		int len = arr.length;
		System.out.println(len);
		*/
		
		// ��������
		/*
		for(int i = 0; i < arr.length; i++){
			// System.out.println(arr[i]);
			arr[i] += 5;
		}
		*/
		/*
		int i = 0;
		while(i < arr.length){
			System.out.println(arr[i]);
			i++;
		}
		*/
		// �����е�ÿһ��Ԫ����һ������
		// ��ʱi���α�ʾ�����е�ÿһ��Ԫ��
		// ��ǿforѭ��
		// ֻ�ܱ�����������ܸı������е�Ԫ��
		/*
		for(int i : arr){
			// System.out.println(i);
			i += 5;
		}
		for(int i : arr){
			System.out.println(i);
		}
		*/
		/*
		double[] ds = new double[4];
		for(double d : ds){
			System.out.println(d);
		}
		
		char[] cs = new char[5];
		for(char c : cs){}
		*/
		// �������е�Ԫ�������ó���ƴ�ӳ�һ���ַ���������
		/*
		String str = Arrays.toString(arr);
		System.out.println(str);
		*/
		
		// ��ȡ���ֵ
		/*
		// ��¼���ֵ
		int max = arr[0];
		for(int i = 1; i < arr.length; i++ ){
			
			if(arr[i] > max)
				max = arr[i];
			
		}
		System.out.println(max);
		*/
		
		// ��¼���ֵ���±�
		/*
		int max = 0;
		for(int i = 1; i < arr.length; i++){
			
			if(arr[i] >	arr[max])
				max = i;
			
		}
		System.out.println(arr[max]);
		*/
	}

}