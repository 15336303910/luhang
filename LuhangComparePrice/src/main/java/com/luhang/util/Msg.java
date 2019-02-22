package com.luhang.util;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * ͨ�õķ�����
 * @author AixsCode
 *
 */
public class Msg {
      
	//״̬�� 100-�ɹ�   200-ʧ��
	
	private int code;
	
	private String msg;
	
	//�û�Ҫ���ظ������������
	
	private Map<String, Object> extend=new HashMap<String, Object>();
    
	public static Msg success()
	{
		Msg result=new Msg();
		result.setCode(100);
		result.setMsg("操作成功！");
		return result;
	}
	
	public static Msg fail()
	{
		Msg result=new Msg();
		result.setCode(100);
		result.setMsg("操作失败，请重试！");
		return result;
		
	}
	public Msg add(String key, Object value)
	{
		this.getExtend().put(key, value);
		return this;
	}
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public Map<String, Object> getExtend() {
		return extend;
	}

	public void setExtend(Map<String, Object> extend) {
		this.extend = extend;
	}
	
}
