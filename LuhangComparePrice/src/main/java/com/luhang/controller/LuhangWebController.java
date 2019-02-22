package com.luhang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
@RequestMapping("/web")
public class LuhangWebController {


	@RequestMapping("/7C8501" )
	public String  Luhang7C8501()
	{
		
	   return "show7C8501";
	}
	@RequestMapping("/7C8502" )
	public String  Luhang7C8502()
	{
		
	   return "show7C8502";
	}
	@RequestMapping("/7C8503" )
	public String  Luhang7C8503()
	{
		
	   return "show7C8503";
	}
	@RequestMapping("/7C8504" )
	public String  Luhangweb()
	{
		
	   return "show7C8504";
	}
	@RequestMapping("/LJ101" )
	public String  LuhangLJ101()
	{
		
	   return "showLJ101";
	}
	@RequestMapping("/LJ102" )
	public String  LuhangLJ102()
	{
		
	   return "showLJ102";
	}
	@RequestMapping("/TW607" )
	public String  LuhangTW607()
	{
		
	   return "showTW607";
	}
	@RequestMapping("/TW608" )
	public String  LuhangTW608()
	{
		
	   return "showTW608";
	}
	@RequestMapping("/TW611" )
	public String  LuhangTW611()
	{
		
	   return "showTW611";
	}
	@RequestMapping("/TW612" )
	public String  LuhangTW612()
	{
		
	   return "showTW612";
	}
}
