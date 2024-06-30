package sw_Project;

public class Hero {
	String 이름;
	int 공격력;
	int 체력;
	int 방어력;
	
	public Hero(String 이름, int 공격력, int 체력, int 방어력) {
		this.이름 = 이름;
		this.공격력 = 공격력;
		this.체력 = 체력;
		this.방어력 = 방어력;
	}
	
	public Hero(String 이름) {
		this(이름, 20, 100, 10);
	}

	public String get이름() {
		return 이름;
	}

	public void set이름(String 이름) {
		this.이름 = 이름;
	}

	public int get공격력() {
		return 공격력;
	}

	public void set공격력(int 공격력) {
		this.공격력 = 공격력;
	}

	public int get체력() {
		return 체력;
	}

	public void set체력(int 체력) {
		this.체력 = 체력;
	}

	public int get방어력() {
		return 방어력;
	}

	public void set방어력(int 방어력) {
		this.방어력 = 방어력;
	}
	
	void 공격(Hero enemy) {
		enemy.체력 -= 공격력-enemy.방어력;
	}
	
	void 크리티컬공격(Hero enemy) {
		enemy.체력 -= 공격력*2; 
	}
	
	void 명상(Hero enemy) {
		체력 += 20;
	}
}
