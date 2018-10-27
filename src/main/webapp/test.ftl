<form action="testList" method="get">
	请输入姓名:<input type="text" name="myContent" value=${content}>
		<input type="submit" value="查询"/>
</form>


<table border="1">
	<tr>
		<th>用户Id</th>
		<th>姓名</th>
		<th>年龄</th>
		<th>手机号</th>
	</tr>
	<#list testList as temp>
		<tr>
			<td>${temp.id}</td>
			<td>${temp.name}</td>
			<td>${temp.age}</td>
			<td>${temp.phoneNuber}</td>
		</tr>
	</#list>
</table>