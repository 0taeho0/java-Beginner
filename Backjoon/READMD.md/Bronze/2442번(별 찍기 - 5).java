import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	
    	int A = scan.nextInt();
    	int count = 1;
    	
    	for(int i=0; i<A; i++) {
    		for(int z=A-1; z>i; z--) {
    			System.out.print(" ");
    		}
    		for(int j=1; j<=(count * 2)-1; j++) {
    			System.out.print("*");
    		}
    		System.out.println();
    		count++;
    	}
    }
}
