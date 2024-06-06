package sw_Project;

import java.util.Scanner;

public class CalcMain {

	public static void main(String[] args) {
		//연산자, 계산할 수, 계산할 값, 결과
		Scanner scan = new Scanner(System.in);
		
		System.out.println("계산할 숫자 1번째 숫자를 입력하시오");
		int num1 = scan.nextInt();
		System.out.println("계산할 숫자 2번째 숫자를 입력하시오");
		int num2 = scan.nextInt();
		
		System.out.println("연산자를 입력하시오");
		String op = scan.next();
		
		Calc c = new Calc(op, num1, num2, 0);
		
		while(true) {
			System.out.println("계산을 하실려면 (1) 아니면 (2)");
			int i = scan.nextInt();
			
			if(i == 1) {
				c.Error_check(op, scan);
				c.op_add(op, num1, num2, 0);
			}else if(i!=1 && i!=2) {
				System.out.println("다시입력하세요");
				continue;
			} else System.out.println("수고하세요");
		}
	}
}
