 <%@page import="com.sky.sp0320.dto.Member"%>
<%@page import="com.sky.sp0320.dao.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
     pageEncoding="UTF-8"%>
     
 <%@ page import="java.sql.*" %>  
 <%@ page import="java.time.*" %>
  
 <%
     request.setCharacterEncoding("utf-8");
 
     // 전달받은 값 읽기
     String id     = request.getParameter("member.id");
     String name  = request.getParameter("writer" );
     String password   = request.getParameter("title"  );
     String email = request.getParameter("content");
     String memo = request.getParameter("registerDateTime");
     LocalDateTime registerDateTime = request.getParameter("registerDateTime");
 
     // 빈 칸이 하나라도 있으면 오류 출력하고 종료
     if (name  == null || password.length()  == 0 ||
         email   == null || registerDateTime.length()   == 0 ) {
 %>      
         <script>
             alert('모든 항목이 빈칸 없이 입력되어야 합니다.');
             history.back();
         </script>
 <%        
         return;
     }
 
     MemberDao dao = new MemberDao();
     Member member = new Member(email, password, name, registerDateTime);
     dao.update(member);
     
     // 글 보기 화면으로 돌아감
     response.sendRedirect("root.jsp" + id);
     
 %>
 <script>
    alert('글이 성공적으로 수정되었습니다.');
    location.href = "update?id=<%= id %>";
</script>     
 