package cn.tedu.day07.demo1;
/**
 * 此更适合做功能
 * @author adminitartor
 *
 */
public class OperateStudent {
	public void study(Student stu){
		System.out.println(stu.getName()+"在认真的学习");
	}
	public void liaomei(Student stu){
		System.out.println("小姐姐,我叫"+stu.getName()+"  我年龄"+stu.getAge()+"  可以加个微信");
	}
	public void dajia(Student stu){
		System.out.println(stu.getName()+"冲动打架了");
	}
}
