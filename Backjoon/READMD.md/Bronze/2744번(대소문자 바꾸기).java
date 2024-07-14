import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String A = scan.next();
		String [] arr = new String[A.length()];
		for(int i=0; i<arr.length; i++) {
			arr[i] = A.substring(i, i+1);
		}
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == arr[i].toUpperCase()) {
				arr[i] = arr[i].toLowerCase();
			} else {
				arr[i] = arr[i].toUpperCase();
			}
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}
	}

}대소문자 바꾸기 
