package project02;

import java.util.Scanner;

import psy.TeamProject_Psy;
import jieun.TestJieun;
import hyungseok.TestHyungseok;
import sangjin.sangjin;
import yeojin.Pj02_yj;

public class MainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TestJieun tj = new TestJieun();
		int select = 0;

		TeamProject_Psy tPsy = new TeamProject_Psy();
		TestHyungseok hs = new TestHyungseok();
		Pj02_yj yj = new Pj02_yj();
		sangjin sj = new sangjin();

		while(true) {
			System.out.print("1.김여진");
			System.out.print("2.박상진");
			System.out.print("3.김형석");
			System.out.print("4.문지은");
			System.out.print("5.박선영\n");
			
			select = sc.nextInt();
			
			switch (select) {
			case 1:
				yj.display();
				break;
			case 2:
				sj.display();
				break;
			case 3:
				hs.display();
				break;
			case 4:
				tj.display();
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
