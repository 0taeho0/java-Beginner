import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	
    	int N = scan.nextInt();
    	int T = scan.nextInt();
    	
    	for(int i=0; i<N; i++) {
    		for(int j=0; j<T; j++) {
    			System.out.print("*");
    		}
    		System.out.println();
    	}
    }
}
