import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String A = scan.next();
        int N = scan.nextInt();
        System.out.println(A.substring(N-1 ,N));
    }
}
