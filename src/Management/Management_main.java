package Management;

import java.util.Scanner;

import YsshinStudent.YsshinStudent;

public class Management_main {
	public static void main(String[] args) {
		Scanner pulls =new Scanner(System.in);
		Center cen =new Center();	
		KJHStudent kjh =new KJHStudent();
		YsshinStudent yss =new YsshinStudent();
		JSBaking jsb =new JSBaking();
		SJHStudent sjh =new SJHStudent();
		
		int a;
		
		while(true) {
			System.out.println("원하는 사람의 코드를 버튼으로 눌러라 (0)을 누르면 종료됩니다.");
			a=pulls.nextInt();
			switch(a) {
			case 1:	System.out.println("김성윤 코드로 ");
			cen.manage(); break;
			case 2: System.out.println("김준호 코드로 ");
			kjh.management();break;
			case 3: System.out.println("김진성 코드로 ");
			jsb.bakingStart();break;
			case 4: System.out.println("송지현 코드로 ");
			sjh.management();break;
			case 5: System.out.println("신윤수 코드로 ");
			yss.management(); break;
			case 0: System.out.println("시스템이 종료됩니다. "); return ;
			default : System.out.println("없는 번호입니다. 재입력 ");
			}
		}
		
	}
}
