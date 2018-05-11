package cn.tedu.day06;

public class Demo2 {

	public static void main(String[] args) {
		int[][] scores=new int[][]{{1,2},{5,6,7,8},{9}};
		for(int i=0;i<scores.length;i++){
			System.out.println("第"+(i+1)+"次外循环");
			for(int j=0;j<scores[i].length;j++){
				System.out.println(scores[i][j]);
			}
		}
		char[] ch=new char[2];
		System.out.println(ch[0]);
		/*System.out.println(a);
		System.out.println(a[0]);//null
		System.out.println(a.length);//3
		System.out.println(a[0].length);//NullPointerException
		System.out.println(a[0][0]);//NullPointerException
*/
	}

}
