package com.luhang.bean;


//import java.io.IOException;
//import java.util.Map;
//
//import org.springframework.core.MethodParameter;
//import org.springframework.http.server.ServerHttpRequest;
//import org.springframework.http.server.ServerHttpResponse;
//import org.springframework.stereotype.Component;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestControllerAdvice;
//import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;
//
//import com.alibaba.fastjson.serializer.SerializerFeature;
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.luhang.util.EncryptUtil.EncryptAndDecrypt;
//
//import lombok.RequiredArgsConstructor;
//
//import com.alibaba.fastjson.JSON;


import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.luhang.controller.Encrypt;
import com.luhang.util.EncryptUtil.EncryptAndDecrypt;

import lombok.RequiredArgsConstructor;


/**
 * 继承ResponseBodyAdvice进行加密操作
 *
 * @author 
 * @date 
 */

@RequiredArgsConstructor
@ControllerAdvice
public class ParamEncryptResponseBodyAdvice implements ResponseBodyAdvice {

	//private final ObjectMapper objectMapper = new ObjectMapper();

@Override
	public boolean supports(MethodParameter returnType, Class converterType) {
		return returnType.hasMethodAnnotation(Encrypt.class);
	}

@Override
	public Object beforeBodyWrite(Object body, MethodParameter returnType, 
			org.springframework.http.MediaType selectedContentType, Class selectedConverterType, ServerHttpRequest request, ServerHttpResponse response) {
		System.out.println("此处进行数据加密");
		//获取查询回的json结果转成String
		 String bodyStr = JSON.toJSONString(body, SerializerFeature.MapSortField);
		// System.out.println(bodyStr);
			//进行AES和BAse64加密
		 EncryptAndDecrypt encryptAndDecrypt=new EncryptAndDecrypt();
		 try {
			String Result=encryptAndDecrypt.AESencrypt(bodyStr, "1234567890123456");
			return Result;
		} catch (Exception e) {
		
			 System.out.println(e.getMessage());	
		}

		return body;
	}



	
}
