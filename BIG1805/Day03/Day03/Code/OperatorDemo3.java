public class OperatorDemo3 {

	/**
		验证运算符的优先级
	*/
	public static void main(String[] args){
		
		// 如果先算的是算术运算，那么结果应该是3 > 6;如果先算的是关系运算，那么结果应该是true+4会产生错误
		// System.out.println(3 > 2 + 4);
		// 如果先算的是位运算，那么结果应该是3+7=10;如果先算的是算术运算，那么结果应该是5^5=0
		// System.out.println(3 + 2 ^ 5);
		// System.out.println(3 & 3 > 1);
		// System.out.println(3 << 3 > 1);
		// System.out.println(3 << 3 + 1);
		// System.out.println(~3 > 1);
		// System.out.println(~3 + 1);
		// System.out.println(3 > 2 ? 3 : 2 + 5);
		// System.out.println(3 > 2 ? 4 : 3 & 3);
		// System.out.println(3 > 2 ? true : false & false);
		int i = 5; 
		// 先把i的值5取出来标记为结果，i自增为6，将标记的结果5赋值给i
		i = i++;
		// 将i的值5取出来进行取反运算，同时i自增为6，将取反的结果赋值给i
		System.out.println(~i++);
		
		//boolean b = 3 > 2 ? 5 : 1 > 3;
		
	}

}