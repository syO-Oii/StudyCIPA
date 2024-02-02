<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page import="java.io.*,java.util.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href = "oracle_index.jsp">초기 화면으로 돌아가기</a>

<table border = "1">

    <tr>
        <th>번호</th><th>이름</th>
        <th>국어</th><th>영어</th><th>수학</th>
        <th>총점</th><th>평균</th>
    </tr>
<%
	request.setCharacterEncoding("UTF-8");
	response.setCharacterEncoding("UTF-8");
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe?useUnicode=true&characterEncoding=UTF-8";
	Class.forName(driver);
	
	int[] maxScore = {0, 0, 0};
	int sum_all = 0;
	int count = 0;
	double avg_all = 0;
    try ( 
        Connection conn = DriverManager.getConnection(
         				  url, "scott", "tiger")
    ) {
    	String sql = "select * from score";
    	try(
    		PreparedStatement pstmt = conn.prepareStatement(sql);
    		ResultSet rs = pstmt.executeQuery();
    	){
        	while (rs.next()) {
            	int sum = rs.getInt("kor") + rs.getInt("eng") + 
                	      rs.getInt("math");
%>          
            	<tr align = "center">
                	<td width = "50"><%=rs.getInt   ("num" )%></td>
                	<td width = "80"><%=rs.getString("name")%></td>
                	<td width = "50"><%=rs.getInt   ("kor" )%></td>
                	<td width = "50"><%=rs.getInt   ("eng" )%></td>
                	<td width = "50"><%=rs.getInt   ("math")%></td>
                	<td width = "50"><%=sum%></td>
                	<td width = "50"><%=String.format("%.2f", (float)sum / 3)%></td>
            	</tr>
            	
<%          	
				sum_all += sum;
				if(maxScore[0] < rs.getInt("kor")){
					maxScore[0] = rs.getInt("kor");
				}

				if(maxScore[1] < rs.getInt("eng")){
					maxScore[1] = rs.getInt("eng");
				}

				if(maxScore[2] < rs.getInt("math")){
					maxScore[2] = rs.getInt("math");
				}

				count++;
        	}
        	avg_all = (double)sum_all / (3 * count);
    	} catch(SQLException e){
    		e.printStackTrace();
    	}   
    } catch(Exception e) {
        e.printStackTrace();
    }
%>
</table>

<h3>과목별 최고 점수</h3>
<table border = "1">
	<tr align = "center">
		<td width = "50"> 국어 </td>
		<td width = "50"> 영어 </td>
		<td width = "50"> 수학 </td>
	</tr>
		<tr align = "center">
		<td width = "50"> <%=maxScore[0] %> </td>
		<td width = "50"> <%=maxScore[1] %> </td>
		<td width = "50"> <%=maxScore[2] %> </td>
	</tr>
</table>

<h3>전체 평균</h3>
<table border = "1">
	<tr align = "center">
		<td width = "50"> 총평균 </td>
		<td width = "50"> <%=avg_all %> </td>
	</tr>
</table>
</body>
</html>