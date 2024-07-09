package _0709;

public class Student1 extends Student{
	
	protected boolean 영교시;
	
	Student1(int 학번,  String 학과,String 이름){
		super(학번, 학과, 이름);
		영교시 = true;
	}
	
	
	@Override
	protected void 자기소개() {
		super.자기소개();
		if(영교시==true) System.out.printf("저는 1학년이라서 0교시를 합니다!^^\n");
	}
}
