
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%-- <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%--  <jsp:forward page="/WEB-INF/views/show7C8501.jsp"></jsp:forward>  --%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页</title>
<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<!-- web路径：
不以/开始的相对路径，找资源，以当前资源的路径为基准，经常容易出问题。
以/开始的相对路径，找资源，以服务器的路径为标准(http://localhost:3306)；需要加上项目名
		http://localhost:3306/crud
 -->
<script type="text/javascript"
	src="${APP_PATH }/static/js/jquery-1.12.4.min.js"></script>
<link
	href="${APP_PATH }/static/bootstrap-3.3.7-dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="${APP_PATH }/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
	
	
	
		<script type="text/javascript">

	function find7C01(){
		window.location.href="/LuhangComparePrice/web/7C8501";
		}
	function find7C02(){
		window.location.href="/LuhangComparePrice/web/7C8502";
	}
	function find7C03(){
		window.location.href="/LuhangComparePrice/web/7C8503";
	}
	function find7C04(){
		window.location.href="/LuhangComparePrice/web/7C8504";
	}
	function findLJ01(){
		window.location.href="/LuhangComparePrice/web/LJ101";
	}
	function findLJ02(){
		window.location.href="/LuhangComparePrice/web/LJ102";
	}
	function findTW07(){
		window.location.href="/LuhangComparePrice/web/TW607";
	}
	function findTW08(){
		window.location.href="/LuhangComparePrice/web/TW608";
	}
	function findTW11(){
		window.location.href="/LuhangComparePrice/web/TW611";
	}
	function findTW12(){
		window.location.href="/LuhangComparePrice/web/TW612";
	}
	</script>
	
	
</head>

<body style="width:100%;height:100%;border:solid 0px red;" id="bodyHeight">
  	<div class="container" style="width:100%;height:100%;margin-top:20px;">
		<div class="panel panel-primary"  id="mainPanel">
	
			 
			<div id="panelHeading" style="width:100%;height:100px;background-color:#337ab7;display:table;padding-left:10px">
				<div style="background-color:#337ab7;display:table-cell;vertical-align:middle;padding-left:10px">
					<font color="white" size="6">鲁航比价系统</font>
				</div>
				<div id="param_config" style="background-color:#337ab7;display:table-cell;vertical-align:middle;padding-right:10px;text-align:right">
				</div>
			</div>
			
			<div class="panel-body"style="width:100%;height:500px">

         <div style="float:left;width:100%;height:50px"> 
			<div><font color="green" size="5"><u>7C系列航班 </u></font>
			</div>
			</div>
			
				<div style="width:100%;height:100px;border:solid 0px red;margin-top:5px;margin-left:10px;cursor:pointer;">
  					<div onclick="javascript:find7C01()"style="float:left;width:18%;height:70px;text-align:center;background: #f0ad4e;box-shadow:0 0 10px  #f0ad4e;border-radius:7px;margin-left:7px;cursor:pointer;">
  						
  					<div style="float:left;width:40%;height:50px;margin-top:17px;">
 							<span class="glyphicon glyphicon-plane" aria-label="Left Align" aria-hidden="true" style="float:right;color:white;font-Size:35px"></span>
  						</div>	
  						<div style="float:center;width:50%;height:50px; margin-top:20px;margin-left:60px; ">
  							<div ><font   color="white" size="3"><strong>7C8501航班</strong></font></div>
  							
  						</div>
  					</div>
  					<div onclick="javascript:find7C02()" style="float:left;width:18%;height:70px;text-align:center;background: #d9534f;box-shadow:0 0 10px  #d9534f;border-radius:7px;margin-left:7px;cursor:pointer;">
  						
  					<div style="float:left;width:40%;height:50px;margin-top:17px;">
 							<span class="glyphicon glyphicon-plane" aria-label="Left Align" aria-hidden="true" style="float:right;color:white;font-Size:35px"></span>
  						</div>	
  						<div style="float:center;width:50%;height:50px; margin-top:20px;margin-left:60px; ">
  							<div ><font   color="white" size="3"><strong>7C8502航班</strong></font></div>
  							
  						</div>
  					</div>
  						<div onclick="javascript:find7C03()" style="float:left;width:18%;height:70px;text-align:center;background: #5cb85c;box-shadow:0 0 10px  #5cb85c;border-radius:7px;margin-left:7px;cursor:pointer;">
  						
  					<div style="float:left;width:40%;height:50px;margin-top:17px;">
 							<span class="glyphicon glyphicon-plane" aria-label="Left Align" aria-hidden="true" style="float:right;color:white;font-Size:35px"></span>
  						</div>	
  						<div style="float:center;width:50%;height:50px; margin-top:20px;margin-left:60px; ">
  							<div ><font   color="white" size="3"><strong>7C8503航班</strong></font></div>
  							
  						</div>
  					</div>
  							<div onclick="find7C04()" style="float:left;width:18%;height:70px;text-align:center;background: #428bca;box-shadow:0 0 10px  #428bca;border-radius:7px;margin-left:7px;cursor:pointer;">
  						
  					<div style="float:left;width:40%;height:50px;margin-top:17px;">
 							<span class="glyphicon glyphicon-plane" aria-label="Left Align" aria-hidden="true" style="float:right;color:white;font-Size:35px"></span>
  						</div>	
  						<div style="float:center;width:50%;height:50px; margin-top:20px;margin-left:60px; ">
  							<div ><font   color="white" size="3"><strong>7C8504航班</strong></font></div>
  							
  						</div>
  					</div>
  					
  					
 
  				</div>
			
			
			
			
	    <div style="float:left;width:100%;height:50px ;margin-top:15px;" > 
			<div><font color="green" size="5"><u>TW系列航班 </u></font>
			</div>
			</div>
			
				<div style="width:100%;height:100px;border:solid 0px red;margin-top:5px;margin-left:10px;cursor:pointer;">
  					<div onclick="javascript:findTW07()" style="float:left;width:18%;height:70px;text-align:center;background: #f0ad4e;box-shadow:0 0 10px  #f0ad4e;border-radius:7px;margin-left:7px;cursor:pointer;">
  						
  					<div style="float:left;width:40%;height:50px;margin-top:17px;">
 							<span class="glyphicon glyphicon-plane" aria-label="Left Align" aria-hidden="true" style="float:right;color:white;font-Size:35px"></span>
  						</div>	
  						<div style="float:center;width:50%;height:50px; margin-top:20px;margin-left:60px; ">
  							<div ><font   color="white" size="3"><strong>TW607航班</strong></font></div>
  							
  						</div>
  					</div>
  					<div onclick="javascript:findTW08()" style="float:left;width:18%;height:70px;text-align:center;background: #d9534f;box-shadow:0 0 10px  #d9534f;border-radius:7px;margin-left:7px;cursor:pointer;">
  						
  					<div style="float:left;width:40%;height:50px;margin-top:17px;">
 							<span class="glyphicon glyphicon-plane" aria-label="Left Align" aria-hidden="true" style="float:right;color:white;font-Size:35px"></span>
  						</div>	
  						<div style="float:center;width:50%;height:50px; margin-top:20px;margin-left:60px; ">
  							<div ><font   color="white" size="3"><strong>TW608航班</strong></font></div>
  							
  						</div>
  					</div>
  						<div onclick="javascript:findTW11()" style="float:left;width:18%;height:70px;text-align:center;background: #5cb85c;box-shadow:0 0 10px  #5cb85c;border-radius:7px;margin-left:7px;cursor:pointer;">
  						
  					<div style="float:left;width:40%;height:50px;margin-top:17px;">
 							<span class="glyphicon glyphicon-plane" aria-label="Left Align" aria-hidden="true" style="float:right;color:white;font-Size:35px"></span>
  						</div>	
  						<div style="float:center;width:50%;height:50px; margin-top:20px;margin-left:60px; ">
  							<div ><font   color="white" size="3"><strong>TW611航班</strong></font></div>
  							
  						</div>
  					</div>
  							<div onclick="javascript:findTW12()" style="float:left;width:18%;height:70px;text-align:center;background: #428bca;box-shadow:0 0 10px  #428bca;border-radius:7px;margin-left:7px;cursor:pointer;">
  						
  					<div style="float:left;width:40%;height:50px;margin-top:17px;">
 							<span class="glyphicon glyphicon-plane" aria-label="Left Align" aria-hidden="true" style="float:right;color:white;font-Size:35px"></span>
  						</div>	
  						<div style="float:center;width:50%;height:50px; margin-top:20px;margin-left:60px; ">
  							<div ><font   color="white" size="3"><strong>TW612航班</strong></font></div>
  							
  						</div>
  					</div>
  					
  					
  					  <div style="float:left;width:100%;height:50px ;margin-top:15px;" > 
			<div><font color="green" size="5"><u>LJ系列航班 </u></font>
			</div>
			</div>
  					<div onclick="javascript:findLJ01()" style="float:left;width:18%;height:70px;text-align:center;background: #f0ad4e;box-shadow:0 0 10px  #f0ad4e;border-radius:7px;margin-left:7px;cursor:pointer;">
  						
  					<div style="float:left;width:40%;height:50px;margin-top:17px;">
 							<span class="glyphicon glyphicon-plane" aria-label="Left Align" aria-hidden="true" style="float:right;color:white;font-Size:35px"></span>
  						</div>	
  						<div style="float:center;width:50%;height:50px; margin-top:20px;margin-left:60px; ">
  							<div ><font   color="white" size="3"><strong>LJ101航班</strong></font></div>
  							
  						</div>
  					</div>
  					<div onclick="javascript:findLJ02()" style="float:left;width:18%;height:70px;text-align:center;background: #d9534f;box-shadow:0 0 10px  #d9534f;border-radius:7px;margin-left:7px;cursor:pointer;">
  						
  					<div style="float:left;width:40%;height:50px;margin-top:17px;">
 							<span class="glyphicon glyphicon-plane" aria-label="Left Align" aria-hidden="true" style="float:right;color:white;font-Size:35px"></span>
  						</div>	
  						<div style="float:center;width:50%;height:50px; margin-top:20px;margin-left:60px; ">
  							<div ><font   color="white" size="3"><strong>LJ102航班</strong></font></div>
  							
  						</div>
  					</div>
  					
 
  				</div>		
			
			
			
			
			
			
			
			
			
			
	
			</div>
		</div>
	</div>	
	</body>

	
	
</html>









