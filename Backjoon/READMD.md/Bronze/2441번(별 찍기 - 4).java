import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	
    	int A = scan.nextInt();
    	
    	for(int i=0; i<A; i++) {
    		for(int z=0; z<i; z++) {
    			System.out.print(" ");
    		}
    		for(int j=A; j>i; j--) {
    			System.out.print("*");
    		}
    		System.out.println();
    	}
    }
}
