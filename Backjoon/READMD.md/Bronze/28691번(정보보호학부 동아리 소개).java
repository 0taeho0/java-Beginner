import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	String A = scan.next();
    	
    	if(A.equals("M")) {
    		System.out.println("MatKor");
    	}else if(A.equals("W")) {
    		System.out.println("WiCys");
    	}else if(A.equals("C")) {
    		System.out.println("CyKor");
    	}else if(A.equals("A")) {
    		System.out.println("AlKor");
    	}else{
    		System.out.println("$clear");
    	}
    }
}
