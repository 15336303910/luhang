<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>jqgrid测试</title>


<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>


<!-- jqGrid组件基础样式包-必要 -->
<link rel="stylesheet" href="${ APP_PATH}/static/jqgrid/css/ui.jqgrid.css" />
<!-- jqGrid主题包-非必要 --> 
<!-- 在jqgrid/css/css这个目录下还有其他的主题包，可以尝试更换看效果 -->
<link rel="stylesheet" href="${ APP_PATH}/static/jqgrid/css/css/hot-sneaks/jquery-ui-1.8.16.custom.css" />		


<style>
  
html, body {  
   margin: 0;
     
  padding: 0;
  
   font-size: 75%;
     
}
  
</style>
<!-- jquery插件包-必要 -->
<!-- 这个是所有jquery插件的基础，首先第一个引入 -->
<script src="${ APP_PATH}/static/js/jquery-1.12.4.min.js" type="text/javascript"></script>
<!-- jqGrid插件包-必要 -->
<script type="text/javascript" src="${ APP_PATH}/static/jqgrid/js/jquery.jqGrid.src.js"></script>
<!-- jqGrid插件的多语言包-非必要 -->
<!-- 在jqgrid/js/i18n下还有其他的多语言包，可以尝试更换看效果 -->
<script type="text/javascript" src="${ APP_PATH}/static/jqgrid/js/i18n/grid.locale-cn.js"></script>

<%-- <link rel="stylesheet" type="text/css" media="screen" href="${ APP_PATH}/static/jquery.jqGrid-4.4.3/css/jquery-ui.css" />  --%>
<%-- <link rel="stylesheet" type="text/css" media="screen" href="${ APP_PATH}/static/jquery.jqGrid-4.4.3/css/ui.jqgrid.css" /> --%>
<%-- <link rel="stylesheet" type="text/css" media="screen" href="${ APP_PATH}/static/jquery.jqGrid-4.4.3/plugins/searchFilter.css" /> --%>
<%--  <script src="${ APP_PATH}/static/js/jquery-ui.min.css" type="text/javascript"></script> --%>
<%--  <link  href="${APP_PATH }/static/bootstrap-3.3.7-dist/css/bootstrap.min.css"  rel="stylesheet"> --%>
 
  
<%-- <script src="${ APP_PATH}/static/js/jquery-1.12.4.min.js" type="text/javascript"></script> --%>
<%--  <script src="${ APP_PATH}/static/js/jquery-ui.min.js" type="text/javascript"></script> --%>
<%-- <script src="${ APP_PATH}/static/jquery.jqGrid-4.4.3/src/grid.loader.js" type="text/javascript"></script> --%>
<%-- <script src="${ APP_PATH}/static/jquery.jqGrid-4.4.3/src/i18n/grid.locale-cn.js" type="text/javascript"></script> --%>
<%--  <script src="${APP_PATH }/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script> --%>
<%-- <script type="text/javascript" src="${ APP_PATH}/static/jquery.jqGrid-4.4.3/js/jquery.jqGrid.min.js"/> --%>



  <script type="text/javascript">

  $(function(){
		//页面加载完成之后执行
		pageInit();
	});
	function pageInit(){
		//创建jqGrid组件
		jQuery("#list2").jqGrid(
				{
					url : '	http://localhost:8080/LuhangSystem/static/data/data1.json',//组件创建完成之后请求数据的url
					datatype : "json",//请求数据返回的类型。可选json,xml,txt
					colNames : ['日期', '网站平台', '展示价', '对手一价格', '对手二价格','对手三价格', '线上卖出' ,'线上现库存', '线上总库存', '线下预定','线下卖出' ,'线下现库存', '线下总库存','ROC','总库存', '总余位' ],//jqGrid的列显示名字
					colModel : [ //jqGrid每一列的配置信息。包括名字，索引，宽度,对齐方式.....
					          
					             {name : '日期',index : 'date',width : 100,align : "center"}, 
					             {name : '网站平台',index : 'invdate',width : 90,align : "center"}, 
					             {name : '展示价',index : 'name asc, invdate',width : 100,align : "center"}, 
					             {name : '对手一价格',index : 'amount',width : 80,align : "center"}, 
					             {name : '对手二价格',index : 'tax',width : 80,align : "center"}, 
					             {name : '对手三价格',index : 'total',width : 80,align : "center"}, 
					             {name : '线上卖出',index : 'note',width : 150,sortable : false,align : "center"},
					             {name : '线上现库存',index : 'id',width : 80,align : "center"}, 
					             {name : '线上总库存',index : 'invdate',width : 90,align : "center"}, 
					             {name : '线下预定',index : 'name asc, invdate',width : 100,align : "center"}, 
					             {name : '线下卖出',index : 'amount',width : 80,align : "center"}, 
					             {name : '线下现库存',index : 'tax',width : 80,align : "center"}, 
					             {name : '线下总库存',index : 'total',width : 80,align : "center"}, 
					             {name : 'ROC',index : 'note',width : 150,sortable : false,align : "center"}, 
					             {name : '总库存',index : 'total',width : 80,align : "center"}, 
					             {name : '总余位',index : 'note',width : 150,sortable : false,align : "center"} 
					            
					             
					             
					             
					          
					           ],
					rowNum : 10,//一页显示多少条
					rowList : [ 10, 20, 30 ],//可供用户选择一页显示多少条
					pager : '#pager2',//表格页脚的占位符(一般是div)的id
					sortname : 'id',//初始化的时候排序的字段
					sortorder : "desc",//排序方式,可选desc,asc
					mtype : "post",//向后台请求数据的ajax的类型。可选post,get
					viewrecords : true,
					caption : "鲁航集团 ：                一路有你，航行天下！"//表格的标题名字
				});
		/*创建jqGrid的操作按钮容器*/
		/*可以控制界面上增删改查的按钮是否显示*/
		jQuery("#list2").jqGrid('navGrid', '#pager2', {edit : false,add : false,del : false});
	}


</script>







</head>









<body  style="width:100%;height:100%;border:solid 0px red ">

<div>你好！</div>
<div id="jqgrid-wrapper">
	<table  id="list2" class="table table-striped table-hover" style="width:100%;height:100%">
		<tr>
			<td></td>
		</tr>
	</table>
	<div id="jqgrid-pager"></div>
</div>





</body>
</html>