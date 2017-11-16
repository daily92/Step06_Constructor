package test.house;

public class MyHouse {
	public Aircon air= null;
	public MicroWave mw= null;
	public Television tv= null;
	
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
