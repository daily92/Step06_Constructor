package test.main;

import text.mypac.Computer;
import text.mypac.Cpu;

public class MainClass03 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작 되었습니다.");
		
		//아무 것도 전달 x
		Computer com1= new Computer();
		//String type 전달
		Computer com2= new Computer("2017.11.16");
		
		// Cpu type 을 전달받는 생성자를 이용해서 Computer 객체를 생성하고
		// 참조값을 com3 라는 변수에 담아 보세요.
		// (생성자에 인자를 전달하는 법을 연습하세요)
			//Cpu cpu= newCpu(); 로 대입연산자 이용해서... (???)
		Computer com3= new Computer(new Cpu());
		// 다른 답
		//Cpu cpu= new Cpu();
		//Computer com3= new Computer(cpu);
		
		// String type 과 Cpu type 을 모두 전달받는 생성자를 이용해서
		// Computer 객체를 생성하고 참조값을 com4 라는 변수에 담아 보세요.
		Computer com4= new Computer("2017", new Cpu());
			//String productionDate= "2017";
			//Cpu cpu= new Cpu(); 와 같음
		
		/*	Computer.java 의
		*	public Computer(String productionDate, Cpu cpu) {
		*		this.productionDate= productionDate;
		*		this.cpu= cpu;
		*	}
		*	에서 "2017" 		은  => productionDate 에
		*	   "new Cpu()"  는  => Cpu cpu 로 			전달되어짐.
		*/
		
		//new Computer 에서 ctrl+space 하면 뜨는 것들 => 생성자의 구조
	}
}
