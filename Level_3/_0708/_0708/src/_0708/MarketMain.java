package _0708;

import java.util.Scanner;

public class MarketMain {

	public static void main(String[] args) {
		Market 마켓 = new Market("성일마켓");
		Customer 고객1 = new Customer("성지현", 10000);
		Scanner scan = new Scanner(System.in);
		boolean 진행 = true;

		while(진행) {		
			
			System.out.println("┌───────────────────────────────────┐");
			System.out.println("│      성일 마켓에 오신걸 환영합니다 	    │");
			System.out.println("└───────────────────────────────────┘");
			System.out.printf("당신은 누구신가요 (1)관리자 (2)호구 > ");
		
			if(scan.nextInt() == 1) {
				while(true) {
					System.out.printf("── 관리자 모드 ──");
					System.out.printf("선택하시오 (1)재고관리, (2)재고현황 (3)종료> ");
					int 관리자선택지 = scan.nextInt();
					if(관리자선택지 == 1) {
						마켓.재고관리();
					} else if(관리자선택지 == 2){
						마켓.재고현황();
					} else {
						System.out.println();
						break;
					}
				}
			} else {
				while(true) {
					System.out.println();
					System.out.println("── 호구 모드 ──");
					System.out.printf("선택하시오 (1)구매하기, (2)자기소개 (3)종료> ");
					
					int 호구선택지 = scan.nextInt();
					
					if(호구선택지 == 1) {
						마켓.판매(고객1);
					} else if(호구선택지 == 2){
						고객1.자기소개();
					} else {
						System.out.println();
						break;
					}
				}
			}
		}
	}
}
