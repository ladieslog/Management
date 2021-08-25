package Jinsung;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

class Info{
	private String na;
	private int pr;
	
	public String getNa() {
		return na;
	}
	public void setNa(String na) {
		this.na = na;
	}
	public int getPr() {
		return pr;
	}
	public void setPr(int pr) {
		this.pr = pr;
	}
	
}

public class JSBaking {
	// arraylist 방식 / hashmap 방식
	// 빵등록, 가격등록, 전체 빵보기, 빵 제거, 종료
	
	Scanner input = new Scanner(System.in);
//	private int select,num,pr;
//	private String na;  
	public void bakingStart() {
		while(true) {
			System.out.println("1.ArrayList 방식");
			System.out.println("2.HashMap 방식");
			System.out.println("3.종료하기");
			System.out.print(">>> ");
			int select = input.nextInt();
			if(select == 1) {
				arr();
			}else if(select ==2) {
			has();
			}else {
				System.out.println("종료합니다");
				break;
			}		
		}
	}
	
	public void arr() {
		ArrayList<Info> arr = new ArrayList<Info>();
		while(true) {
			Info ac = new Info();
			String na=null;
			int pr = 0;
			System.out.println("---ArrayList---");
			System.out.println("1.빵, 가격 등록");
			System.out.println("2.빵 제거");
			System.out.println("3.빵 목록보기");
			System.out.println("4.종료하기");
			System.out.print(">>> ");
			int num = input.nextInt();
			if(num == 4) {
				System.out.println("종료");
				break;
			}
			switch(num){
			case 1:
			//	System.out.print("등록할 빵 이름 : ");
			//	na = input.next();
				while(true) {
					System.out.println("등록할 빵 이름 : ");
					na = input.next();
					if(arr.size() != 0 ) {
						int i;
						for( i=0; i< arr.size() ; i++) {
							if(arr.get(i).getNa().equals(na) ) {
								System.out.println("이미 등록된 빵");
								break;
							}
						}
						if( i != arr.size() ) {
							continue;
						}
					}
					break;
				}
				System.out.print("가격 입력 : ");
				pr = input.nextInt();
				ac.setNa(na);
				ac.setPr(pr);
				arr.add(ac);
				System.out.println("등록 성공 ! !");				
				break;
			case 2:
				System.out.print("제거할 빵 이름 : ");
				na = input.next();
				boolean check = false;
                for(int i=0; i<arr.size(); i++) {
                    if(arr.get(i).getNa().equals(na)) {
                        arr.remove(i);
                        check = true;
                        System.out.println("제거 완료");
                        break;
                    }
                }
                if(check == false) {
                    System.out.println("없는 빵입니다.");
                }
                break;
			case 3:
				int i=0;
				if(i != arr.size()){
				for( i = 0; i<arr.size();i++) {
				//	Info ss = arr.get(i);
					System.out.print(arr.get(i).getNa()+" - ");
					System.out.println(arr.get(i).getPr());
					System.out.println("--------");
				}
				}
				else {
					System.out.println("등록된 빵이 없습니다.");
				}
				break;
			}
		}
	}
	
	public void has() {
		HashMap<String, Info> map = new HashMap<String, Info>();
		
		while(true) {
			Info ac = new Info();
			String na=null;
			int pr = 0;
			System.out.println("---HashMap---");
			System.out.println("1.빵, 가격 등록");
			System.out.println("2.빵 제거");
			System.out.println("3.빵 목록보기");
			System.out.println("4.종료하기");
			System.out.print(">>> ");
			int num = input.nextInt();
			if(num == 4) {
				System.out.println("종료");
				break;
			}
			switch(num){
			case 1:
				if(map.size() != 0) {
					while(true) {
						System.out.print("등록할 빵 이름 : ");
						na = input.next();
						if(map.containsKey(na)) {
							System.out.println("이미 등록된 빵");
							continue;
						}
						break;
					}
				}else {
					System.out.print("등록할 빵 이름 : ");
					na = input.next();
				}
				System.out.println("가격 입력 : ");
				pr = input.nextInt();
				ac.setNa(na);
				ac.setPr(pr); 
				map.put(na, ac);
				System.out.println("등록 성공 ! !");
				break;
			case 2:
				System.out.print("제거할 빵 이름 : ");
				na = input.next();
				boolean check = false;
				Iterator is = map.keySet().iterator();
				while(is.hasNext()) {
					Info a =  map.get(is.next());
					if(na.equals(a.getNa())) {
						map.remove(na);
						check = true;
						System.out.println("제거 완료");
						break;
					}
				}
				break;
			
			case 3:
				if(map.size() !=0) {
					Iterator it = map.keySet().iterator();
				while(it.hasNext()) {
					Info n =  map.get(it.next());
					System.out.println(n.getNa()+" - "+n.getPr());
					System.out.println("--------");
				}
				}else {
					System.out.println("등록한 빵이 없음");
				}
				break;
		/*		Iterator it = map.keySet().iterator();
				while(it.hasNext()) {
					Info n =  map.get(it.next());
					System.out.println(n.getNa()+" - "+n.getPr());
					System.out.println("--------");
					break;*/
				
				}
			}
		}

	
	
	public static void main(String[] args) {
		JSBaking ex = new JSBaking();
		ex.bakingStart();
	}
}