package Management;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class information{
	private String name;
	private int num=0;
	private int age;
	private int tel;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNum() {
		return num;
	}
	public void setNum() {
		this.num +=1;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getTel() {
		return tel;
	}
	public void setTel(int tel) {
		this.tel = tel;
	}
}

class People_Arr {
	Scanner pulls =new Scanner(System.in);
	information infom =new information();
	ArrayList<information> peo =new ArrayList<information>();

	public void inputs_Arr() {
		
	
		String n1;
		int n2,n3;
		System.out.print("이름을 입력해주세요: ");
		n1=pulls.next();
		System.out.print("나이를 입력해주세요: ");
		n2=pulls.nextInt();
		System.out.print("전화번호를 입력해주세요: ");
		n3=pulls.nextInt();
		
		infom.setName(n1); infom.setAge(n2); 
		infom.setTel(n3); infom.setNum();
		peo.add(infom); 
				
	}


	public void display_Arr() {
		int i;
		for(i=0; i<peo.size();i++) {
			information num = peo.get(i);
			System.out.println("이름 : "+ num.getName());
			System.out.println("번호 : "+ num.getNum());
			System.out.println("나이 : "+ num.getAge());
			System.out.println("전화번호 : "+ num.getTel());
			System.out.println();
		}
	}
}









