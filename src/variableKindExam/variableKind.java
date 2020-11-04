package variableKindExam;

public class variableKind {
	
	// 멤버 변수
	
	static int number = 4; // 클래스 변수	
	int number2 = 3; // 인스턴스 변수
	int number3 = 5; // 인스턴스 변수
	
	// 멤버 메서드
	
	// static 메서드
	static int add(int a, int b) {
		// 클래스 메서드는 number2와 number3라는 인스턴스 변수는 접근할 수 없다
		return a+b;
	}
	
	// 인스턴스 메서드
	int sub() {		
		return number2-number3;
	}
	
	public static void main(String[] args) {
		
		
		String name = "han"; // 지역변수 
		
		System.out.println(variableKind.number); // 클래스 변수는 클래스로 바로접근가능하다
		
		variableKind kind = new variableKind();
		System.out.println(kind.number2); // 인스턴스 변수는 인스턴스 생성 후 접근가능하다.
		System.out.println(kind.sub()); // -2, 인스턴스 메서드는 인스턴스 변수에 접근가능하다.
	}

}
