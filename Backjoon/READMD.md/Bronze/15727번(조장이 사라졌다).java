import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	
    	int A = scan.nextInt();
    	
    	if(A % 5 != 0) {
    		System.out.println((A/5)+1);
    	}else {
    		System.out.println(A/5);
    	}
    }
}
