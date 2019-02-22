<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>LJ101航班票价监控</title>


<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>


<!-- jqGrid组件基础样式包-必要 -->
<link rel="stylesheet" href="${ APP_PATH}/static/jqgrid/css/ui.jqgrid.css" />
<!-- jqGrid主题包-非必要 --> 
<!-- 在jqgrid/css/css这个目录下还有其他的主题包，可以尝试更换看效果 -->
<link rel="stylesheet" href="${ APP_PATH}/static/jqgrid/css/css/hot-sneaks/jquery-ui-1.8.16.custom.css" />		


<style>
  

  
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
 			//$(window).resize(function(){   $("#list2").setGridWidth($(window).width());});
		pageInit();
		window.setInterval(function(){
			jQuery("#list2").trigger("reloadGrid");
		}
		,50000);
	});
  
  
  


  
  
	function pageInit(){
		//创建jqGrid组件
		jQuery("#list2").jqGrid(
				{
					url : '/LuhangComparePrice/QunaerPriceCompare/displayLJ101 ',//组件创建完成之后请求数据的url
					datatype : "json",//请求数据返回的类型。可选json,xml,txt
				    height:'75%',
				  
				    jsonReader:{
				    	  root:"rows",
				          page: "page",
				    	 total: "total",
				    	 records: "records",
				    	  repeatitems:false,
				        userdata: "userdata"
				    },
				//	colNames : ['序号','日期','航班号' ,'网站平台', '展示价', '7C8504最低价', '大韩KE840最低价','对手三价格', '线上卖出' ,'线上现库存', '线上总库存', '线下预定','线下卖出' ,'线下现库存', '线下总库存','ROC','总库存', '总余位' ],//jqGrid的列显示名字
				colNames : ['日期' ,'航班号' ,'网站平台', 'LJ101最低价', '春秋航空9C8568最低价','吉祥航空HO1378最低价'],
				colModel : [ //jqGrid每一列的配置信息。包括名字，索引，宽度,对齐方式.....
					          
						       
					            {name : 'date',index : 'date',formatter:"date",formatoptions: {srcformat:'Y-m-d H:i:s',newformat:'Y-m-d'},width : 200,align : "center"}, 
					          //{name : 'date',index : 'date',width : 100,align : "center"}, 
					          {name : 'flight_num',index : 'flight_num',width : 200,align : "center"}, 
					             {name : 'platform_web',index : 'platform_web',width : 200,align : "center"}, 
					             {name : 'sameairline_opp',index : 'sameairline_opp',width : 200,align : "center"}, 
					             {name : 'diffairline_opp1',index : 'diffairline_opp1',width : 200,align : "center"}, 
					             {name : 'diffairline_opp2',index : 'diffairline_opp2',width : 200,align : "center"}
					         /*    {name : 'sold_online',index : 'sold_online',width : 100,sortable : false,align : "center"},
					             {name : 'remaining_online',index : 'remaining_online',width : 100,align : "center"}, 
					             {name : 'inventory_online',index : 'inventory_online',width : 100,align : "center"}, 
					             {name : 'booking_offline',index : 'booking_offline',width : 100,align : "center"}, 
					             {name : 'sold_offline',index : 'sold_offline',width : 100,align : "center"}, 
					             {name : 'remaining_offline',index : 'remaining_offline',width : 100,align : "center"}, 
					             {name : 'remaining_offline',index : 'inventory_offline',width : 100,align : "center"}, 
					             {name : 'roc',index : 'roc',width : 100,sortable : false,align : "center"}, 
					             {name : 'inventory_total',index : 'inventory_total',width : 100,align : "center"}, 
					             {name : 'remaining_total',index : 'remaining_total',width : 100,sortable : false,align : "center"} */
					            
					             
					             
					             
					          
					           ],
					rowNum : 30,//一页显示多少条
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


<div id="jqgrid-wrapper"  style="width:100%;height:100%;border:solid 0px red ">
	<table  id="list2" class="table table-striped table-hover" style="width:100%;height:100%">
		<tr>
			<td></td>
		</tr>
	</table>
	<div id="jqgrid-pager"></div>
</div>





</body>
</html>