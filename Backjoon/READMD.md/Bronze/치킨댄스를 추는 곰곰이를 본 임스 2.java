import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int count = 0;
		
		for(int i=0; i<N; i++) {
			String n = scan.next();
			if(Integer.parseInt(n.substring(2))<=90) {
				count++;
			}
		}
		System.out.println(count);
	}

}
