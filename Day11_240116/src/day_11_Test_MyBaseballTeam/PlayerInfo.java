package day_11_Test_MyBaseballTeam;

import java.io.Serializable;

public class PlayerInfo implements Serializable {
	String name;		// 이름
	int backNum;		// 등번호
	String position;	// 포지션 : 1루수 2루수 3루수 ... 선발 중계 마무리
	double salary;		// 연봉
	
	
	public PlayerInfo() {
		
	}

	public PlayerInfo(String name) {
		this(name, 0 , "없음", 30000000);
	}
	
	public PlayerInfo(String name, int backNum) {
		this(name, backNum, "없음", 30000000);
		
	}
	public PlayerInfo(String name, int backNum, String position) {
		this(name, backNum, position, 30000000);
		
	}

	public PlayerInfo(String name, int backNum, String position, double salary) {
		this.name = name;
		this.backNum = backNum;
		this.position = position;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getBackNum() {
		return backNum;
	}

	public void setBackNum(int backNum) {
		this.backNum = backNum;
	}
	
	
	public void increaseSalary(double pay) {
		this.salary += pay;
	}
	
	public void cutSalry(double pay) {
		if(this.salary >= pay) {
			System.out.println("마이너스 연봉입니다. 다시 입력해주세요.");
		} else {
			this.salary -= pay;
		}		
	}
	
}
