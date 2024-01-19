package day_10;

public class _06_StudentEx {
	public static void main(String[] args) {
		_06_StudentService studentService = _06_StudentService.getInstance();
		/*
		 * studentService.stuArr[0].name = "홍길동"; studentService.stuArr[0].studentId =
		 * "20240101"; studentService.stuArr[0].eng = 35; studentService.stuArr[0].math
		 * = 88; studentService.stuArr[0].kor = 100;
		 */
		/*
		 * studentService.stuArr[1].name = "윌스미스"; studentService.stuArr[1].studentId =
		 * "20240102"; studentService.stuArr[1].eng = 97; studentService.stuArr[1].math
		 * = 98; studentService.stuArr[1].kor = 75;
		 * 
		 * studentService.stuArr[1].name = "스파이더맨"; studentService.stuArr[1].studentId =
		 * "20240103"; studentService.stuArr[1].eng = 100; studentService.stuArr[1].math
		 * = 100; studentService.stuArr[1].kor = 17;
		 */
		
		/*
		 * _06_StudentService studentService1 = _06_StudentService.getInstance();
		 * System.out.println(studentService.stuArr[0].name);
		 * System.out.println(studentService1.stuArr[0].name); 
		 * if(studentService.equals(studentService1)) {
		 * System.out.println("내용이 동일합니다."); }
		 */	
		
		studentService.student.name = "홍길동";
		studentService.student.studentId = "20240101";
		studentService.student.eng = 35;
		studentService.student.math = 88;
		studentService.student.kor = 100;
		
		_06_StudentService studentService2 = _06_StudentService.getInstance();
		System.out.println(studentService.student.name);
		System.out.println(studentService2.student.name);
		if(studentService.equals(studentService2)) {
			System.out.println("내용이 동일합니다.");
		}
		
		
	}
}
