package YsshinStudent;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Scanner; 

public class YsshinStudent {
	Scanner sc = new Scanner(System.in);
	Array arr = new Array();
	Hash hs = new Hash();
	int select=0;
	public void management() {
		System.out.println("=====신윤수프로그램=====");
		System.out.print("구현 방식 선택\n1.ArrayList\n2.HashMap\n >>>> ");
		select = sc.nextInt();
		switch(select) {
		case 1:
			arr.start();
			break;
		case 2:
			hs.start();
			break;
		default:
			System.out.println("없는 번호입니다");
			break;
		}
	}
}

class Array {
	Scanner sc = new Scanner(System.in);
	ArrayList list = new ArrayList();
	ArrayList<String> name = new ArrayList<String>();	
	ArrayList<Integer> studentNum = new ArrayList<Integer>();
	ArrayList<String> phoneNum = new ArrayList<String>();
	ArrayList<String> address = new ArrayList<String>();
	int info1 =0, search = 0, cnt;
	String info2 = null, info3 = null, info4 = null;
	
	public void start() {
		while(true) {
			int select = 0;
			System.out.print("1.학생 등록\n2.학생 검색\n3.학생 전체 조회\n4.종료\n >>>> ");
			select = sc.nextInt();
			System.out.println();
			
			switch(select) {
				case 1:
					System.out.println("=====학생등록=====");
					newmember();
					break;
				case 2:
					System.out.println("=====학생검색=====");
					search();
					break;
				case 3:
					System.out.println("====학생전체조회====");
					inquireAll();
					break;
				case 4:
					System.out.println("프로그램을 종료합니다");
					System.exit(0);
			}
		}
	}
	public void newmember() {
		System.out.print("등록할  학번 : ");
		info1 = sc.nextInt();
		System.out.print("이름 : ");
		info2 = sc.next();
		System.out.print("전화번호 : ");
		info3 = sc.next();
		System.out.print("주소 : ");
		info4 = sc.next();
		
		for(int i=0 ; i<studentNum.size()+1 ; i++) {
			if(!studentNum.contains(info1)) {
				studentNum.add(info1);
				name.add(info2);
				phoneNum.add(info3);
				address.add(info4);
			}
        }
	}
	public void search() {
		cnt = 1;
		if(name.size() != 0) {
			System.out.print("1.학번검색\n2.이름검색\n3.뒤로가기\n >>>> ");
			search = sc.nextInt();
			
			switch(search) {
			case 1:
				System.out.print("검색할 학번 입력 : ");
				info1 = sc.nextInt();
				for (int i = 0; i < studentNum.size(); ++i) {
					if(info1 == (studentNum.get(i))) {
						print(i); edit(i);
					}
				}break;		
			case 2:
				System.out.print("검색할 이름 입력 : ");
				info2 = sc.next();
				for (int i = 0; i < name.size(); ++i) {
					if(info2.equals(name.get(i))) {
						print(i); edit(i);
					}
				}break;
			}
		}
		else System.out.println("등록된 학생이 없습니다.\n");
	}
	public void inquireAll() {
		if(name.size() != 0) {
			for (int i = 0; i < name.size(); i++) {
				System.out.println("< " + (i+1) + " >");
				System.out.println("학번 : " + studentNum.get(i));
	            System.out.println("이름 : " + name.get(i));
	            System.out.println("==================");
	        }
		}
		else System.out.println("등록된 학생이 없습니다.\n");
	}
	public void edit(int i) {
		int select = 0;
		System.out.print("1.정보 수정\n2.정보 삭제\n3.이전\n >>>> ");
		search = sc.nextInt();
			
		switch(search) {
		case 1:
			System.out.println("=====정보수정=====");
			System.out.print("수정할 정보 선택\n1.이름\n2.전화번호\n3.주소\n4.나가기\n >>>> ");
			select = sc.nextInt();
			switch(select) {
			case 1: 
				System.out.print("변경할 이름 입력 : ");
				info2 = sc.next();
				name.set(i , info2);
				break;
			case 2:
				System.out.print("변경할 전화번호 입력 : ");
				info3 = sc.next();
				phoneNum.set(i , info3);
				break;
			case 3:
				System.out.print("변경할 주소 입력 : ");
				info4 = sc.next();
				address.set(i , info4);
				break;
			default:
				System.out.println("없는 번호를 입력하셨습니다.");
				break; 
			}
			break;
		case 2:
			System.out.println("=====정보삭제=====");
			System.out.println("학번 : " + studentNum.get(i) + "의 정보를 삭제합니다.");
			studentNum.remove(i);
			name.remove(i);
			phoneNum.remove(i);
			address.remove(i);
			break;
		default:
			System.out.println("없는 번호를 입력하셨습니다.");
			break;
		}
	}
	public void print(int i) {
		System.out.println("==================");
		System.out.println("검색 결과 (" + cnt + ")");
		System.out.println("학번 : " + studentNum.get(i));
		System.out.println("이름 : " +name.get(i));
		System.out.println("전화번호 : " +phoneNum.get(i));
		System.out.println("주소 : " +address.get(i));
		System.out.println("==================");
		cnt++;
	}
}

class Hash { 
    public static boolean flag = true; 
    
    public void start() {
        Scanner sc = new Scanner(System.in); 
        int select, sno, snoSearch;
        String name, phoneNum; 
     
        HashMap<Integer, StudentInform> st = new HashMap<Integer, StudentInform>(); 
        while(flag) { 
            System.out.print("1.학생 등록\n2.학생 검색\n3.종료\n >>>> "); 
            select = sc.nextInt(); 
            System.out.println();
            
            switch (select) { 
                case 1: 
                    System.out.println("=====학생등록====="); 
                    System.out.print("학번: "); 
                    sno = sc.nextInt(); 
                    System.out.print("이름: "); 
                    name = sc.next(); 
                    System.out.print("전화번호: "); 
                    phoneNum = sc.next(); 
 
                    st.put(sno, new StudentInform(sno, name, phoneNum)); 
                    
                    System.out.println("입력이 완료 되었습니다."); 
                    break; 
                case 2: 
                    System.out.println("=====학생검색====="); 
                    System.out.print("검색할 학번 : ");
        			snoSearch = sc.nextInt(); 
    				if(st.get(snoSearch) != null) 
    					System.out.println(st.get(snoSearch)); 
                    else System.out.println("해당 데이터 없음."); 
    				break;	
                case 3: 
                	System.out.println("프로그램을 종료합니다");
					System.exit(0);
                default:
                    System.out.println("잘못 입력함."); 
                    break; 
            } 
        } 
    } 
} 

class StudentInform { 
    protected int sno; 
    protected String name, phoneNum; 
    protected StudentInform(int sno, String name, String phoneNum) { 
        this.sno = sno; 
        this.name = name; 
        this.phoneNum = phoneNum; 
    } 
    
    public String toString() { 
        return "이름: " + name + "\n전화번호 : " + phoneNum + " \n"; 
    } 
} 

