package sw_Project;

import java.util.Scanner;

public class HeroMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Hero hero = new Hero("히어로");
		Hero enemy = new Hero("탈주닌자", 10, 80, 20);
		int random = 0;
		int rand = 0;
		int count = 0;
		int hel_count = 0;
		System.out.print("Hero 게임입니다 시작하시려면 (1) 아니면(2)");
		int num = scan.nextInt();
		if(num == 1) {
			System.out.println("시작합니다");
			while(true) {
				random = (int)(Math.random()*3)+1;
				rand = (int)(Math.random()*4)+1;
				if(random == 3) {
					System.out.printf("%s가 %s에게 크리티컬 공격!!! \n", hero.이름, enemy.이름);			
					hero.크리티컬공격(enemy);
					System.out.printf("현재 내체력 : %d, 현재 적체력 : %d \n", hero.get체력(), enemy.get체력());	
					System.out.println("----------------------------------");
					count += 1;
				}else{
					System.out.printf("%s가 %s를 공격합니다 \n", hero.이름, enemy.이름);			
					hero.공격(enemy);
					System.out.printf("현재 내체력 : %d, 현재 적체력 : %d \n", hero.get체력(), enemy.get체력());	
					System.out.println("----------------------------------");
					count += 1;
				}
				if(enemy.get체력() <= 0) {
					System.out.println("히어로 승리");
					System.out.printf("총 공격 횠수 : %d, %s가 회복 횟수 : %d", count, enemy.이름, hel_count);
					break;
				}
				if(rand == 2) {
					System.out.printf("%s가 명상합니다. 체력이 20 회복되었습니다. \n",enemy.이름);
					enemy.명상(enemy);
					System.out.printf("현재 내체력 : %d, 현재 적체력 : %d \n", hero.get체력(), enemy.get체력());	
					System.out.println("----------------------------------");
					hel_count += 1;
				} else {
					System.out.printf("%s가 명상을 하지 못하였습니다. \n",enemy.이름);
					System.out.printf("현재 내체력 : %d, 현재 적체력 : %d \n", hero.get체력(), enemy.get체력());	
					System.out.println("----------------------------------");
				}
				
			}
		} else {
			System.out.println("안녕히가세요");
		}
	}
}