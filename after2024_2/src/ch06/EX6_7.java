package ch06;

class Data2 { int x; }

public class EX6_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data2 d = new Data2();
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		change(d);
		System.out.println("After change(d)");
		System.out.println("Ex6_7 main() : x = " +d.x);
}

static void change(Data2 d) { // 참조형 매개변수
d.x = 1000;
System.out.println("Ex6_7 change() : x = " + d.x);

		

	}

}
