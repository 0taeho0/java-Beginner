import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int result = 0;
		
		int [] arr = new int[5];
		for(int i=0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
		for(int i=0; i < arr.length; i++) {
			result += arr[i] * arr[i];
		}
		
		System.out.println(result % 10);
	}

}
