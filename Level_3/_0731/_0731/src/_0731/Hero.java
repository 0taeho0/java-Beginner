package _0731;

public abstract class Hero {
	String 이름;
	int 체력;
	int 공격력;
	String 속성;
	boolean 생사여부;
	
	public Hero(String 이름, int 체력, int 공격력) {
		this.이름 = 이름;
		this.체력 = 체력;
		this.공격력 = 공격력;
		생사여부 = true;
	}
	
	void 자기소개() {
		System.out.printf("이름 : %s | 체력 : %d | 공격력 : %d | 속성 : %s\n"
				, 이름, 체력, 공격력, 속성);
	}
	
	void 죽기() {
		생사여부 =! 생사여부;
		System.out.printf("%s가 전사했다\n", 이름);
	}
	
	abstract void 공격(Monster 적);
	abstract void 특수공격(Monster 적);
}
