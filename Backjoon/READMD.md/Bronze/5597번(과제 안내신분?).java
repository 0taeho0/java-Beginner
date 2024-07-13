import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [] arr = new int[31];
		int A = 0;
		int [] arr1 = new int[3];
//		for(int i=0; i < 30; i++) {
//			arr[i] = i;
//		}
		for(int i=0; i < 28; i++) {
			int N = scan.nextInt();
			arr[N] = N;
		}
		for(int i=0; i < arr.length; i++) {
			if(arr[i] == 0) {
				arr1[A] = i;
				A++;
			}
		}
		System.out.print(arr1[1]+"\n"+arr1[2]);
	}

}
