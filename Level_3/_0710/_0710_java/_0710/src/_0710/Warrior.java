package _0710;

public class Warrior extends Hero{
	int 분노;
	
	public Warrior(String 이름, int 피, int 공격력) {
		super(이름, 피, 공격력);
		분노 = 30;
	}

	public int get분노() {
		return 분노;
	}
	public void set분노(int 분노) {
		this.분노 = 분노;
	}
	
	@Override
	void 자기소개() {
		System.out.printf("전사이름 : %s\n", 이름);
		System.out.printf("피 : %2d, 공격력 : %2d, 분노 : %d\n", 피, 공격력, 분노);
	}
	
	@Override
	void 공격(Monster 적) {
		super.공격(적);
		분노 += 20;
		System.out.printf("분노가 %d가 되었습니다", 분노);
	}
	
	void 분노의일격(Monster 적) {
		if(분노 >= 100) {
		자기소개();
		적.자기소개();
		System.out.println("♨　♨　♨　♨　♨　♨　♨　♨　♨　♨");
		System.out.println("　♨　♨　♨　♨　♨　♨　♨　♨　♨");
		System.out.printf("%s -> %s 공격\n", 이름, 적.get이름());
		int 데미지 = 적.get피() - (공격력*2);
		적.set피(데미지);
		System.out.printf("%s 체력 : %2d\n", 적.get이름(), 적.get피());
		System.out.println("♨　♨　♨　♨　♨　♨　♨　♨　♨　♨");
		System.out.println("　♨　♨　♨　♨　♨　♨　♨　♨　♨");
		분노 = 0;
		} else {
			System.out.println("분노가 부족하여 실패했습니다.");
		}
	}
}
