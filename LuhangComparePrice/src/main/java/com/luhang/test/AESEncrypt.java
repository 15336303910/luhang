package com.luhang.test;

import java.awt.List;
import java.io.*;
import java.util.ArrayList;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.Charsets;

import net.sf.json.JSONObject;
import org.apache.commons.io.IOUtils;

public class AESEncrypt {
	
	
	public static String encrypt(String content, String password) throws Exception{
		try {
				byte[] raw = password.getBytes(Charsets.UTF_8);
		
						if (raw.length != 16) {
						throw new IllegalArgumentException("Invalid key size. " + password + ", 密钥 token 长度不是 16 位");
								}
				javax.crypto.spec.SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");
				javax.crypto.Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
				cipher.init(Cipher.ENCRYPT_MODE, skeySpec, new javax.crypto.spec.IvParameterSpec(new byte[16])); // zero IV
				byte[]  finall  = cipher.doFinal(content.getBytes(Charsets.UTF_8));
				return new String(org.apache.commons.codec.binary.Base64.encodeBase64(finall));

		} catch (Exception e) {
			
	  System.out.println(e.getMessage());	
		throw e;

		}
		}

	public static void main(String[] args) {
		String keyStr = "1234567890123456";//测试用秘钥
		JSONObject jsonObject =new JSONObject();
	    String s = "";
	    String message=null;
	 ArrayList<String> aList=new ArrayList<String>();
		try {  
            BufferedReader br = new BufferedReader(new FileReader(  
                    "src/main/java/com/luhang/test/dataorder.json"));// 读取原始json文件  
   
            message = IOUtils.toString(br);
            System.out.println(message);  
            while ((s = br.readLine()) != null) {  
              //  System.out.println(s);  
                  aList.add(s);
            }  
 
  
        } catch (IOException e) {  
            // TODO Auto-generated catch block  
            e.printStackTrace();  
        }  
  
		

		String content = "abcdefghigklmnopqrstuvwxyz0123456789";//加密内容
		// 加密
		System.out.println(message);  
		try {
			String encryptStr = encrypt(message, keyStr);
			System.out.println(encryptStr);
		} catch (Exception e) {
		
			e.printStackTrace();


		}
	}
	
	
}
