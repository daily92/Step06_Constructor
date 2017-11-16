package test.main;

import text.mypac.Computer;
import text.mypac.Cpu;

public class MainClass02 {
	public static void main(String[] args) {
		//System 이라는 class 에는 out 이라는 field(static) 참조한 것 
		//System. 하면 out 뜸 / out 이라는 field 안에는 PrintStream 이라는 데이터 type 
		System.out.println("main 메소드가 시작 되었습니다.");
// 이 구간 안에 heap 영역 객체 총 3 개 생성됨 (new 2 개, "2017년.." String 객체)
// String 객체는 new 하지 않고 " "로 쓰기만 해도 생성돼.
// stack= {com1(key 값: 16)} 
// heap 영역 = {type | Computer(16), String(17), Cpu(18)}
//		 Computer type(16) = {field | productionDate(17), cpu(18)}
//						   = {method| void doGame()}
//		 		=>=> 16. 하면 productionDate, cpu, doGame 다 사용할 수 있어!
		
		
		// Computer 객체를 생성해서 참조값을 com1 이라는 지역변수에 담아보세요.
			//지역변수 => 메소드 안에서 직접 선언한 것 => 메소드가 return 하면(끝나면) 사라져요.
			//지역변수 => stack 영역에 만들어져요. (일반 필드 => 객체 안에)
		Computer com1= new Computer();
			//콘솔창에 " Computer() 호출됨 " 뜸 => Computer() 생성자 생성해서 호출됨
		
		// com1 객체의 productionDate 에 "2017년 11월 16일" 을 
		// 대입연산자를 이용해서 대입해 보세요.
		com1.productionDate= "2017년 11월 16일";
		
		// com1 객체의 doGame() 메소드를 호출해 보세요.
		com1.doGame();
		
		// com1 객체의 cpu 에 Cpu type 객체의 참조값을 
		// 대입연산자를 이용해서 대입해 보세요.
		com1.cpu= new Cpu();  
			//Cpu type 객체의 참조값 얻어내기 => new Cpu();
//		
		System.out.println("main 메소드가 종료 됩니다.");
		
	}
}
