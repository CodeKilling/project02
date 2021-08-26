package yeojin;

import java.util.Scanner;

public class Pj02_yj {

	Scanner input = new Scanner(System.in);	
	public void display()
	{
		System.out.println("1.짜장은 역시 2.탕수육은 역시");
		int num;
		num = input.nextInt();
	
		switch(num)
		{
		case 1 : System.out.println("간짜장");
		case 2 : System.out.println("찹쌀 탕수육");
		case 3 : break;
			
		}
		
	
	}
}
