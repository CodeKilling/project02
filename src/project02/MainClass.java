package project02;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sangjin sj = new sangjin();
		int select = 0;
		while(true) {
			System.out.print("1.김여진");
			System.out.print("2.박상진");
			System.out.print("3.김형석");
			System.out.print("4.문지은");
			System.out.print("5.박선영");
			
			select = sc.nextInt();
			
			switch (select) {
			case 1:
				break;
			case 2:sj.display();
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			default:
				break;
			}
		}
	}

}
