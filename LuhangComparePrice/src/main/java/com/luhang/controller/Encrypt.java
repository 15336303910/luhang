package com.luhang.controller;

import java.lang.annotation.*;

import org.springframework.web.bind.annotation.Mapping;

/**
 * 进行参数加密和解密
 *
 * @author wuzidong
 *
 */
@Target({ElementType.PARAMETER, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented

public @interface Encrypt {
	
	
	
	
}
