import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int N = scan.nextInt();
        int M = scan.nextInt();
        int [] arr = new int[N];
        int max = 0;
        
        for(int i=0; i < arr.length; i++) {
        	arr[i] = scan.nextInt();
        }
        
        for(int i=0; i < arr.length; i++) {
        	for(int j=i+1; j<arr.length; j++) {
        		for(int k=j+1; k < arr.length; k++) {
        			if((arr[i] != arr[j]) && (arr[i] != arr[k])
        					&&(arr[k] != arr[j])){
        				if(arr[i] + arr[j] + arr[k] <= M) {
        					if(arr[i] + arr[j] + arr[k] > max) {
            					max = arr[i] + arr[j] + arr[k];
        					}
        				}
        			}
        		}
        	}
        }
        System.out.println(max);
    }
}
