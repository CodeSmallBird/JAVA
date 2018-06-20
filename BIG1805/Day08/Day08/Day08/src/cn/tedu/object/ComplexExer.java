package cn.tedu.object;

public class ComplexExer {
	
	public static void main(String[] args) {
		
		Complex c1 = new Complex(3, 8);
		Complex c2 = new Complex(5, -3);
		
		Complex c = c1.add(c2);
		System.out.println(c.real);
		System.out.println(c.im);
		
	}

}

class Complex {

	// �����������Էֱ��ʾʵ�����鲿
	double real; // ʵ��
	double im; // �鲿

	// �ṩ��Ӧ�Ĺ��췽����ʵ�����鲿����
	public Complex(double real, double im) {
		this.real = real;
		this.im = im;
	}

	// ����ǰ�ĸ����ʹ��ݵĲ����������
	public Complex add(Complex c) {

		// ����ʵ��
		double real = this.real + c.real;
		// �����鲿
		double im = this.im + c.im;
		// ������������һ���µĶ����з���
		Complex co = new Complex(real, im);

		return co;

	}

}