import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	
    	BigInteger N = new BigInteger(scan.next());
    	BigInteger T = new BigInteger(scan.next());
    	
    	System.out.println(N.multiply(T));
    }
}
