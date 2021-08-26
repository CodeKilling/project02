package project02;

import java.util.Scanner;

import psy.TeamProject_Psy;

public class MainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int select = 0;
		
		TeamProject_Psy tPsy = new TeamProject_Psy();
		
		while(true) {
			System.out.print("1.김여진");
			System.out.print("2.박상진");
			System.out.print("3.김형석");
			System.out.print("4.문지은");
			System.out.print("5.박선영\n");
			
			select = sc.nextInt();
			
			switch (select) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				boolean flag = true;
				int n = 0;
				
				while(flag) {
					tPsy.selectList();
					n = sc.nextInt();
					
					switch (n) {
					case 1:
						tPsy.display01();
						break;
					case 2:
						tPsy.display02();
						break;
					case 3:
						flag = false;
						break;
					default:
						System.out.println("only 1~3.");
						break;
					}
				}
				
				break;
			default: break;
			}
		}
	}

}
