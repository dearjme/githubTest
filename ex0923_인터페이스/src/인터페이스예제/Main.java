package �������̽�����;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// ����� ���
		// ����Ƚ�� üũ, 5������ ������ �� �ְԲ� ����!
		// 1. �� 5������ ����
		// 2. ���� �����ϴ� ���
		// 3. ���� ���
		// 4. �� ������ ������ ����� �ִ� ��ȸ�� 3��
		// 5. ���� ���� Ƚ���� ���

		Scanner sc = new Scanner(System.in);	
		PlusGame p1 = new PlusGame();   // plusgame �����˰���
		//GameDummy p1 = new GameDummy(); // �ӽ� �׽�Ʈ�뵵!

		int cnt = 0;  // ������ ������ üũ�ϴ� ����!
		System.out.println("PlusGame!!!");
		System.out.println("������ �Է��ϼ���.");

		for (int i = 0; i < 5; i++) {
			p1.makeRandom();

			for (int j = 0; j < 3; j++) {
				//String quiz = p1.getQuizMsg();
				System.out.print(p1.getQuizMsg());
				int answer = sc.nextInt();
				
				if (p1.checkAnswer(answer)) {
					// ������ �����!
					cnt++;
					break;
				} else {
					// ������ ������ ���ߴ�!
					System.out.println("�����Դϴ�~");
					//System.out.println("���� Ƚ���� " + cnt + "�Դϴ�.");
					
				}
			}
				
		}
		// ������ Ƚ�� ���
		System.out.println("������ ������ " + cnt + "�� �Դϴ�~");

	}
}
