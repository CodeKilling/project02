package sangjin;

import java.util.Scanner;

public class sangjin {
Scanner sc = new Scanner(System.in);
private boolean bool = true;
public void display() {
	while(bool) {
	System.out.println("1. 출력문1    2. 출력문2    3. 나가기");
	int num =sc.nextInt();
	switch(num) {
	case 1:print1();
		break;
	case 2:print2();
		break;
	case 3:exit();
		break;
	}
	}
	
}
public void print1() {
	System.out.println("간장계란밥");
}
public void print2() {
	System.out.println("설탕 많이");
}
public void exit() {
	bool = false;
}
}
	