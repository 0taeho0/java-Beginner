package ch6.Test4;
//OverLoding

class MyAdd {
	int add(int a,int b) { return a+b;}
	long add(int a,long b){ return a+b;}
	float add(long a,float b){ return (a+b) / 2F;}
	double add(long a, long b){ return (a+b)/2;}
	
	int add(int[]a) {
		int result = 0;
		for(int i=0; i <a.length;i++) {
			result += a[i];
		}
		return result;
	}
}

public class OverLoadingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyAdd mm = new MyAdd();
		System.out.println("A : " + mm.add(6,7));
		System.out.println("A : " + mm.add(6,7L));
		System.out.println("A : " + mm.add(6L,7F));
		System.out.println("A : " + mm.add(6L,7L));
		
		int[] a= {6,7,8,9,1,2,3,4,5,10};
		System.out.println("E : "+ mm.add(a));
		
		
					
					}
				}
		

	


