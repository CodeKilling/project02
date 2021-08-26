package project02;

import java.util.Scanner;

import hyungseok.TestHyungseok;

public class MainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int select = 0;
		
		TestHyungseok hs = new TestHyungseok();
		
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
			case 2:
				break;
			case 3:
				hs.display();
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
