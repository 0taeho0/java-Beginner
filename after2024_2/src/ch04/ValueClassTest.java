package ch04;

	class Circle {
		String color;
		int radius;
		static int num;
		double calcArea() {
			return 3.14 * radius *radius;
		}
	}

		
public class ValueClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle a;
		a = new Circle();
		a.radius = 100;
		a.color = "Blus";
		double area = a.calcArea();
		Circle.num = 99;
		System.out.println("a드색상:" + a.color + " 원의 면적 = " + " static num:" +Circle.num);
			
		Circle b;
		b=new Circle();
			b.radius = 20;
			b.color = "White";
			area = b.calcArea();
			Circle.num += 1;
			System.out.println("b필드색상: " + b.color + " 원의 면적 = " + area +" static num:" +Circle.num);
				
			Circle c;
			c= new Circle();
			area= c.calcArea();
			System.out.println("c필드색상: " + c.color + " 원의 면적 = " + area + " static num:" +Circle.num);
			
			//test
			int i= 10;
			int j= 20;
			int sum = i + j + 100;
				

				
				
	}

}
