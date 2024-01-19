package day_10;

import java.util.Arrays;

// 배열 복사 195p
public class _08_ArrayCopyByForExam {
	public static void main(String[] args) {
		String[] arr = {"김하나", "김두리", "김세엣", "김네엣"};
		
		String[] newArr = new String[arr.length];
		
		for(String str: newArr) {
			System.out.println(str);
		}
		
		// 195p 예제
		System.arraycopy(arr, 0, newArr, 0, newArr.length);		// 복사 대상, 시작점, 붙여넣기 대상, 시작점, 얼마나 복사할건지
		for(String str: newArr) {
			System.out.println(str);
		}
		
		// 더 좋아진 배열 복사 방법
		String[] newArr1 = Arrays.copyOf(arr,  arr.length);
		for(String str: newArr1) {
			System.out.println(str);
		}
	}
}
