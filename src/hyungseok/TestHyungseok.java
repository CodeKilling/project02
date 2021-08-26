package hyungseok;

import java.util.Scanner;

public class TestHyungseok {
	public void display() {
		Scanner scan = new Scanner(System.in);
		int sel;
		boolean bool = true;
		while(bool) {
			System.out.println("1.저녁인사 2.메뉴소개 3.나가기");
			sel = scan.nextInt();
			switch(sel) {
				case 1:
					display01();
					break;
				case 2:
					display02();
					break;
				case 3:
					System.out.println("반복문을 나가겠습니다.");
					bool = false;
					break;
				default :
					System.out.println("1~3 사이의 숫자만 입력하세요.");
			}
		}
	}
	public void display01() {
		System.out.println("저녁식사는 맛있게 하셨나요?");
	}
	public void display02() {
		System.out.println("저녁메뉴는 든든한 집밥입니다.");
	}
}
