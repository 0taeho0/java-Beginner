package ch04;

public class Pizza2 {
	int size;
	String type;
	
	public Pizza2() {
		size = 12;
		type = "슈퍼슈프림";
		
	}
	public Pizza2(int s, String t) {
		size = s;
		type = t;
	}
	
	public static void main(String[] args) {
			// TODO Auto-generated method stub
			Pizza obj1 = new Pizza();
			System.out.println("sizel:" + obj1.size + " type:" + obj1.type);
			
			Pizza obj2 = new Pizza(24, "포테이토");
			System.out.println("size2:" + obj1.size + " type:" + obj2.type);
			
			Pizza obj3=new Pizza(24, "슈퍼콤비네이션");
			System.out.println("size3:" + obj1.size + " type:" + obj3.type);
			
			
		
			
			
			
			
	}
}
