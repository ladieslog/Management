package Management;

import java.util.HashMap;
import java.util.Scanner;

class People{
	private String name;
	private int num=0, age,tel;
	public People(String name,int age,int tel) {
		this.name=name; this.num+=1;
		this.age=age; this.tel =tel;
	}
}

public class People_Hash {
	private static int nums=0;
	Scanner pulls =new Scanner(System.in);
	information infom =new information();
	HashMap map = new HashMap();
	public void inputs_Hash() {
		
		
		String n1;
		int n2,n3;
		
		System.out.print("이름을 입력해주세요: ");
		n1=pulls.next();
		System.out.print("나이를 입력해주세요: ");
		n2=pulls.nextInt();
		System.out.print("전화번호를 입력해주세요: ");
		n3=pulls.nextInt();
		nums++;
		map.put(nums,new People(n1, n2, n3));
		
		
	}
	public void display_Hash() {
		int i;
		for(i=0; i<map.size();i++) {
			Set keySet =map.get
			System.out.println("이름 : "+ People.getName());
			System.out.println("번호 : "+ num.getNum());
			System.out.println("나이 : "+ num.getAge());
			System.out.println("전화번호 : "+ num.getTel());
			System.out.println();
		}
	}
}
