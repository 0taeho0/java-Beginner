package _0709;

public class Student2 extends Student1{

	Student2(int 학번, String 이름, String 학과) {
		super(학번, 이름, 학과);
		영교시 = false;
	}
	
	@Override
	protected void 자기소개(){
		super.자기소개();
		System.out.println("저는 2학년이라서 도제면접을 준비합니다.");
	}
	
	protected void 정산기() {
		System.out.println("정보처리 산업기사를 준비합니다.");
	}
	
	
}
