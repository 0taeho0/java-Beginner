package sw212;

public class PmonMain {
	public static void main(String[] args) {
		Pmon 나 = new Pmon();
		Pmon 해람 = new Pmon();
		
		나.상태창();
		해람.상태창();
		
		나.몇마리 = 70;
		System.out.println(해람.몇마리);
	}
	
}
