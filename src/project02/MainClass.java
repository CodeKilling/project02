package project02;

import java.util.Scanner;


import jieun.TestJieun;

import hyungseok.TestHyungseok;
import sangjin.sangjin;
import yeojin.Pj02_yj;


public class MainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TestJieun tj = new TestJieun();
		int select = 0;

		
		TestHyungseok hs = new TestHyungseok();
		Pj02_yj yj = new Pj02_yj();
		sangjin sj = new sangjin();

		while(true) {
			System.out.print("1.김여진");
			System.out.print("2.박상진");
			System.out.print("3.김형석");
			System.out.print("4.문지은");
			System.out.print("5.박선영");
			
			select = sc.nextInt();
			
			switch (select) {
				case 1:
					yj.print_yj();
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
					break;
				default:
					break;
			}
		}
	}
}
