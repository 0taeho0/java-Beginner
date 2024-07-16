package _0716;

public interface Fingerprint {
	String 지문정보="엄지문";
	
	 static void 지문인식(SmartPhone 폰, String 지문) {
		if(지문정보.equals(지문)) {
			System.out.println("잠금해제");
		} else {
			폰.전원끄기();
		}
	}
}
