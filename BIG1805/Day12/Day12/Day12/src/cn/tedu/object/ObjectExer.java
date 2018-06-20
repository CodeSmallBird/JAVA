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
	// equals���Ϊtrue����ô��ϣ��һ��
	// ��ͬ����Ĺ�ϣ�벻ͬ�Ҿ������ظ�
	public int hashCode() {
		// ����
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
	// // �ж϶���ĵ�ַ�Ƿ�һ��
	// if (this == obj)
	// return true;
	//
	// // �жϲ����Ƿ�Ϊ��
	// if (obj == null)
	// return false;
	//
	// // �ж϶���������Ƿ�һ��
	// if (this.getClass() != obj.getClass())
	// return false;
	//
	// // �ж�����ֵ�Ƿ�һ��
	// Student s = (Student) obj;
	//
	// // �ж������Ƿ�һ��
	// if (this.name == null) {
	// if (s.name != null)
	// return false;
	// } else if (!this.name.equals(s.name)) {
	// return false;
	// }
	//
	// // �ж�ѧ���Ƿ�һ��
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