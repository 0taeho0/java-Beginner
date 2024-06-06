package sw_Project;

import java.util.Scanner;

public class 계산기 {

	public static void main(String[] args) {
		//연산자, 계산할 수, 계산할 값, 결과
		Scanner scan = new Scanner(System.in);
		String op = "";
		int num1 = 0;
		int num2 = 0;
		int result = 0;

		while(true) {
			System.out.println("연산을 할 수를 차례대로 2개 입력하세요");
			num1 = scan.nextInt();
			num2 = scan.nextInt();
			Error_check(op, scan);
			op_add(num1, num2, op, result);
		}
	}
	static String Error_check(String op, Scanner scan) {
		while(true) {
			System.out.println("연산자를 입력하세요");
			op = scan.next();
			if(op.equals("+") || op.equals("-") || op.equals("*")) break;
			else System.out.println("다시 입력해주세요");
		}
		return op;
	}
	static void op_add(int num1, int num2, String op, int result) {
		switch (op) {
		case "+": 
			result += num1 + num2;
		case "-": 
			result += num1 - num2;
		case "*": 
			result += num1 * num2;
		}
		System.out.println(result);
	}
}
