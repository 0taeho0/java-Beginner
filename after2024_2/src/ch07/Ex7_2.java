package ch07;

class Parent {
	int X=10;
}

class Child extends Parent {
	int X=20;
	void method() {
		System.out.println("x=" + X);
		System.out.println("this.x" + this.X);
		System.out.println("super.x="+ super.X);
	}
	
}

public class Ex7_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();
		c.method();

	}

}
