package luhang.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


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
		return Msg.success().add("luhanginfos", list);
	}

}
