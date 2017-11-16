package text.mypac;

public class Computer {
	/*
	 * 	[ 필드(저장소) 정의하기 ]
	 * 
	 * 	1. 접근 지정자 ? 
	 * 			 (public/전체공개, (안붙인것)/같은 패키지 내에서만 공개)
	 * 	2. static or non static ? 
	 *    		 (static 붙이면 static 영역에 올라간 클래스에만 올라감
	 *    		  / 안 붙이면 new 할 때마다 새로운 저장소가 객체 내에 만들어져)
	 * 	3. 데이터 type ? 
	 * 			 (저장소에 뭘 담을지! 고민)
	 * 			 (돌려주는 것의 형태 : 숫자형 => int, double 젤 많이 써 
	 * 						   / 문자 => String)
	 * 			 (아무것도 돌려주지 않음 => void)
	 * 	4. 필드명 name ?
	 * 			 (저장소의 이름을 무엇으로 할까?)
	 * 	5. 초기값 ?
	 * 			 (int 경우 0, double 경우 0.0, 
	 * 			  string 이나 참조데이터 타입의 경우 null 같은 걸 넣어줘야 해)
	 */
	
	// (가상의 이 Computer 객체에) 필드에 출고 날짜를 담고싶다. 
		//1. 접근지정자 public(잘 모르겠다 싶으면 public) 
		//2. non static(고유해야 하니까) 
		//3. String 
		//4. productionDate => camel case, production_date => snake case
		//5. 초기값 null
	public String productionDate= null;
	
	// 필드에 Cpu 객체의 참조값을 담고 싶다.
	public Cpu cpu= null;
	
	/*
	 * 	[ Constructor (생성자) 정의하기 ]
	 * 
	 * 	1. 접근 지정자 ? 
	 * 	2. 생성자에 전달 받는 인자의 개수와 데이터 type ?
	 *  3. 생성자를 몇 개 정의할 지?
	 */
	
	// 생성자 (Constructor) 객체를 생성할 때 호출되는 부분
		//생성자 명은 클래스명과 같아야 해!
		//return 데이터 타입(void, int, ...)이 명시 되어 있지 않다.
		//생성자는 다중정의(여러 개 정의) 가능 (형태만 조금 다르면 됨) 
		//=> "생성자가 overloading 되어 있다"
		//이 객체를 생성해서 사용하는 용도에 따라 다양한 생성자 제공 가능
	public Computer() {
		System.out.println("Computer() 호출됨");
	}
	
	public Computer(int num) {
		System.out.println("Computer() 호출됨");
	}
	public Computer(int num, String name) {
		System.out.println("Computer() 호출됨");
	}
	// 인자로 String type 을 전달받는 생성자
	public Computer(String productionDate) {
		System.out.println("Computer(String ..) 호출됨");
		this.productionDate= productionDate;
		//System.out.println(productionDate);
	}
	// 인자로 Cpu type 을 전달받는 생성자
	public Computer(Cpu cpu) {
		this.cpu= cpu;
	}
	
	// 인자로 String type 과 Cpu type 을 전달받는 생성자
	public Computer(String productionDate, Cpu cpu) {
		this.productionDate= productionDate;
		this.cpu= cpu;
	}
	
		// 메소드 형태 => public void a()  |  public static void a() | public int a() | ...
		//public void a() {
			
		//}
	
		//new Computer(); 에서 () 는 생성자(Constructor)를 호출한 것
		//생성자 써도 되고 안 써도 돼. (작성을 안 해도 있다고 간주, 있으면 당연히 있다고 간주)
		//그럼 쓰는 이유는 ? 객체가 생성되는 시점에 작업할 것이 있으면, 
		//여기(생성자)에다 코딩해라~ 라고 알려주는 것
		//
	
	
	
	/*
	 * 	[ Method (기능) 정의하기 ]
	 *  
	 *  1. 접근 지정자?
	 *  2. static or non static?
	 *  3. 리턴 데이터 type?
	 *  4. Method 명?
	 *  5. Method 에 전달받는 인자의 개수와 데이터 type ?
	 */
	
	//1. 접근 지정자 ? public 
	//2. non static
	//3. return 데이터 type ? void => 어떤 데이터도 return 하지 않음!!
	//4. Method 명 ? doGame
	//5. Method 에 전달받는 인자의 개수, 데이터 type ? () => 0 개
	public void doGame() {
		System.out.println("게임을 해요!");
	}
	
	//int => 숫자로 돌려줌 => return 10; 과 같은 돌려주는 것이 있어야 함
	public int doGame2() {
		System.out.println("게임을 해요!");
		return 10;
	}
	
	public double doGame3() {
		System.out.println("게임을 해요!");
		return 10.1;
	}
	
	public boolean doGame4() {
		System.out.println("게임을 해요!");
		return true;
	}
	
	//' ' (싱글따옴표) => char
	public char doGame5() {
		System.out.println("게임을 해요!");
		return 'a';
	}
	
	//" " (더블따옴표) => String 
	public String doGame6() {
		System.out.println("게임을 해요!");
		return "a";
	}
	
	//this => Computer 타입 (<=> 클래스명)=> 데이터 타입에 클래스명 적으면 돼
	public Computer doGame7() {
		System.out.println("게임을 해요!");
		return this;
	}
	
}
