package cn.tedu.day05;

import java.util.Scanner;

public class DemoArray2_1 {
    /**
     *  获取数组中的最大值和最小值
     *  
     *  从键盘录入5个数据存储到数组
     *  再从数组中遍历求最大值和最小值
     *  输出结果
     * @param args
     */
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int[] nums=new int[5];
		for(int i=1;i<=5;i++){
			System.out.println("请输入第"+i+"个数据");
			nums[i-1]=input.nextInt();
		}
		int max=nums[0];
		int min=nums[0];
		for(int i=1;i<5;i++){
			if(max<nums[i]){
				max=nums[i];
			}
			if(min>nums[i]){
				min=nums[i];
			}			
		}
		System.out.println("max="+max);
		System.out.println("min="+min);

	}

}
