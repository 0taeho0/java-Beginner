package sw_Project;

import java.util.Scanner;

public class Calc {
	String op;
	int num1, num2, result;
	//생성자
	Calc(String op, int num1 ,int num2, int result){
		this.op = op;
		this.num1 = num1;
		this.num2 = num2;
		this.result = result;
	}
	
	
	
	public void op_add(String op, int num1 ,int num2, int result){
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
	
	public String Error_check(String op, Scanner scan){
		while(true) {
			if(op.equals("+") || op.equals("-") || op.equals("*")) break;
			else {
				System.out.println("다시 입력해주세요");
				System.out.println("연산자를 입력하세요");
				op = scan.next();
			}				
		}
		return op;
	}
}
