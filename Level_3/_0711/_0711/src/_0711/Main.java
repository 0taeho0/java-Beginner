package _0711;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Hero[] 히어로 = {
					new Warrior("택", 100, 20),
					new Mage("스랄", 100, 20)
					};
		Ork m1 = new Ork("몬스터", 100, 15);
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("직업을 선택하세요 > (1) 전사  (2) 법사");
		int 직업선택 = scan.nextInt();
		Hero 직업;
		if(직업선택 == 1) {
			직업 = 히어로[0];
		} else {
			직업 = 히어로[1];
		}
		직업.자기소개();
	}
}