package test.main;

import text.mypac.Computer;
import text.mypac.Cpu;

public class MainClass02 {
	public static void main(String[] args) {
		//System �̶�� class ���� out �̶�� field(static) ������ �� 
		//System. �ϸ� out �� / out �̶�� field �ȿ��� PrintStream �̶�� ������ type 
		System.out.println("main �޼ҵ尡 ���� �Ǿ����ϴ�.");
// �� ���� �ȿ� heap ���� ��ü �� 3 �� ������ (new 2 ��, "2017��.." String ��ü)
// String ��ü�� new ���� �ʰ� " "�� ���⸸ �ص� ������.
// stack= {com1(key ��: 16)} 
// heap ���� = {type | Computer(16), String(17), Cpu(18)}
//		 Computer type(16) = {field | productionDate(17), cpu(18)}
//						   = {method| void doGame()}
//		 		=>=> 16. �ϸ� productionDate, cpu, doGame �� ����� �� �־�!
		
		
		// Computer ��ü�� �����ؼ� �������� com1 �̶�� ���������� ��ƺ�����.
			//�������� => �޼ҵ� �ȿ��� ���� ������ �� => �޼ҵ尡 return �ϸ�(������) �������.
			//�������� => stack ������ ���������. (�Ϲ� �ʵ� => ��ü �ȿ�)
		Computer com1= new Computer();
			//�ܼ�â�� " Computer() ȣ��� " �� => Computer() ������ �����ؼ� ȣ���
		
		// com1 ��ü�� productionDate �� "2017�� 11�� 16��" �� 
		// ���Կ����ڸ� �̿��ؼ� ������ ������.
		com1.productionDate= "2017�� 11�� 16��";
		
		// com1 ��ü�� doGame() �޼ҵ带 ȣ���� ������.
		com1.doGame();
		
		// com1 ��ü�� cpu �� Cpu type ��ü�� �������� 
		// ���Կ����ڸ� �̿��ؼ� ������ ������.
		com1.cpu= new Cpu();  
			//Cpu type ��ü�� ������ ���� => new Cpu();
//		
		System.out.println("main �޼ҵ尡 ���� �˴ϴ�.");
		
	}
}
