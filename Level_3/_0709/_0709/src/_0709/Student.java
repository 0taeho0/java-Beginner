package _0709;

public class Student {
	
	private int 학번;
	private String 학과;
	private String 이름;
	
	Student(int 학번, String 학과, String 이름) {
		this.학번 = 학번;
		this.이름 = 이름;
		this.학과 = 학과;
	}
	
	public int get학번() {
		return 학번;
	}
	
	public void set학번(int 학번) {
		this.학번 = 학번;
	}

	public String get이름() {
		return 이름;
	}

	public void set이름(String 이름) {
		this.이름 = 이름;
	}

	public String get학과() {
		return 학과;
	}

	public void set학과(String 학과) {
		this.학과 = 학과;
	}


	protected void 자기소개() {
		System.out.printf("%s의 자기소개 \n", 이름);
		System.out.printf("학번 : %d / 학과 : %s\n", 학번, 학과);
	}
	
	protected void 자격증() {
		System.out.printf("저는 ITQ 한글, 엑셀, 파포, 컴활 자격증을 취득하였습니다.\n");
	}
}
