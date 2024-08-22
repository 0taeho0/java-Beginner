package ch06;

class Name{
	static void print() {
	System.out.println("나는 정말할 수 있습니다");
	}

	
void print2() {
	System.out.println("이 프로그램 또한 설명을 잘 할수있습니다");
 }
}

public class EX6_71 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Name.print();
		//Name.print2();
		
		Name name = new Name(); // 인스턴스 생성
		name.print2(); //인스턴스를 생성하여야만 호출이 가능
	}

}
