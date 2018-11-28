package luhang.controller;

import java.util.List;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import luhang.bean.Msg;

import luhang.bean.LuhangInfo;
import luhang.service.LuhangInfoService;

@Controller
@RequestMapping("/luhang")
public class LuhangInfoController {
@Autowired
	
private LuhangInfoService 	luhangInfoService;

	
	@RequestMapping("/getLuhangInfo")
	@ResponseBody
	public Msg getLuhangInfo()
	{
		List<LuhangInfo> list =luhangInfoService.getLuhangInfos();
		
		LuhangInfo lf=list.get(0);
		String  formatdate =DateFormatUtils.format(lf.getDate(),"yyyy-mm-dd");
	
		
		return Msg.success().add("luhanginfos", list);
	}
	
	
	@RequestMapping("/Luhangweb")
	public ModelAndView  Luhangweb()
	{
		List<LuhangInfo> list =luhangInfoService.getLuhangInfos();
	   ModelAndView   mView=new ModelAndView();
	   mView.setViewName("jqgrid");
	   return mView;
	}
	
	
	
}
