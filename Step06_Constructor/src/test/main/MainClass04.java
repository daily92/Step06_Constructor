package test.main;

import test.house.Aircon;
import test.house.MicroWave;
import test.house.MyHouse;
import test.house.Television;

public class MainClass04 {
	public static void main(String[] args) {
		System.out.println("���� �޼ҵ尡 ���� �Ǿ����ϴ�.");
		//���ڿ� ��ü�� ����� ��� �� ����
		String a= "abcd";
		String b= new String("abcd");
		
		System.out.println(a);
		System.out.println(b);
		System.out.println("--------");
		
		//���ڿ� ������ ���Ƶ� �������� �޶�! �׷��� �ֿܼ� �� ����
		if(a==b) {
			System.out.println("a �� b �� �������� ���ƿ�~");
		};
		//���ڿ� ���� ���Ϸ���? String �� method �� .equal �� ����ؾ� ��
		if(a.equals(b)) {
			System.out.println("a �� b �� ������ ���ƿ�!");
		}
		
		/*
		 *  ���ڷ� Aircon, MicroWave, Television ��ü�� ���޹޴� �����ڸ� �̿��ؼ�
		 *  MyHouse ��ü�� ���� �� 
		 *  �������� house1 �̶�� ������ ��� ������.
		 */
		
		MyHouse house1
			= new MyHouse(new Aircon(), new MicroWave(), new Television());
		
		house1.air.cool();
		house1.air.warm();
		house1.mw.makeBread();
		house1.tv.view();
	}
}
