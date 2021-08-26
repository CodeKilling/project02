package yeojin;

import java.util.Scanner;

public class Pj02_yj {

	Scanner input = new Scanner(System.in);	
	boolean bool = true;
	public void display()
	{
		while(bool)
		{
			System.out.println("1.안녕 2.반갑 3.나가기");
			int num;
			num = input.nextInt();
		
			switch(num)
			{
			case 1 : print1();
				break;
			case 2 : print2();
				break;
			case 3 : exit();
				break;
			}
		}
	}
	public void print1()
	{
		System.out.println("하세요");
	}
	public void print2()
	{
		System.out.println("습니다");
	}
	public void exit()
	{
		bool = false;
	}
}
