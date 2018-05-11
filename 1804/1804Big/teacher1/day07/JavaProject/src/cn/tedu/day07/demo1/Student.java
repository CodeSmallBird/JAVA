package cn.tedu.day07.demo1;
/**
 * 此类更适合做数据
 * @author adminitartor
 *
 */
public class Student {
	private String name;
	private  int age;
	private  String stuNo;
	
	public Student(){
		this("赵六",20,"S003");
	}
	public Student(String name,int age,String stuNo){
		this.name=name;
		this.age=age;
	    this.stuNo=stuNo;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>0 && age<120){
			this.age = age;
		}else{
			age=18;
		}
		
	}
	public String getStuNo() {
		return stuNo;
	}
	public void setStuNo(String stuNo) {
		char c=stuNo.charAt(0);
		if(c=='S' || c=='s'){
			this.stuNo = stuNo;
		}else{
			stuNo=null;
		}	
		
	}
	
	
}
