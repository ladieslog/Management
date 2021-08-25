package Management;

import java.util.ArrayList;
import java.util.Scanner;

public class SJHStudent {
	public void management () { 
		Scanner input = new Scanner(System.in);
		
		ArrayList<SJHStudentInfo> arr = new ArrayList<SJHStudentInfo>();
		String name;
		int age; 
		int phN;
		
		/*
		ArrayList<String> str = new ArrayList<String>();
		String s = "Test";
		str.add(s);
		StInfo st = new StInfo();
		arr.add(st);
		arr.add(s);
		*/
		while(true) {
			System.out.println("1.회원 등록 2.확인");
			int num = input.nextInt();
			switch(num) {
			case 1:
				SJHStudentInfo s = new SJHStudentInfo();
				System.out.println("이름 입력");
				name = input.next();
				System.out.println("나이 입력");
				age = input.nextInt();
				System.out.println("전화번호 입력");
				phN = input.nextInt();
				s.setAge(age); s.setName(name);
				
				arr.add(s);
				System.out.println("등록 되었습니다");
				break;
			case 2:
				for(int i=0; i < arr.size() ; i++) {
					SJHStudentInfo ss = arr.get(i);
					System.out.println("이름 : "+ss.getName());
					System.out.println("나이 : "+ss.getAge());
					System.out.println("전화번호 : "+ss.getPhN());
					System.out.println("--------------------");
				}
				break;
			}
		}
}
}

