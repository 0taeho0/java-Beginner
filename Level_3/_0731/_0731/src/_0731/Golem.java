package _0731;

public class Golem extends Monster{
	
	int ���;
		
	public Golem(String �̸�, int ü��, int ���ݷ�) {
		super(�̸�, ü��, ���ݷ�);
		��� = 20;
		�Ӽ� = "��";
	}
	
	@Override
	void �ڱ�Ұ�() {
		super.�ڱ�Ұ�();
		System.out.printf("�г� : %d | �Ӽ� : %s\n",���, �Ӽ�);
	}
	
	void ����(Hero ��){
		��� += 15;
		
		�ڱ�Ұ�(); ��.�ڱ�Ұ�();
		if(��� >= 100) {
			System.err.printf("%s�� ü���� ȸ��!.", �̸�);
			ü�� = 100;
			��� = 0;
		}
		
		if(��.�Ӽ�.equals("��")) {
			System.err.printf("�ҼӼ����� ȿ���� �����ߴ�!\n");
			System.out.printf("ǮǮǮǮǮǮǮǮǮǮǮǮǮǮǮ\n");
			System.out.printf("%s -> %s Ư������!", �̸�, ��.�̸�);
			
			��.ü�� -= ���ݷ� * 2;
		}else {
			System.out.printf("%s -> %s ����!\n", �̸�, ��.�̸�);
			��.ü�� -= ���ݷ� * 2;
		}
	}
}
