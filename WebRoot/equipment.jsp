<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script type="text/javascript" src="js/jquery-1.11.2.min.js"></script>
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style>
		input{
			height:40px;
			width:300px;
		}
	</style>
  </head>
  
  <body>
  	<script type="text/javascript">
  	$(document).ready(function(){
  		$('#addEquipmentInfo').on('click',function(){
  			var ps = {};
  			ps.jsonString= "{data:{\"Tid\":2030123403,\"Name\":\"test\",\"Type\":1,\"Comments\":\"hehehe\"}}";
  			$.ajax({
				url : "http://127.0.0.1:8081/AttendanceService/mvc/equipment/sysTest", //访问路径
				type : "POST", //访问方式
				data : ps,
				dataType : "json",
				success : function(res) {  
					console.log(res);
				}
			});
  		});
  		
  		$('#updateEquipmentInfo').on('click',function(){
  			var ps = {};
  			ps.jsonString= "{data:{\"Tid\":2030123405,\"Name\":\"test2\",\"Type\":3,\"Comments\":\"hehehe2\"}}";
  			$.ajax({
				url : "http://127.0.0.1:8081/AttendanceService/mvc/equipment/update", //访问路径
				type : "POST", //访问方式
				data : ps,
				dataType : "json",
				success : function(res) {  
					console.log(res);
				}
			});
  		});
  		
  		$('#deleteEquipmentInfo').on('click',function(){
  			var ps = {};
  			ps.jsonString= "{data:{\"Tid\":2030123403}}";
  			$.ajax({
				url : "http://127.0.0.1:8081/AttendanceService/mvc/equipment/delete", //访问路径
				type : "POST", //访问方式
				data : ps,
				dataType : "json",
				success : function(res) {  
					console.log(res);
				}
			});
  		});
  		
   		$('#queryEquipmentsList').on('click',function(){
  			var ps = {};
  			ps.jsonString= "{pagination:{amount:2,needsPaginate:true,startPos:1},data:{}}";
  			$.ajax({
				url : "http://127.0.0.1:8081/AttendanceService/mvc/equipment/getList", //访问路径
				type : "POST", //访问方式
				data : ps,
				dataType : "json",
				success : function(res) {  
					console.log(res);
				}
			});
  		});
  		
  		
  	});
	</script>
    <div style="height:50px">
    	<input id='addEquipmentInfo' type='button' value='addEquipmentInfo (新增设备)'>
    </div>
    <div style="height:50px">
    	<input id='queryEquipmentInfo' type='button' value='queryEquipmentInfo (查询设备)'>
    </div>
    <div style="height:50px">
    	<input id='updateEquipmentInfo' type='button' value='updateEquipmentInfo (更新设备)'>
    </div>
    <div style="height:50px">
    	<input id='deleteEquipmentInfo' type='button' value='deleteEquipmentInfo (删除设备)'>
    </div>
    <div style="height:50px">
    	<input id='queryEquipmentsList' type='button' value='queryEquipmentsList (获取设备列表)'>
    </div>
  </body>
</html>
