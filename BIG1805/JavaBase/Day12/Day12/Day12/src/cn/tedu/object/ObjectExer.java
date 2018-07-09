package cn.tedu.object;

public class ObjectExer {

}

class Student {

	private String name;
	private String no;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	@Override
	// equals结果为true，那么哈希码一致
	// 不同对象的哈希码不同且尽量不重复
	public int hashCode() {
		// 基数
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((no == null) ? 0 : no.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (no == null) {
			if (other.no != null)
				return false;
		} else if (!no.equals(other.no))
			return false;
		return true;
	}

	// @Override
	// public boolean equals(Object obj) {
	//
	// // 判断对象的地址是否一致
	// if (this == obj)
	// return true;
	//
	// // 判断参数是否为空
	// if (obj == null)
	// return false;
	//
	// // 判断对象的类型是否一致
	// if (this.getClass() != obj.getClass())
	// return false;
	//
	// // 判断属性值是否一致
	// Student s = (Student) obj;
	//
	// // 判断姓名是否一致
	// if (this.name == null) {
	// if (s.name != null)
	// return false;
	// } else if (!this.name.equals(s.name)) {
	// return false;
	// }
	//
	// // 判断学号是否一致
	// if (this.no == null) {
	// if (s.no != null)
	// return false;
	// } else if (!this.no.equals(s.no)) {
	// return false;
	// }
	//
	// return true;
	// }

}