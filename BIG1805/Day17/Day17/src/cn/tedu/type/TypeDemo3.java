package cn.tedu.type;

import java.util.ArrayList;
import java.util.List;

public class TypeDemo3 {

	public static void main(String[] args) {

		// Number[] ns = new Integer[5];
		// List<Number> ns = new ArrayList<Integer>();

		List<Integer> ins = new ArrayList<>();
		ins.add(1);
		ins.add(2);
		ins.add(3);
		ins.add(4);

		List<Double> dos = new ArrayList<>();
		dos.add(1.5);
		dos.add(2.8);
		dos.add(3.4);
		dos.add(4.9);

		// print(ins);
		print(dos);
		// print(new ArrayList<String>());
	}

	// дһ������������Ԫ����������ֵ���͵��б�
	// ? extends Number ��ʾԪ�����Ϳ�����Number��������
	// ? extends ��/�ӿ� ��ʾ���������/�ӿڼ�������/�ӽӿڶ���
	// ���ܴ����Ԫ�ص����������Number --- �涨�˷��͵�����
	public static void print(List<? extends Number> list) {

		// �ܷ���list�����Ԫ�أ� ---ֻ�����null
		list.add(null);
		// list.add(new Integer(3));

		for (Number number : list) {
			System.out.println(number);
		}

	}

	// ���͵�����
	// ������Ԫ������ΪString���丸����б�
	// ? super String  ��ʾԪ��������String���丸��
	// ? super ��/�ӿ�  ��ʾ���������/�ӿڼ��丸��/���ӿڶ���
	// ע�⣺��ͬһ�������У�������ͬʱ�涨������
	public static void m(List<? super String> list) {
		
		// �ܷ���list�����Ԫ�أ�---����������޶�Ӧ�����͵Ķ���
		list.add("abc");
		list.add(null);
		
		for (Object object : list) {
			System.out.println(object);
		}
		
	}

}
