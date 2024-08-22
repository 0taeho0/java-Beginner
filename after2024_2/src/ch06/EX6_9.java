package ch06;

class MyMath2 {
	long a, b;
	
	long add(){ return a + b; }
	long subtract() { return a - b; }
	long multiply() { return a * b; }
	double divide() { return a / b; }
	
	
	static long  add(long a, long b) { return a + b;}
	static long  subtract(long a, long b) { return a - b;}
	static long  multiply(long a, long b) { return a * b;}
	static double  divide(long a, long b) { return a / (double) b;}
	
	
}

public class EX6_9 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyMath2 mm = new MyMath2();
		mm.a =200l;
		mm.b = 100l;

		System.out.println("static매개변수 a+b:"+MyMath2.add(200l,100l));
		System.out.println("static매개변수 a-b:"+MyMath2.subtract(200l,100l));
		System.out.println("static매개변수 a*b:"+MyMath2.multiply(200l,100l));
		System.out.println("static매개변수 a/b:"+MyMath2.divide(200l,100l));
		
		System.out.println("인스턴스매개변수없음 a-b:" +mm.add());
		System.out.println("인스턴스매개변수없음 a+b:" +mm.subtract());
		System.out.println("인스턴스매개변수없음 a*b:" +mm.multiply());
		System.out.println("인스턴스매개변수없음 a/b:" +mm.divide());


	}

}
