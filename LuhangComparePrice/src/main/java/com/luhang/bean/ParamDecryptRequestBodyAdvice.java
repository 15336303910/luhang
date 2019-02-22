package com.luhang.bean;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;

import org.apache.commons.io.IOUtils;

import org.springframework.core.MethodParameter;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.mvc.method.annotation.RequestBodyAdvice;

import com.luhang.controller.Encrypt;
import com.luhang.util.EncryptUtil.EncryptAndDecrypt;



/**
 * ��������
 *
 * @author wuzidong 
 * @date 2018/9/28 - 16:09
 */

@ControllerAdvice
public class ParamDecryptRequestBodyAdvice implements RequestBodyAdvice {


	public boolean supports(MethodParameter methodParameter, Type type, Class<? extends HttpMessageConverter<?>> aClass) {
		return methodParameter.hasParameterAnnotation(Encrypt.class);
	}


	public Object handleEmptyBody(Object o, HttpInputMessage httpInputMessage, MethodParameter methodParameter, Type type, Class<? extends HttpMessageConverter<?>> aClass) {
		return o;
	}


	public HttpInputMessage beforeBodyRead(  HttpInputMessage httpInputMessage, MethodParameter methodParameter, Type type, Class<? extends HttpMessageConverter<?>> aClass) throws IOException {
		return new HttpInputMessage() {
		
			public InputStream getBody() throws IOException {
				System.out.println("此处进行解密");
			    InputStream	inputStream=httpInputMessage.getBody();
				StringWriter writer = new StringWriter();
				IOUtils.copy(inputStream, writer, StandardCharsets.UTF_8.name());
				String str = writer.toString();
				EncryptAndDecrypt encryptAndDecrypt=new EncryptAndDecrypt();
				String param="";
				try {
					param= encryptAndDecrypt.AESDecrypt(str, "1234567890123456");
					System.out.println(param);
				} catch (Exception e) {
				
					e.printStackTrace();
				}
				return new ByteArrayInputStream(param.getBytes(StandardCharsets.UTF_8));
			}

				
			public HttpHeaders getHeaders() {
				return httpInputMessage.getHeaders();
			}
		};
	}


	public Object afterBodyRead(Object o, HttpInputMessage httpInputMessage, MethodParameter methodParameter, Type type, Class<? extends HttpMessageConverter<?>> aClass) {
		return o;
	}
}