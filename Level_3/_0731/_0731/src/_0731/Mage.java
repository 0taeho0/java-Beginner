package _0731;

public class Mage extends Hero{
	int ����;
	
	public Mage(String �̸�, int ü��, int ���ݷ�) {
		super(�̸�, ü��, ���ݷ�);
		���ݷ� = ���ݷ°��();
		���� = 30;
		�Ӽ� = "��";
	}				

	int ���ݷ°��() {
		return ���ݷ� + 5;
	}
	
	@Override
	void �ڱ�Ұ�() {
		super.�ڱ�Ұ�();
		System.out.printf("���� : %d | �Ӽ� : %s \n", ����, �Ӽ�);
	}

	@Override
	void ����(Monster ��) {
		�ڱ�Ұ�(); ��.�ڱ�Ұ�();
		
		System.out.printf("%s -> %s ����!\n", �̸�, ��.�̸�);
		��.ü�� -= ���ݷ�;
		���� += 10;
		
		�ڱ�Ұ�(); ��.�ڱ�Ұ�();
	}

	@Override
	void Ư������(Monster ��) {
		�ڱ�Ұ�(); ��.�ڱ�Ұ�();
		int Ư�����ݷ�;
		
		if(���� >= 100) {
			Ư�����ݷ� = ���ݷ� * 3;
			���� = 0;
		}else {
			Ư�����ݷ� = 0;
		}
		
		if(��.�Ӽ�.equals("��")) {
			System.out.printf("���� ��Ʈ�� ȿ���� �����ߴ�!\n");
			System.err.printf("����������������������������\n");
			System.out.printf("%s -> %s Ư������!", �̸�, ��.�̸�);
			
			��.ü�� -= Ư�����ݷ� * 3;
		}else {
			System.out.printf("Ư������ ���Ф�~��");
		}
		
		�ڱ�Ұ�(); ��.�ڱ�Ұ�();
	}
}