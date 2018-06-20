import java.util.Arrays;
public class ArrayApplyDemo {

	public static void main(String[] args){
		
		int[] arr = {4,5,8,2,9,7,3,1,6,4};
		
		// 数组排序
		for(int i = 1; i < arr.length; i++){ // 控制轮数
			for(int j = 1; j <= arr.length - i; j++){ // 控制次数
				if(arr[j - 1] > arr[j]){
					int temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
		// 获取数组的长度
		/*
		int len = arr.length;
		System.out.println(len);
		*/
		
		// 遍历数组
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
		// 数组中的每一个元素是一个整数
		// 此时i依次表示数组中的每一个元素
		// 增强for循环
		// 只能遍历数组而不能改变数组中的元素
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
		// 将数组中的元素依次拿出来拼接成一个字符串来返回
		/*
		String str = Arrays.toString(arr);
		System.out.println(str);
		*/
		
		// 获取最大值
		/*
		// 记录最大值
		int max = arr[0];
		for(int i = 1; i < arr.length; i++ ){
			
			if(arr[i] > max)
				max = arr[i];
			
		}
		System.out.println(max);
		*/
		
		// 记录最大值的下标
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