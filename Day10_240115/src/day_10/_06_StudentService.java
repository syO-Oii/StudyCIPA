package day_10;
// 싱글톤 실습
// 학생 관리 프로그램



public class _06_StudentService {
	_06_Students[] stuArr = new _06_Students[3];
	_06_Students student = new _06_Students();
	private static _06_StudentService studentService = new _06_StudentService();
	private _06_StudentService() {}
	
	public static _06_StudentService getInstance() {
		
		
		return studentService;
	}
	
	
}
