package day_11_Test_MyBaseballTeam;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		MyFunction myFunction = new MyFunction();
		Scanner sc = new Scanner(System.in);
		LoadPlayerInfo loadInfo;
		ArrayList<PlayerInfo> playerList = new ArrayList<>();	// 선수 명단
		String selectMenu;
		LoadFile load = new LoadFile();
		SaveFile save;
		
		while(myFunction.getCheckMenu()) {
			myFunction.disp();
			myFunction.select();
			selectMenu = sc.nextLine();
			
			switch(selectMenu) {
			case "1":
				// 회원 출력
				System.out.println("회원 출력");
				myFunction.printPlayers(playerList);
				break;
			case "2":
				// 회원 등록
				System.out.println("회원 등록");
				{
					String name;
					int backNum;
					String position;
					double salary;
					
					System.out.print("추가할 선수 이름 입력 : ");
					name = sc.nextLine();
					System.out.print(name + "선수 등번호 입력 : ");
					backNum = Integer.parseInt(sc.nextLine());
					System.out.print(name + "선수 포지션 입력 : ");
					position = sc.nextLine();
					System.out.print(name + "연봉 입력 : ");
					salary = Double.parseDouble(sc.nextLine());
					AddPlayer(playerList, name, backNum, position, salary);
					
					System.out.println("선수 정보 입력이 완료되었습니다.");
				}
				break;
			case "3":
				loadInfo = new LoadPlayerInfo();
				
			case "4":
				// 파일 저장
				save = new SaveFile(playerList);
				break;
			case "5":
				ArrayList<PlayerInfo> loadPlayerList = load.loadFile();
				
				// 파일 읽기
				if(loadPlayerList.size() < playerList.size()) {
					System.out.println("지금까지 작업한 내용을 저장하시겠습니까?  Y / N");
					String checkSave = sc.nextLine();
					if(checkSave.equals("Y") || checkSave.equals("y")) {
						save = new SaveFile(playerList);
						System.out.println("저장이 완료되었습니다.");
					}
				}
				
				playerList = load.loadFile();
				break;
			default:
				System.out.println("다시 입력 해 주세요.");
				myFunction.select();
				break;
			}
		}
		
		

	}
	
	private static void AddPlayer(ArrayList<PlayerInfo> playerList, String name, int backNum, String position,
			double salary) {
		PlayerInfo player = new PlayerInfo(name, backNum, position, salary);
		playerList.add(player);
		
	}
	
	


	

	
}


