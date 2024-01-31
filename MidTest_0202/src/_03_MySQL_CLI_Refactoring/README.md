# Q1. Mysql의 emp 테이블을 대상으로 CLI 서비스 만들기

## ◼️ 클래스 설명

### 1. Main.class
     - 메인이 되는 클래스
     - Screen 클래스에서 화면 출력 메소드를, Crud 클래스에서 기능을 구현한 메소드를 호출
     - 각 클래스를 Screen myScreen / Crud crud로 객체화 하여 사용함.


### 2. Screen.class
     - 화면 출력에 관한 메소드가 담겨있는 클래스
<br>

#### ✔️ Screen 클래스의 주요 메소드
     - ~Screen : 각 메뉴 화면을 호출
     - ~Message : 메뉴를 선택하라는 메세지를 출력
     - insertAnyKey : 각 메소드 실행 이후 화면을 확인할 수 있도록 잠시 멈추는 기능, 아무 키 입력 시 다음 동작 실행.


### 3. Crud.class
     - CRUD의 주요 기능이 담긴 클래스
#### 1) C : Create 기능
     (1) createData : 시트 값을 추가할 수 있는 메소드 (Create)
     String sql 변수에 더미값을 넣어서 변수를 추가함
     
#### 2) R : Read 기능
    (1) readAll() : select * from emp 문장을 사용하여 전체 직원 정보를 호출
    (2) readEmpno(int empno) : select * from emp where empno = empno 문장을 사용하여 검색된 사원의 정보를 호출


#### 3) U : Update
    (1) changeXXX(int empno, 입력값)
     - job, mgr, sal, deptno 4개의 값을 바꿀 수 있는 메소드를 각각 만들어 진행
     - 각 메소드마다 update emp set 입력값 = '" + 입력값 + "' where empno = " + empno 문장을 사용함

#### 4) D : Delete
    (1) deleteData(Connection connection)
	- delete from emp where empno = '입력값' 을 통해 삭제를 원하는 직원의 정보를 삭제함
    - 삭제 할 정보가 없을 경우(사번을 잘못 입력하거나 이미 삭제된 경우) "삭제 실패" 메세지가 뜨도록 함.

