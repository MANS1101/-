package chap_04;

public class _11_Continue {

	public static void main(String[] args) {
		
		// ġŲ �ֹ� �մ��߿� ��� �մ��� �ִٰ� ����
		
		int max = 20;
		int sold = 0;
		int noShow = 17;
		for (int i = 1; i <= 50; i++) {
			System.out.println(i + "�� �մ�, �ֹ��Ͻ� ġŲ�� ���Խ��ϴ�.");
			
			// �մ��� ���ٸ�?
			if (i == noShow) {
				System.out.println(i + "�� �մ�, �ڸ��� ���� ���� �մԿ��� ��ȸ�� �Ѿ�ϴ�.");
				continue; // continue�� �Ʒ� �ڵ� �������� �ʰ� �ٽ� for������ ���ư�
			}
			
			sold++;
			if (sold == max) {
				System.out.println("���� ��ᰡ ��� �����Ǿ����ϴ�.");
				break;
			}
		}
		
	}

}
