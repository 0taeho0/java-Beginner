package _0710;

public class Hero {
	String 이름;
	int 피;
	int 공격력;
	
	public Hero(String 이름, int 피, int 공격력) {
		this.이름 = 이름;
		this.피 = 피;
		this.공격력 = 공격력;
	}
	
	public String get이름() {
		return 이름;
	}
	public void set이름(String 이름) {
		this.이름 = 이름;
	}
	public int get피() {
		return 피;
	}
	public void set피(int 피) {
		this.피 = 피;
	}
	public int get공격력() {
		return 공격력;
	}
	public void set공격력(int 공격력) {
		this.공격력 = 공격력;
	}

	void 자기소개() {
		System.out.printf("영웅 이름 : %s\n", 이름);
		System.out.printf("피 : %2d, 공격력 : %2d\n", 피, 공격력);
	}
	
	void 공격(Monster 적){
		자기소개();
		적.자기소개();
		System.out.println("─────────────────────────────");
		System.out.printf("%s -> %s 공격\n", 이름, 적.get이름());
		int 데미지 =  적.get피() - 공격력;
		적.set피(데미지);
		System.out.printf("%s 체력 : %2d\n", 적.get이름(), 적.get피());
		System.out.println("─────────────────────────────");
	
	
	}
}
