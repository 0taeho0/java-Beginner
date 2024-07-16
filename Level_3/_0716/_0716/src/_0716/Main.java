package _0716;

public class Main {
	public static void main(String[] args) {
		SmartPhone[] 폰가방 = {
				new Iphone("아이폰 14", "블랙", 50, "니얼굴"),
				new Samsung("S24","화이트", 50, "니카드")
		};
		
		for(SmartPhone i : 폰가방) {
			i.자기소개();
			i.전원켜기();
			i.set볼륨(100);
		}
	}

}
