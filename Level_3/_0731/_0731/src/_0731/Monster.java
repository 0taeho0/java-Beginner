package _0731;

public class Monster {
	String �̸�;
	int ü��;
	int ���ݷ�;
	String �Ӽ�;
	boolean ���翩��;
	
	public Monster(String �̸�, int ü��, int ���ݷ�) {
		this.�̸� = �̸�;
		this.ü�� = ü��;
		this.���ݷ� = ���ݷ�;
		���翩�� = true;
	}
	
	void �ڱ�Ұ�() {
		System.out.printf("�̸� : %s | ü�� : %d | ���ݷ� : %d | �Ӽ� : %s\n"
				, �̸�, ü��, ���ݷ�, �Ӽ�);
	}
	
	void �ױ�() {
		���翩�� =! ���翩��;
		System.out.printf("%s�� ��������\n", �̸�);
	}
}
