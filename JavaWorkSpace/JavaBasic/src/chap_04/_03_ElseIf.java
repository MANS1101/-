package chap_04;

public class _03_ElseIf {

	public static void main(String[] args) {
		
		// ���ǹ� ElseIf
		
		// �Ѷ�� ���̵尡 ������ +1
		// �Ǵ� ���� �ֽ��� ������ +1
		// �Ǵ� ���̽� �Ƹ޸�ī�� +1
		
		boolean hallabongAde = true;
		boolean mangoJuice = true;
		
		if (hallabongAde) {
			System.out.println("�Ѷ�� ���̵� +1");
		} else if (mangoJuice) {
			System.out.println("���� �ֽ� +1");
		} else {
			System.out.println("���̽� �Ƹ޸�ī�� +1");
		}
		
		System.out.println("���� �ֹ� �Ϸ� #1");
		
		hallabongAde = false;
		mangoJuice = false;
		
		boolean orangeJuice = false;
		
		if (hallabongAde) {
			System.out.println("�Ѷ�� ���̵� +1");
		} else if (mangoJuice) {
			System.out.println("���� �ֽ� +1");
		} else if (orangeJuice) {
			System.out.println("������ �ֽ� +1");
		} else {
			System.out.println("���̽� �Ƹ޸�ī�� +1");
		}
		
		System.out.println("���� �ֹ� �Ϸ� #2");
		
		// else�� �� ����ϴ°� �ƴϴ�.
		
		if (hallabongAde) {
			System.out.println("�Ѷ�� ���̵� +1");
		} else if (mangoJuice) {
			System.out.println("���� �ֽ� +1");
		} else if (orangeJuice) {
			System.out.println("������ �ֽ� +1");
		} else {
			System.out.println("���̽� �Ƹ޸�ī�� +1");
		}
		
		System.out.println("���� �ֹ� �Ϸ� #3");
		
	}

}
