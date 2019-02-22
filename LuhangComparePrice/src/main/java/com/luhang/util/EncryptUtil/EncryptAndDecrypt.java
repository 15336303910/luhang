package com.luhang.util.EncryptUtil;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.Charsets;

public class EncryptAndDecrypt {
	
	public static String AESencrypt(String content, String password) throws Exception{
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
////
	
	public static String AESDecrypt(String content, String password) throws Exception{
		try {
				byte[] raw = password.getBytes(Charsets.UTF_8);
		
						if (raw.length != 16) {
						throw new IllegalArgumentException("Invalid key size. " + password + ", 密钥 token 长度不是 16 位");
								}
				javax.crypto.spec.SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");
				javax.crypto.Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
				cipher.init(Cipher.DECRYPT_MODE, skeySpec, new IvParameterSpec(new byte[16]));
				byte[] toDecrypt = org.apache.commons.codec.binary.Base64.decodeBase64(content.getBytes());
				byte[] original = cipher.doFinal(toDecrypt);

				return new String(original, Charsets.UTF_8);


		} catch (IllegalArgumentException e)  {
			
	  System.out.println(e.getMessage());	
		throw e;

		}
		catch (Exception e){

			  System.out.println(e.getMessage());	
			}
		return null;
		
		
}
	
	
	
	




	
	
}