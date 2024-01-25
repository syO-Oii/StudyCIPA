# Q1. Mysql의 emp 테이블을 대상으로 CLI 서비스 만들기

## 클래스 설명

### 1. MySql.class
 - 메인이 되는 클래스


### 2. Screen.class
 - 화면 출력에 관한 메소드가 담겨있는 클래스

### 3. Crud.class
 - CRUD의 주요 기능이 담긴 클래스


### * 더미값
 - Update와 Delete의 경우 아래 더미 값을 바탕으로 프로그램을 구현하였습니다.

 empnum = 9876
 ename = 홍길동
 job = 사원 
 mgr = 7900
 hiredate = 2024-01-25
 sal = 3800
 comm = 200
 deptno = 20


### 메소드 설명
#### 1) C : Create
    (1) createData(Connection connection)

#### 2) R : read
    (1) readData(Connection connection)
    (2) searchEmpno(Connection connection, int empno)
    (3) searchAll(Connection connection)

#### 3) U : Update
    (1) updateData(Connection connection)

#### 4) D : Delete
    (1) deleteData(Connection connection)
	- delete from emp where empno = 9876 명령어를 사용하여