package Management;

import java.util.Scanner;




public class Center {	
	public static void manage() {
		Scanner pulls =new Scanner(System.in);
		People_Arr poe =new People_Arr();
		People_Hash pot =new People_Hash();
		int a;
		while(true) {
			System.out.println("보기설정해주세요 ");
			System.out.print("1.모든사람 보기(arr) 2.주민등록(arraylist)"
					+ "3.모든사람보기(hash) 4.주민등록(hashmap) 5.나가기 \n선택 : ");
			a=pulls.nextInt();
			switch(a) {
			case 1: poe.display_Arr(); break;
			case 2: poe.inputs_Arr(); break;
			case 3: pot.display_Hash();break;
			case 4: pot.inputs_Hash(); break;
			case 5: System.out.println("시스템을 종료합니다."); 
			pulls.close(); return;
			default :
				System.err.println("없는 번호입니다. 재입력해주세요 !!");
			}
			System.out.println("==");
		}	
		
	}
	
	
	
}
