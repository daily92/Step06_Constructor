package test.main;

import test.house.Aircon;
import test.house.MicroWave;
import test.house.MyHouse;
import test.house.Television;

public class MainClass04 {
	public static void main(String[] args) {
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
