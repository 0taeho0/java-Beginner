package _0627;

public class MarketMain {

	public static void main(String[] args) {
		Market 마켓 = new Market("성일마켓");
		Customer 나 = new Customer("정연택", 100000);
		System.out.println(마켓);
		System.out.println(마켓.마켓이름);
		System.out.println(마켓.물건[0].get물건명());
		System.out.println(Item.물건명번호);
		마켓.판매(나);
	}
}
