package Management;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;



public class People_Hash {
	private static int nums=0;
	Scanner pulls =new Scanner(System.in);
	information infom =new information();
	private HashMap<String,information> map = new HashMap<String,information>();
	public void inputs_Hash() {
		
		
		String n,n1;
		int n2,n3;
		System.out.print("번호를 입력해주세요: ");
		n=pulls.next();
		
		System.out.print("이름을 입력해주세요: ");
		n1=pulls.next().trim();
		System.out.print("나이를 입력해주세요: ");
		n2=pulls.nextInt();
		System.out.print("전화번호를 입력해주세요: ");
		n3=pulls.nextInt();
		infom.setName(n1);  infom.setAge(n2);
		infom.setTel(n3); map.put(n, infom);
		System.out.println("입력 되었습니다. ");
		
		
	}
	public void display_Hash() {
		System.out.println("찾을 번호 입력 ");
		String stNum = pulls.next();
		if(map.containsKey(stNum)) {
			information st = map.get(stNum);
			System.out.println("학번 : "+st.getName());
			System.out.println("이름 : "+st.getAge());
			System.out.println("주소 : "+st.getTel());
		}else{
			System.out.println("그런 번호는 존재 하지않습니다.");
		}
	}
}
