package _0625;

import java.util.Scanner;

public class Market{
	String 마켓이름;
	Scanner scan = new Scanner(System.in);
	Item[] 물건 = new Item[5];
	
	public Market(String 마켓이름) {
		this.마켓이름 = 마켓이름;

		물건[0] = new Item("사과", 2000, 20);
		물건[1] = new Item("오렌지", 1000, 100);
		물건[2] = new Item("생선", 5000, 30);
	}

	void 판매(Customer 손님){
		System.out.println("물건구매 페이지입니다!");
		System.out.printf("구매할 물건을 선택하세요");
		
		for(Item i : 물건) {
			if(i == null) {
				System.out.print(">");
				break;
			}
			System.out.printf("%d.%s ",i.물건번호, i.get물건명());
		}
	}
	
	int 구매번호 = scan.nextInt();
	
	switch (구매번호) {
	case 1: 
	default:
	}
	void 재고관리(){
		System.out.println("재고관리 페이지입니다!");
		boolean 진행 = true;
		int 메뉴;
		while(진행) {			
			System.out.print("메뉴를 선택하세요.(1)재고현황, (2)재고수정, (3)종료 >");
			메뉴 = scan.nextInt();

			switch (메뉴) {
			case 1: { 
				재고현황();
				break;
			}
			case 2: { 
				System.out.print("수정할 물건을 선택하세요.\n");
				
				for(Item i : 물건) {
					if(i==null) {
						System.out.print(">");
						break;
					}
					System.out.printf("%d.%s  ",i.물건번호, i.get물건명());			
				}
				
				메뉴 = scan.nextInt();
				Item 수정물건 = 물건[메뉴-1];
				
				System.out.printf("< %s > 수정할 항목을 선택하세요. >",수정물건.get물건명());
				System.out.printf("(1)물건명 (2)가격 (3)재고 (4)수정종료>");
				int 수정항목 = scan.nextInt();
				
				switch (수정항목) {
				case 1: 
					System.out.printf("물건명의 현재값 : %s, 수정할 물건명 > ",수정물건.get물건명());
					String 수정할물건명 = scan.next();
					수정물건.set물건명(수정할물건명);
					break;
				case 2:
					System.out.printf("가격의 현재값 : %d, 수정할 가격 > ",수정물건.get가격());
					int 수정할가격 = scan.nextInt();
					수정물건.set가격(수정할가격);
					break;
				case 3:
					System.out.printf("재고의 현재값 : %d, 수정할 재고 > ",수정물건.get재고());
					int 수정할재고 = scan.nextInt();
					수정물건.set재고(수정할재고);
					break;
				case 4:
					
				default:
					System.out.println("값 오류");
					break;
				}
				break;
			}
			case 3: {
				진행 = false;
				break;
			}
			default:
				break;
			}
		}
	}
	
	void 재고현황(){
		System.out.println(마켓이름+" 현재 재고는...");
		System.out.println(Item.물건명번호+" 가지의 물건이 있습니다.");
		
		for(Item i : 물건) {
			if(i==null) break;
			System.out.println(i.물건번호);
			System.out.println(i.get물건명());
			System.out.println(i.get가격());
			System.out.println(i.get재고());			
		}
	}
}
