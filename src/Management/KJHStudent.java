package Management;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class KJHStudent {

	/* ArrayList */
	private ArrayList<String> list = new ArrayList<>();
	/* */

	/* hashMap */
	private HashMap<String, Integer> map = new HashMap<>();
	/* */

	public KJHStudent() {
		// list 초깃값 설정
		list.add("출석");
		list.add("출석");
		list.add("출석");
		list.add("출석");
		list.add("지각");
		list.add("출석");
		list.add("조퇴");
		list.add("결석");
		list.add("출석");
		
		// map 초깃값 설정
		map.put("국어", 68);
		map.put("수학", 74);
		map.put("영어", 51);
		map.put("과학", 82);
		map.put("사회", 86);
		map.put("역사", 92);
		map.put("일본어", 96);
		map.put("경제", 77);
	}


	public void management() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("김준호님의 학생 관리 프로그램입니다");
		management: while (true) {
			System.out.println("1.List를 이용한 출결 관리 2.Map를 이용한 성적 관리 3.종료");
			System.out.print(">>>> ");

			int sel = scanner.nextInt();
			switch (sel) {
			case 1:
				System.out.println("출결 관리에 들어오셨습니다.");
				System.out.println("1.출결보기 2.출결정정");
				int sw = scanner.nextInt();
				switch(sw) {
					case 1:
						int Attendance = 0;
						int flaw = 0;
						int absent = 0;
						double AttendancerRate = 0;
						
						for(int i=0; i<list.size(); i++) {
							if(list.get(i).equals("출석")) {
								Attendance++;
							} else if(list.get(i).equals("지각") || list.get(i).equals("조퇴")) {
								flaw++;
							} else {
								absent++;
							}
						}
						AttendancerRate = (double) Attendance / list.size();
						System.out.println("총 수업일 수 : " + list.size());
						System.out.println("총 출석일 수 : " + Attendance);
						System.out.println("총 지각, 조퇴 수 : " + flaw);
						System.out.println("총 결석일 수 : " + absent);
						DecimalFormat form = new DecimalFormat("#.##");
						System.out.println("출석율 : " + form.format(AttendancerRate));
						break;
					case 2:
						System.out.println("정정하실 날짜를 입력해주세요.");
						System.out.print(">>>> ");
						int day = scanner.nextInt();
						String dayAttendancer = "";
						try {
						dayAttendancer = list.get(day - 1);
						} catch (Exception e) {
							System.out.println("유효하지 않은 값입니다.");
							break;
						}
						System.out.println(day + "일날의 출결은 " + dayAttendancer + " 입니다.");
						System.out.println("변경하실거면 출석, 지각, 조퇴, 결석 중에 입력을, 취소하실거면 아무거나 적어주세요.");
						System.out.print(">>>> ");
						String selectStr = scanner.next();
						if(selectStr.equals("출석") || selectStr.equals("지각") || selectStr.equals("조퇴") || selectStr.equals("결석")) {
							list.set(day - 1, selectStr);
							System.out.println("변경되셨습니다.");
						} else {
							System.out.println("출석 정정이 취소되었습니다.");
						}
							
						break;
					default:
						System.out.println("잘못된 입력으로 종료합니다.");
						break;
				}
				break;
			case 2:
				System.out.println("성적 관리에 들어오셨습니다.");
				System.out.println("1.성적확인 2.성적정정");
				System.out.print(">>>> ");
				int select = scanner.nextInt();
				switch (select) {
				case 1:
					System.out.println("김준호님의 성적입니다.");
					Set<String> set = map.keySet();
					Iterator<String> it = set.iterator();
					int sum = 0;
					int count = 0;
					while (it.hasNext()) {
						String subject = it.next();
						int score = map.get(subject);
						System.out.println(subject + " : " + score);
						sum += score;
						count++;
					}
					double avg = (double) sum / count;
					System.out.println("합계 : " + sum);
					System.out.println("평균 : " + avg);
					break;
				case 2:
					System.out.println("정정하실 과목 명을 입력해주세요.");
					System.out.print(">>>> ");
					String subjectName = scanner.next();
					if (map.containsKey(subjectName)) {
						System.out.println(subjectName + "의 점수를 몇점으로 하시겠습니까 ? 기존 : " + map.get(subjectName));
						System.out.print(">>>> ");
						int scoreRepl = scanner.nextInt();
						if(scoreRepl >= 0 && scoreRepl <= 100) {
							map.put(subjectName, scoreRepl);
							System.out.println("변경되셨습니다.");
						} else {
							System.out.println("값이 유효하지 않습니다.");
						}
			
					} else {
						System.out.println("없는 과목입니다.");
					}
					break;
				default:
					System.out.println("잘못된 입력으로 종료합니다.");
					break;
				}
				break;
			case 3:
				System.out.println("김준호님의 학생관리 프로그램을 종료합니다.");
				break management;
			default:
				System.out.println("잘못된 입력으로 종료합니다.");
				break;
			}
		}
	}

}
