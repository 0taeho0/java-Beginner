package  ch6.Test1;

	
class Car2 {
	//속성
	String company = "현대자동차" ;
	String model = "제네시스G80" ;
	String color = "검정" ;
	int speed = 180 ;
	Car2(String color, int speed){
		color = color;
		speed = speed;
	}
				
}
public class CarExample {
	
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	Car2 myCar = new Car2("검정", 9);
	
	//Car my Car();
	//myCar = new Car();
		
	//Car mycar2new car();
		
	System.out.println("제작회사:" + myCar.company);
	System.out.println("모델명:" + myCar.model);
	System.out.println("컬러:" + myCar.color);
	System.out.println("최대속도:" + myCar.speed);
		

	}

}