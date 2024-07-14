import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        int e = scan.nextInt();
        int f = scan.nextInt(); 
       
        int result = a * e - b * d;
        
        int x = (c * e - b * f) / result;
        int y = (a * f - c * d) / result;

        // 결과 출력
        System.out.println(x + " " + y);

    }
}
