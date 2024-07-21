import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	
    	int A = scan.nextInt();
    	
    	for(int i=0; i<A; i++) {
    		for(int j=A; j>i; j--) {
    			System.out.print("*");
    		}
    		System.out.println();
    	}
    }
}
