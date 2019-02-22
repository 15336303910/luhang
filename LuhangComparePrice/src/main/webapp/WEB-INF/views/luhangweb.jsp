<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
  
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
  
<head>
  
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
  
<title>鲁航信息化运维平台</title>
  <%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<%-- <link rel="stylesheet" type="text/css" media="screen" href="${ APP_PATH}/static/jquery.jqGrid-4.4.3/css/ui-lightness/jquery-ui-1.8.16.custom.css" /> --%>
 <link rel="stylesheet" type="text/css" media="screen" href="${ APP_PATH}/static/jquery.jqGrid-4.4.3/css/jquery-ui.css" /> 
<link rel="stylesheet" type="text/css" media="screen" href="${ APP_PATH}/static/jquery.jqGrid-4.4.3/css/ui.jqgrid.css" />
<link rel="stylesheet" type="text/css" media="screen" href="${ APP_PATH}/static/jquery.jqGrid-4.4.3/plugins/searchFilter.css" />
  
  <link  href="${APP_PATH }/static/bootstrap-3.3.7-dist/css/bootstrap.min.css"  rel="stylesheet">

 
	
  
  
  
  
  
  
<style>
  
html, body {  
   margin: 0;
     
  padding: 0;
  
   font-size: 75%;
     
}
  
</style>
  
<script src="${ APP_PATH}/static/js/jquery-1.12.4.min.js" type="text/javascript"></script>
 <script src="${ APP_PATH}/static/js/jquery-ui.min.js" type="text/javascript"></script>
<script src="${ APP_PATH}/static/jquery.jqGrid-4.4.3/src/grid.loader.js" type="text/javascript"></script>
 <script src="${APP_PATH }/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
  
  <script type="text/javascript">
  
  $(function(){
	//页面加载完成之后执行
	pageInit();
});
function pageInit(){
	//创建jqGrid组件
	jQuery("#firstDataList").jqGrid(
			{
				url : 'http://localhost:8080/LuhangSystem/luhang/getLuhangInfo',//组件创建完成之后请求数据的url
				datatype : "json",//请求数据返回的类型。可选json,xml,txt
				colNames : [ '日期', '网站平台', '展示价', '对手一价格', '对手二价格','对手三价格', '线上卖出' ,'线上现库存', '线上总库存', '线下预定','线下卖出' ,'线下现库存', '线下总库存','ROC','总库存', '总余位'],//jqGrid的列显示名字
				colModel : [ //jqGrid每一列的配置信息。包括名字，索引，宽度,对齐方式.....
				             {name : '日期',index : 'date',width : 55}, 
				             {name : '网站平台',index : 'invdate',width : 90}, 
				             {name : '展示价',index : 'name asc, invdate',width : 100}, 
				             {name : '对手一价格',index : 'amount',width : 80,align : "right"}, 
				             {name : '对手二价格',index : 'tax',width : 80,align : "right"}, 
				             {name : '对手三价格',index : 'total',width : 80,align : "right"}, 
				             {name : '线上卖出',index : 'note',width : 150,sortable : false},
				             {name : '线上现库存',index : 'id',width : 55}, 
				             {name : '线上总库存',index : 'invdate',width : 90}, 
				             {name : '线下预定',index : 'name asc, invdate',width : 100}, 
				             {name : '线下卖出',index : 'amount',width : 80,align : "right"}, 
				             {name : '线下现库存',index : 'tax',width : 80,align : "right"}, 
				             {name : '线下总库存',index : 'total',width : 80,align : "right"}, 
				             {name : 'ROC',index : 'note',width : 150,sortable : false} 
				             {name : '总库存',index : 'total',width : 80,align : "right"}, 
				             {name : '总余位',index : 'note',width : 150,sortable : false} 
				           ],
				rowNum : 30,//一页显示多少条
				rowList : [ 10, 20, 30 ],//可供用户选择一页显示多少条
				pager : '#pager2',//表格页脚的占位符(一般是div)的id
				sortname : 'id',//初始化的时候排序的字段
				sortorder : "desc",//排序方式,可选desc,asc
				mtype : "post",//向后台请求数据的ajax的类型。可选post,get
				viewrecords : true,
				caption : "JSON Example"//表格的标题名字
			});
	/*创建jqGrid的操作按钮容器*/
	/*可以控制界面上增删改查的按钮是否显示*/
	jQuery("#list2").jqGrid('navGrid', '#pager2', {edit : false,add : false,del : false});
}
  
  
</script>
  
</head>
  
 <body style="width:100%;height:100%;border:solid 0px red;" id="bodyHeight">
  	<div class="container" style="width:100%;height:100%;margin-top:20px;">
		<div class="panel panel-primary"  id="mainPanel">
			<div id="panelHeading" style="width:100%;height:50px;background-color:#337ab7;display:table;padding-left:10px">
				<div style="background-color:#337ab7;display:table-cell;vertical-align:middle;padding-left:10px">
					<font id="title" color="white" size="5">鲁航运价及库存管理平台</font>
				</div>
			</div>
			
			<div class="panel-body">
				<div style="width:100%;height:50px">
				</div>
				
				<div class="col-xs-12 col-sm-12 col-md-12"
					style="margin-top:15px;display:block;">
					<!-- title已经显示具体的报表类型，这里的提示没意义 -->
					<!--<div style="width:100%;height:50px;padding-left:10px;">
						<button class="btn btn-info" style="width:80px;"><span>资金问题</span></button>
					</div>-->
		 	<div id="amount" class="col-xs-12 col-sm-12 col-md-12"
					style="margin-top:15px;display:block;">
					<table id="firstDataList" class="table table-bordered table-hover"
						style="vertical-align: middle; text-align: center;">
						<thead>
							<tr id="first_th">
								<th>日期</th>
								<th>网站平台</th>
								<th>展示价</th>
								<th>对手一价格</th>
								<th>对手二价格</th>
								<th>对手三价格</th>
								<th>线上卖出</th>
								<th>线上现库存</th>
								<th>线上总库存</th>
								<th>线下预定</th>
								<th>线下卖出</th>
								<th>线下现库存</th>
								<th>线下总库存</th>
								<th>总库存</th>
								<th>总余位</th>
							</tr>
						</thead>
						<tbody>
							
						</tbody>
					</table>
				</div>
			
				</div>
			</div>
		</div>
	</div>	
	</body>
  
</html>