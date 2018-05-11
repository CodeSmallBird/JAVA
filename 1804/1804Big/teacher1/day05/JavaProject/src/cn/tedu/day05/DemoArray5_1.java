package cn.tedu.day05;

import java.util.Scanner;

public class DemoArray5_1 {
	/**
	 * 折半查找
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// 数据数组源  
	    int[] data = { 12, 16, 19, 22, 25, 32, 39, 39, 48, 55, 57,58,63, 68, 69, 70, 78, 84, 88, 90 };
	    int max = data.length;
    	System.out.println(data.length);
    	
        System.out.println("请输入您要查找的数字：");  
        Scanner sc = new Scanner(System.in);  
        int KeyValue = sc.nextInt();  
        // 调用折半查找  
        if (Search(KeyValue,data,max)) {  
            // 输出查找次数  
            System.out.println("找到了");  
        } else {  
            // 输出没有找到数据  
            System.out.println("抱歉,数据数组源中找不到您输入的数字");  
        }  
    }  
  
    // 折半查找法  
    public static boolean Search(int k,int[] data,int max) {  
        int left = 0;// 左边界变量  
        int right = max ;// 右边界变量  
        int middle;// 中位数变量  
        while (left <= right) {  
            middle = (left + right) / 2;  
            if (k < data[middle]) {  
                right = middle - 1;// 查找前半段  
            } else if (k > data[middle]) {  
                left = middle + 1;// 查找后半段  
            } else if (k == data[middle]) {  
                System.out.println("Data[" + middle + "] = " + data[middle]);  
                return true;  
            }  
             
        }  
        return false;  
    }  
	

}
