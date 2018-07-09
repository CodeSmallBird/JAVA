public class ArrayDemo {

	public static void main(String[] args){
		
		int i;
		i = 5;
		
		/*
		int[] arr ;
		arr = new int[3];
		arr[1] = 7;
		System.out.println(arr[1]);
		*/
		
		/*
		int[] arr ;
		arr = new int[]{2,1,8,5,7};
		arr[1] = 9;
		System.out.println(arr[1]);
		*/
		
		// 第三种定义方式只能定义的时候就得初始化，不能分开初始化
		/*
		int[] arr ;
		arr = {2,4,7,8,5};
		System.out.println(arr[1]);
		*/
		
		/*
		int arr[] = new int[5];
		arr[2] = 5;
		System.out.println(arr[2]);
		*/
		// int i, j;
		// arr1和arr2都是数组
		/*
		int[] arr1, arr2;
		arr1 = new int[3];
		arr2 = new int[2];
		*/
		
		// arr1是一个数组，arr2是一个变量
		double arr1[], arr2;
		arr1 = new double[3];
		arr2 = 6;
		System.out.println(arr1[0]);
		System.out.println(arr1);
		
		String[] arr = new String[3];
		System.out.println(arr[0]);
	
	}

}