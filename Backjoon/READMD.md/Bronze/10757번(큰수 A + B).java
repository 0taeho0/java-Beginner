import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputA = scanner.next();
        String inputB = scanner.next();
        
        BigInteger A = new BigInteger(inputA);
        BigInteger B = new BigInteger(inputB);
        
        System.out.println(A.add(B));
    }
}
