package _0716;

public class Iphone extends SmartPhone implements Fingerprint{
	String 얼굴정보;
	
	public Iphone(String 모델명, String 색상, int 볼륨, String 얼굴정보) {
		super(모델명, 색상, 볼륨);
		this.얼굴정보 = 얼굴정보;
	}
	
	@Override
	void 전원켜기() {
		System.out.printf("사과가 나타나면서 전원이 켜졌다.\n");
	}

	@Override
	void 전원끄기() {
		System.out.printf("사과가 나타나면서 전원이 꺼졌다.\n");
	}

	@Override
	void set볼륨(int 볼륨) {
		this.볼륨 = 볼륨;
		System.out.println(모델명+" 볼륨이 : " + 볼륨);
	}
	
	void 얼굴인식(String 얼굴정보) {
		if(this.얼굴정보.equals(얼굴정보)) {
			System.out.println("잠금해제");
		} else {
			전원끄기();
		}
	}
}
