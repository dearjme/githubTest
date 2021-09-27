package 인터페이스예제;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 입출력 담당
		// 정답횟수 체크, 5문제를 제시할 수 있게끔 로직!
		// 1. 총 5문제를 제시
		// 2. 난수 생성하는 기능
		// 3. 문제 출력
		// 4. 한 문제당 정답을 맞출수 있는 기회는 3번
		// 5. 맞은 정답 횟수를 출력

		Scanner sc = new Scanner(System.in);	
		PlusGame p1 = new PlusGame();   // plusgame 실제알고리즘
		//GameDummy p1 = new GameDummy(); // 임시 테스트용도!

		int cnt = 0;  // 정답의 개수를 체크하는 역할!
		System.out.println("PlusGame!!!");
		System.out.println("정답을 입력하세요.");

		for (int i = 0; i < 5; i++) {
			p1.makeRandom();

			for (int j = 0; j < 3; j++) {
				//String quiz = p1.getQuizMsg();
				System.out.print(p1.getQuizMsg());
				int answer = sc.nextInt();
				
				if (p1.checkAnswer(answer)) {
					// 정답을 맞췄다!
					cnt++;
					break;
				} else {
					// 정답을 맞추지 못했다!
					System.out.println("오답입니다~");
					//System.out.println("남은 횟수는 " + cnt + "입니다.");
					
				}
			}
				
		}
		// 정답의 횟수 출력
		System.out.println("정답의 개수는 " + cnt + "개 입니다~");

	}
}
