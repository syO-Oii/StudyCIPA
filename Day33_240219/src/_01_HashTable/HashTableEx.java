package _01_HashTable;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTableEx {
	public static void main(String[] args) {
		Map<String, String> map = new Hashtable<>();
		
		map.put("spring", "345");
		map.put("summer", "678");
		map.put("fall", "91011");
		map.put("winter", "1212");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("아이디와 비밀번호 입력");
			System.out.print("아이디 : ");
			String id = sc.nextLine();
			System.out.print("비밀번호 : ");
			String password = sc.nextLine();
			System.out.println();
			
			if(map.containsKey(id)) {
				if(map.get(id).equals(password)) {
					System.out.println("로그인 성공");
					break;
				} else {
					System.out.println("로그인 실패");
				}
				
			} else {
				System.out.println("입력한 아이디가 존재하지 않습니다.");
			}
			
			
		}
		
	}
}
