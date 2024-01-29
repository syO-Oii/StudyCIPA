# Q1. Mysql의 emp 테이블을 대상으로 CLI 서비스 만들기

## 클래스 설명

### 1. Main.class
 - 메인이 되는 클래스
 - Screen 클래스에서 화면 출력 메소드를, Crud 클래스에서 기능을 구현한 메소드를 호출
 - 각 클래스를 Screen myScreen / Crud crud로 객체화 하여 사용함.


### 2. Screen.class
 - 화면 출력에 관한 메소드가 담겨있는 클래스

   
#### 주요 메소드
 - call~ Screen : 각 메뉴 화면을 호출
 - selectMenu, selectUpdateMenu : 메뉴를 선택하라는 메세지를 출력
 - insertAnyKey : 각 메소드 실행 이후 화면을 확인할 수 있도록 잠시 멈추는 기능, 아무 키 입력 시 다음 동작 실행.


### 3. Crud.class
     - CRUD의 주요 기능이 담긴 클래스
#### 1) C : Create 기능
    (1) createData : 시트 값을 추가할 수 있는 메소드 (Create)
     String sql 변수에 더미값을 넣어서 변수를 추가함
     
#### 2) R : read
    (1) readData : 전체 조회 기능과 사원번호 검색 조회 기능 구현  (Read)
    switch문을 통해 출력값을 결정하며
    1번 : 전체 조회(searchAll, callSearchAllScreen)
    2번 : 사원번호 조회(searchEmpno, callSearchEmpnoScreen) 메소드가 호출됨

    (2) searchAll / searchEmpno
    String sql 변수에 "select * from emp"(searchAll) / "select * from emp where empno = '" + empno + "'" 값을 저장 후 Resultset을 통해 값을 찾아 출력함.


#### 3) U : Update
    (1) updateData(Connection connection)
    update emp set sal = 5800 where empno = 9876 명령어를 사용하여 더미값을 넣어줌

#### 4) D : Delete
    (1) deleteData(Connection connection)
	- delete from emp where empno = 9876 명령어를 사용하여 더미값을 넣어줌


### * 더미값
 - Update와 Delete의 경우 아래 더미 값을 바탕으로 프로그램을 구현함

 empnum = 9876<br>
 ename = 홍길동<br>
 job = 사원 <br>
 mgr = 7900<br>
 hiredate = 2024-01-25<br>
 sal = 3800<br>
 comm = 200<br>
 deptno = 20<br>
