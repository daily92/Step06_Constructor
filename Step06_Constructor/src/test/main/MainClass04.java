package test.main;

import test.house.Aircon;
import test.house.MicroWave;
import test.house.MyHouse;
import test.house.Television;

public class MainClass04 {
	public static void main(String[] args) {
		System.out.println("메인 메소드가 시작 되었습니다.");
		//문자열 객체를 만드는 방법 두 가지
		String a= "abcd";
		String b= new String("abcd");
		
		System.out.println(a);
		System.out.println(b);
		System.out.println("--------");
		
		//문자열 내용은 같아도 참조값이 달라! 그래서 콘솔에 안 찍힘
		if(a==b) {
			System.out.println("a 와 b 는 참조값이 같아요~");
		};
		//문자열 내용 비교하려면? String 의 method 인 .equal 를 사용해야 해
		if(a.equals(b)) {
			System.out.println("a 와 b 는 내용이 같아요!");
		}
		
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
