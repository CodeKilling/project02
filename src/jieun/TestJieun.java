package jieun;

import java.util.Scanner;

public class TestJieun {
	Scanner sc = new Scanner(System.in);
	private boolean bool = true;
	public void display() {
		while(bool) {
			System.out.println("1. 출력문1   2. 출력문2   3. 나가기");
			int num = sc.nextInt();
			switch(num) {
			case 1 : print01(); break;
			case 2 : print02(); break;
			case 3 : exit(); break;
			}
		}
	}
	public void print01() {
		System.out.println("Hi");
	}
	public void print02() {
		System.out.println("Bye");
	}
	public void exit() {
		bool = false;
	}
}
