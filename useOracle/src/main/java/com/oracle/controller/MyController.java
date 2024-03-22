package com.oracle.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.oracle.dto.Dept;
import com.oracle.dto.Emp;

@Controller
public class MyController {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@GetMapping("/")
	public String root(Model model) {
		List<Dept> list = new ArrayList<>();
		SqlRowSet rs = jdbcTemplate.queryForRowSet("select * from dept");
		while(rs.next()) {
			Dept dept = Dept.builder().deptno(rs.getInt("deptno"))
					.dname(rs.getString("dname"))
					.loc(rs.getString("loc")).build();
			list.add(dept);
		}
				
		model.addAttribute("list", list);
		return "root";
	}
	
	@GetMapping("/selectEmp")
	public String selectEmpByDeptno(Model model, @RequestParam("deptno") int deptno ) {
	    // 부서 정보 조회
		List<Dept> list = new ArrayList<>();
		String deptSql = "select * from dept";
		SqlRowSet rs = jdbcTemplate.queryForRowSet(deptSql);
		
		while(rs.next()) {
			Dept dept = Dept.builder().deptno(rs.getInt("deptno"))
					.dname(rs.getString("dname"))
					.loc(rs.getString("loc")).build();
			list.add(dept);
		}
				
		// 사원 정보 조회
		List<Emp> list2 = new ArrayList<>();
		String empSql = "select * from emp where deptno = ?";
		SqlRowSet rs2 = jdbcTemplate.queryForRowSet(empSql, deptno);
		
		while(rs2.next()) {
			Emp emp = Emp.builder()
					.empno(rs2.getInt("empno"))
					.ename(rs2.getString("ename"))
					.job(rs2.getString("job"))
					.mgr(rs2.getInt("mgr"))
					.hiredate(rs2.getString("hiredate"))
					.sal(rs2.getInt("sal"))
					.comm(rs2.getInt("comm"))
					.deptno(rs2.getInt("deptno")).build();
			list2.add(emp);
		}
		
		// 모델에 부서 정보와 사원 정보 추가
	    model.addAttribute("list", list); // 부서 정보 추가
		model.addAttribute("list2", list2);	// 사워 정보 추가
		return "root";
	}
	
	
	@GetMapping("/updateForm")
	public String updateEmpInfo(Model model, @RequestParam("id") int empno) {

		// 부서 정보 조회
		List<Dept> list = new ArrayList<>();
		String deptSql = "select * from dept";
		SqlRowSet rs = jdbcTemplate.queryForRowSet(deptSql);

		while (rs.next()) {
			Dept dept = Dept.builder().deptno(rs.getInt("deptno"))
									  .dname(rs.getString("dname"))
									  .loc(rs.getString("loc")).build();
			list.add(dept);
		}

		// 사원 정보 조회
		List<Emp> list2 = new ArrayList<>();
		String empSql = "select * from emp where deptno = " + "(select deptno from emp where empno = ?)";
		SqlRowSet rs2 = jdbcTemplate.queryForRowSet(empSql, empno);

		while (rs2.next()) {
			Emp emp = Emp.builder().empno(rs2.getInt("empno"))
								   .ename(rs2.getString("ename"))
								   .job(rs2.getString("job"))
								   .mgr(rs2.getInt("mgr"))
								   .hiredate(rs2.getString("hiredate"))
								   .sal(rs2.getInt("sal"))
								   .comm(rs2.getInt("comm"))
								   .deptno(rs2.getInt("deptno")).build();
			list2.add(emp);
		}

		// 모델에 부서 정보와 사원 정보 추가 
		model.addAttribute("list", list); // 부서 정보 추가
		model.addAttribute("list2", list2); // 사원 정보 추가
		
		
		
		List<Emp> list3 = new ArrayList<>();
		String inputSql = "SELECT * FROM emp WHERE empno = ?";
		SqlRowSet rs3 = jdbcTemplate.queryForRowSet(inputSql, empno);
		while (rs3.next()) {
		    Emp emp = Emp.builder().empno(rs3.getInt("empno"))
		                           .ename(rs3.getString("ename"))
		                           .job(rs3.getString("job"))
		                           .mgr(rs3.getInt("mgr"))
		                           .hiredate(rs3.getString("hiredate")).sal(rs3.getInt("sal"))
		                           .comm(rs3.getInt("comm"))
		                           .deptno(rs3.getInt("deptno")).build();
		    list3.add(emp);
		}
		model.addAttribute("inputEmp", list3);
		
		
		return "root";
	}
	
	
	// 수정해야함

	@PostMapping("/input")
	public String insertEmpByEmpno(@RequestParam("empno") int empno,
								   @RequestParam("ename") String ename,
								   @RequestParam("job") String job,
								   @RequestParam("mgr") int mgr,
								   @RequestParam("sal") int sal,
								   @RequestParam("comm") int comm,
								   @RequestParam("deptno") int deptno,
								   Model model) {
		
		// 입력값 확인
	    String selectSql = "SELECT COUNT(*) FROM emp WHERE empno = ?";
	    int count = jdbcTemplate.queryForObject(selectSql, Integer.class, empno);

	    if (count > 0) {
	        // Employee exists, perform update
	        String updateSql = "UPDATE emp SET ename = ?, job = ?, mgr = ?, sal = ?, comm = ?, deptno = ? WHERE empno = ?";
	        jdbcTemplate.update(updateSql, ename, job, mgr, sal, comm, deptno, empno);
	        model.addAttribute("message", "수정이 완료되었습니다.");
	    } else {
	        // 중복된 정보가 없다면 새로 추가
	    	String insertSql = "INSERT INTO emp (empno, ename, job, mgr, sal, comm, deptno, hiredate) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
	        LocalDateTime hireDateTime = LocalDateTime.now(); // 현재 시간 가져오기
	        jdbcTemplate.update(insertSql, empno, ename, job, mgr, sal, comm, deptno, hireDateTime);
	        model.addAttribute("message", "회원 등록이 완료되었습니다.");
	    }
	    
		return "redirect:/";
	}

}
