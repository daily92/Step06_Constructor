package test.house;

public class MyHouse {
	/*
	 *  참조 데이터 type 필드에 null 을 넣고 싶으면
	 *  1) 직접 	= null;	넣거나 (air)
	 *  2) 생략해도 알아서 넣어줌! (mw, tv)
	 */
	// 멤버 필드 => 선언만 해줘도 알아서 null 넣어줌! 
	public Aircon air= null;
	public MicroWave mw;
	public Television tv;
	
	// 디폴트 생성자
	public MyHouse() {
		
	}
	// 인자로 Aircon, MicroWave, Television 객체를 전달받는 생성자
	public MyHouse(Aircon air, MicroWave mw, Television tv){
		this.air= air;
		this.mw= mw;
		this.tv= tv;
	}
}
