package yeojin;

import java.util.Scanner;

public class Pj02_yj {

	Scanner input = new Scanner(System.in);	
	public void display()
	{
		System.out.println("1.안녕 2.반갑 역시 3.나가기");
		int num;
		num = input.nextInt();
	
		switch(num)
		{
		case 1 : System.out.println("하세요.");
		case 2 : System.out.println("습니다.");
		case 3 : break;
			
		}
		
	
	}
}
