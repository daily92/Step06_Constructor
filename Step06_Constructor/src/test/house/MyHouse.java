package test.house;

public class MyHouse {
	/*
	 *  ���� ������ type �ʵ忡 null �� �ְ� ������
	 *  1) ���� 	= null;	�ְų� (air)
	 *  2) �����ص� �˾Ƽ� �־���! (mw, tv)
	 */
	// ��� �ʵ� => ���� ���൵ �˾Ƽ� null �־���! 
	public Aircon air= null;
	public MicroWave mw;
	public Television tv;
	
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
