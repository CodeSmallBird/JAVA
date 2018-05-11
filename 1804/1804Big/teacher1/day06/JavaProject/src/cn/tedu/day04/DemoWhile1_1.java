package cn.tedu.day04;

public class DemoWhile1_1 {
	/**
	 * 2015年培养学员8万人，
	 * 每年增长25%，请问按此增长速度，
	 * 到哪一年培训学员人数将达到20万人？
	 * 分析:
	 *    1.构建数据
	 *        int year=2015;
	 *        double rate=0.25;
	 *        int people=8;
	 *    2.处理业务  
	 *        循环的规律,每年都增长25%,所以可以用循环
	 *        while(people<20){
	 *        	//按照规律增长
	 *          //year++;
	 *        }
	 *    3.输出year
	 *       
	 * @param args
	 */
	public static void main(String[] args) {
		int year=2015;
		double rate=0.25;
		double people=8;
		//处理业务
		while(people<20){
			//按照规律增长
			people=people+people*rate;
			year++;
		}
		System.out.println("year="+year);
	}
}
