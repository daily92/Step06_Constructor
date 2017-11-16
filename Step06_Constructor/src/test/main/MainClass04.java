package test.main;

import test.house.Aircon;
import test.house.MicroWave;
import test.house.MyHouse;
import test.house.Television;

public class MainClass04 {
	public static void main(String[] args) {
		/*
		 *  인자로 Aircon, MicroWave, Television 객체를 전달받는 생성자를 이용해서
		 *  MyHouse 객체를 생성 후 
		 *  참조값을 house1 이라는 변수에 담아 보세요.
		 */
		
		MyHouse house1
			= new MyHouse(new Aircon(), new MicroWave(), new Television());
		
		house1.air.cool();
		house1.air.warm();
		house1.mw.makeBread();
		house1.tv.view();
	}
}
