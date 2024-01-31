# Q2. Mysql의 emp 테이블을 대상으로 Swing 서비스 만들기

## ◼️ 클래스 설명

### 1. MainFrame.class
     - 메인이 되는 클래스로 프레임에 대한 전반적인 세팅이 들어감
     - Crud crud 객체를 만든 후 기능을 구현한 메소드를 호출
     - 생성자를 통해 객체 생성 시 DB와 연동되도록 함.

#### ✔️ MainFrame 클래스의 주요 메소드
      (1) drowFrame()
           - JPanel을 통해 패널 영역을 구별한 후 컨테이너에 삽입
      (2) actionPerformed(ActionEvent e)
           - 각 버튼이 동작할 때 마다 Crud에서 적절한 기능을 실행

### 2. Crud.class
      - CRUD의 주요 기능이 담긴 클래스
      - 생성자에서 MainFrame 객체를 받아와 MainFrame 내의 항목에 접근이 가능하도록 함

#### 1) C : Create 기능
     (1) createData
      - 더미값을 입력하는 메소드
      - 입력 성공 시 apent() 메소드를 호출하여 printTa에 어떤 내용이 추가되었는지 띄워줌
      - 더미값 내용 : insert into emp values(9876, '홍길동', '사원', '7900', '2024-01-25', '3800', '200', '20')
     
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

