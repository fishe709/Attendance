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
	<script type="text/javascript" src="js/jquery-1.4.4.js"></script>
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
  	<script type="text/javascript">
  		var ps = {};
				//ps.jsonString = "{pagination:{needsPaginate:true,startPos:0,amount:10},"+
				//"data:{assuredName:'龙',insuranceId:13,classId:1440,assuredCard:'512021195010137868',startTime:'2016-07-05',lastTime:'2016-09-09',cityId:2208,townId:220801,provinceId:22}}";
				ps.jsonString= "{data:{\"Tid\":2030123403,\"Name\":\"test\",\"Type\":1,\"Comments\":\"hehehe\"}}";			
				$.ajax({
					url : "http://127.0.0.1:8081/AttendanceService/mvc/web/sysTest", //访问路径
					type : "POST", //访问方式
					data : ps,
					dataType : "json",
					success : function(res) {  
						console.log(res);
						/* var colHtml = "";
						var ids="";
				        $.each(res.data, function(i, value){
				        	colHtml+="<img src='"+this.picturepath+"'/><br/>"; 
				        	ids+=this.id;
				        });
				        $("p").html(colHtml); */
				        //alert(ids);
					}
				});
	</script>
    This is my JSP page.1 <br>
  </body>
</html>
