package cn.tedu.day07.demo1;

public class TestClass {

	public static void main(String[] args) {
		Student stu1=new Student();
		stu1.setName("zhangsan");
		stu1.setAge(20);
		stu1.setStuNo("S001");
		
		OperateStudent os=new OperateStudent();
		os.study(stu1);
		os.liaomei(stu1);
		os.dajia(stu1);
		System.out.println(stu1.getName());
		Student stu2=new Student("王五",30,"S002");
		
		Student stu3=new Student();
		stu3.setName("田七");
		stu3.setAge(25);
		stu3.setStuNo("S007");
		

	}

}
