package text.mypac;

public class Computer {
	/*
	 * 	[ �ʵ�(�����) �����ϱ� ]
	 * 
	 * 	1. ���� ������ ? 
	 * 			 (public/��ü����, (�Ⱥ��ΰ�)/���� ��Ű�� �������� ����)
	 * 	2. static or non static ? 
	 *    		 (static ���̸� static ������ �ö� Ŭ�������� �ö�
	 *    		  / �� ���̸� new �� ������ ���ο� ����Ұ� ��ü ���� �������)
	 * 	3. ������ type ? 
	 * 			 (����ҿ� �� ������! ���)
	 * 			 (�����ִ� ���� ���� : ������ => int, double �� ���� �� 
	 * 						   / ���� => String)
	 * 			 (�ƹ��͵� �������� ���� => void)
	 * 	4. �ʵ�� name ?
	 * 			 (������� �̸��� �������� �ұ�?)
	 * 	5. �ʱⰪ ?
	 * 			 (int ��� 0, double ��� 0.0, 
	 * 			  string �̳� ���������� Ÿ���� ��� null ���� �� �־���� ��)
	 */
	
	// (������ �� Computer ��ü��) �ʵ忡 ��� ��¥�� ���ʹ�. 
		//1. ���������� public(�� �𸣰ڴ� ������ public) 
		//2. non static(�����ؾ� �ϴϱ�) 
		//3. String 
		//4. productionDate => camel case, production_date => snake case
		//5. �ʱⰪ null
	public String productionDate= null;
	
	// �ʵ忡 Cpu ��ü�� �������� ��� �ʹ�.
	public Cpu cpu= null;
	
	/*
	 * 	[ Constructor (������) �����ϱ� ]
	 * 
	 * 	1. ���� ������ ? 
	 * 	2. �����ڿ� ���� �޴� ������ ������ ������ type ?
	 *  3. �����ڸ� �� �� ������ ��?
	 */
	
	// ������ (Constructor) ��ü�� ������ �� ȣ��Ǵ� �κ�
		//������ ���� Ŭ������� ���ƾ� ��!
		//return ������ Ÿ��(void, int, ...)�� ��� �Ǿ� ���� �ʴ�.
		//�����ڴ� ��������(���� �� ����) ���� (���¸� ���� �ٸ��� ��) 
		//=> "�����ڰ� overloading �Ǿ� �ִ�"
		//�� ��ü�� �����ؼ� ����ϴ� �뵵�� ���� �پ��� ������ ���� ����
	public Computer() {
		System.out.println("Computer() ȣ���");
	}
	
	public Computer(int num) {
		System.out.println("Computer() ȣ���");
	}
	public Computer(int num, String name) {
		System.out.println("Computer() ȣ���");
	}
	// ���ڷ� String type �� ���޹޴� ������
	public Computer(String productionDate) {
		System.out.println("Computer(String ..) ȣ���");
		this.productionDate= productionDate;
		//System.out.println(productionDate);
	}
	// ���ڷ� Cpu type �� ���޹޴� ������
	public Computer(Cpu cpu) {
		this.cpu= cpu;
	}
	
	// ���ڷ� String type �� Cpu type �� ���޹޴� ������
	public Computer(String productionDate, Cpu cpu) {
		this.productionDate= productionDate;
		this.cpu= cpu;
	}
	
		// �޼ҵ� ���� => public void a()  |  public static void a() | public int a() | ...
		//public void a() {
			
		//}
	
		//new Computer(); ���� () �� ������(Constructor)�� ȣ���� ��
		//������ �ᵵ �ǰ� �� �ᵵ ��. (�ۼ��� �� �ص� �ִٰ� ����, ������ �翬�� �ִٰ� ����)
		//�׷� ���� ������ ? ��ü�� �����Ǵ� ������ �۾��� ���� ������, 
		//����(������)���� �ڵ��ض�~ ��� �˷��ִ� ��
		//
	
	
	
	/*
	 * 	[ Method (���) �����ϱ� ]
	 *  
	 *  1. ���� ������?
	 *  2. static or non static?
	 *  3. ���� ������ type?
	 *  4. Method ��?
	 *  5. Method �� ���޹޴� ������ ������ ������ type ?
	 */
	
	//1. ���� ������ ? public 
	//2. non static
	//3. return ������ type ? void => � �����͵� return ���� ����!!
	//4. Method �� ? doGame
	//5. Method �� ���޹޴� ������ ����, ������ type ? () => 0 ��
	public void doGame() {
		System.out.println("������ �ؿ�!");
	}
	
	//int => ���ڷ� ������ => return 10; �� ���� �����ִ� ���� �־�� ��
	public int doGame2() {
		System.out.println("������ �ؿ�!");
		return 10;
	}
	
	public double doGame3() {
		System.out.println("������ �ؿ�!");
		return 10.1;
	}
	
	public boolean doGame4() {
		System.out.println("������ �ؿ�!");
		return true;
	}
	
	//' ' (�̱۵���ǥ) => char
	public char doGame5() {
		System.out.println("������ �ؿ�!");
		return 'a';
	}
	
	//" " (�������ǥ) => String 
	public String doGame6() {
		System.out.println("������ �ؿ�!");
		return "a";
	}
	
	//this => Computer Ÿ�� (<=> Ŭ������)=> ������ Ÿ�Կ� Ŭ������ ������ ��
	public Computer doGame7() {
		System.out.println("������ �ؿ�!");
		return this;
	}
	
}
