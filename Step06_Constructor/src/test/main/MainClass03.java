package test.main;

import text.mypac.Computer;
import text.mypac.Cpu;

public class MainClass03 {
	public static void main(String[] args) {
		System.out.println("main �޼ҵ尡 ���� �Ǿ����ϴ�.");
		
		//�ƹ� �͵� ���� x  (�⺻ ������ ȣ��)
			//default (�⺻) ������
				//�����ڰ� �� ����� �⺻������ �� ���� �˾Ƽ� ȣ���
				//�ٵ� �����ڰ� ���� �� ���, �⺻�����ڴ� ������Ƿ�, �⺻������ �������� ��
		Computer com1= new Computer();
		//String type ����
		Computer com2= new Computer("2017.11.16");
		
		// Cpu type �� ���޹޴� �����ڸ� �̿��ؼ� Computer ��ü�� �����ϰ�
		// �������� com3 ��� ������ ��� ������.
		// (�����ڿ� ���ڸ� �����ϴ� ���� �����ϼ���)
			//Cpu cpu= newCpu(); �� ���Կ����� �̿��ؼ�... (???)
		Computer com3= new Computer(new Cpu());
		//Cpu �� �������� ���޹ް� (Cpu type)
		// �ٸ� ��
		//Cpu cpu= new Cpu();
		//Computer com3= new Computer(cpu);
		
		// String type �� Cpu type �� ��� ���޹޴� �����ڸ� �̿��ؼ�
		// Computer ��ü�� �����ϰ� �������� com4 ��� ������ ��� ������.
		Computer com4= new Computer("2017", new Cpu());
			//String productionDate= "2017";
			//Cpu cpu= new Cpu(); �� ����
		
		/*	Computer.java ��
		*	public Computer(String productionDate, Cpu cpu) {
		*		this.productionDate= productionDate;
		*		this.cpu= cpu;
		*	}
		*	���� "2017" 		��  => productionDate ��
		*	   "new Cpu()"  ��  => Cpu cpu �� 			���޵Ǿ���.
		*/
		
		//new Computer ���� ctrl+space �ϸ� �ߴ� �͵� => �������� ����
	}
}
