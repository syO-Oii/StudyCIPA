
<!DOCTYPE html>
<html>
<head>
	<title>top page</title>
	<meta http-equiv="Content-Type" 
		content="text/html; charset=UTF-8" />
	<style>
	h1 { font-size:18pt; font-weight:bold; color:gray; }
	body { font-size:13pt; color:gray; margin:5px 25px; }
	tr { margin:5px; }
	th { padding:5px; color:white; background:darkgray; }
	td { padding:5px; color:black; background:#e0e0ff; }
	.err { color:red; }
	</style>
</head>
<body>
	<h1>Hello page</h1>
	<p></p>
	<table>
	<form method="post" action="/">
		<tr><td><label for="name">이름</label></td>
			<td><input type="text" name="name" /></td></tr>
		<tr><td><label for="age">연령</label></td>
			<td><input type="text" name="age" /></td></tr>
		<tr><td><label for="mail">메일</label></td>
			<td><input type="text" name="mail"  /></td></tr>
		<tr><td><label for="memo">메모</label></td>
			<td><textarea name="memo" cols="20" rows="5" ></textarea></td></tr>
		<tr><td></td><td><input type="submit" /></td></tr>
	</form>
	</table>
	<hr/>
	<table>
	<tr><th>ID</th><th>이름</th></tr>
	<tr>
		<td></td>
		<td></td>
	</tr>
	</table>
</body>
</html>