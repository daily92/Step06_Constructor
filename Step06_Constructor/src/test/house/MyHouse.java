package test.house;

public class MyHouse {
	public Aircon air= null;
	public MicroWave mw= null;
	public Television tv= null;
	
	// ����Ʈ ������
	public MyHouse() {
		
	}
	// ���ڷ� Aircon, MicroWave, Television ��ü�� ���޹޴� ������
	public MyHouse(Aircon air, MicroWave mw, Television tv){
		this.air= air;
		this.mw= mw;
		this.tv= tv;
	}
}
