public class MethodDemo4 {
	
	public static void main(String[] args){
		
		int i = 6;
		change(i);
		System.out.println(i);
		
		int[] arr = new int[3];
		arr[0] = 3;
		// change(arr);
		// System.out.println(arr[0]);
		
		changeRef(arr);
		System.out.println(arr[0]);
		
	}
	public static void change(int i){
		i *= 2;
	}
	public static void change(int[] arr){
		arr[0] += 5;
	}
	public static void changeRef(int[] arr){
		arr = new int[5];
	}
	
}