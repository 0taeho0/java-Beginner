import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	int count = 0;
    	String [] arr = {"Never gonna give you up",
    					"Never gonna stop",
    					"Never gonna tell a lie and hurt you",
    					"Never gonna say goodbye",
    					"Never gonna make you cry",
    					"Never gonna run around and desert you",
    					"Never gonna let you down"};
    	int N = scan.nextInt();
    	String [] arr2 = new String[N];
    	
    	for(int i=0; i < arr2.length; i++) {
    		arr2[i] = scan.next();
    		for(int j=0; j < arr.length; j++) {
    			if(arr2[i].equals(arr[j])) {
    				count++;
    			}else {
    				continue;
    			}
    		}
    	}
    	if(count == N) {
    		System.out.println("No");
    	}else {
    		System.out.println("Yes");
    	}
    }
}
