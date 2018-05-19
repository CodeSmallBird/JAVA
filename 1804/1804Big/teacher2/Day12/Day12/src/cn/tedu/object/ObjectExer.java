package cn.tedu.object;

public class ObjectExer {

	public static void main(String[] args) {

		Student s1 = new Student();
		s1.setName(null);
		s1.setNo(new String("12"));

		Student s2 = new Student();
		s2.setName("Amy");
		s2.setNo("12");

		System.out.println(s1.equals(s2));

	}

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
	// equals结果为true，哈希码必须一致
	// 要尽量保证每一个对象的哈希吗不同且做到散列分布
	public int hashCode() {
		final int prime = 31; // 基数
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((no == null) ? 0 : no.hashCode());
		return result;
		// return 1;
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

	// public boolean equals(Object obj) {
	//
	// if (this == obj)
	// return true;
	//
	// if (obj == null)
	// return false;
	//
	// if (this.getClass() != obj.getClass())
	// return false;
	//
	// Student s = (Student) obj;
	//
	// if (this.name == null) {
	// if (s.name != null)
	// return false;
	// } else if (!this.name.equals(s.name)) {
	// return false;
	// }
	//
	// if(this.no == null) {
	// if(s.no != null)
	// return false;
	// } else if(!this.no.equals(s.no)) {
	// return false;
	// }
	//
	// return true;
	//
	// }
}
