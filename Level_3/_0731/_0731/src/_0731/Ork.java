package _0731;

public class Ork extends Monster{
	
	int �г�;
		
	public Ork(String �̸�, int ü��, int ���ݷ�) {
		super(�̸�, ü��, ���ݷ�);
		�г� = 60;
		�Ӽ� = "Ǯ";
	}
	
	@Override
	void �ڱ�Ұ�() {
		super.�ڱ�Ұ�();
		System.out.printf("�г� : %d | �Ӽ� : %s\n",�г�, �Ӽ�);
	}
	
	void ����(Hero ��){
		int Ư�����ݷ�;
		
		�ڱ�Ұ�(); ��.�ڱ�Ұ�();
		�г� += 10;
		if(�г� >= 100) {
			System.err.printf("%s�� ȭ����.", �̸�);
			Ư�����ݷ� = ���ݷ� * 2;
			�г� = 0;
		}else {
			Ư�����ݷ� = ���ݷ�;
		}
		
		if(��.�Ӽ�.equals("��")) {
			System.err.printf("���Ӽ����� ȿ���� �����ߴ�!\n");
			System.out.printf("ǮǮǮǮǮǮǮǮǮǮǮǮǮǮǮ\n");
			System.out.printf("%s -> %s Ư������!", �̸�, ��.�̸�);
			
			��.ü�� -= Ư�����ݷ� * 2;
		}else {
			System.out.printf("%s -> %s ����!\n", �̸�, ��.�̸�);
			��.ü�� -= Ư�����ݷ� * 2;
		}
	}
}
