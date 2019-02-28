package com.wzy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Properties;

/**
 * 通过HandleGlobalException做全局异常处理
 *
 *
 */
@Configuration
public class HandleGlobalException implements HandlerExceptionResolver{
	/**
	 * 可传递值与页面
	 */
	@Override
	public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
		ModelAndView modelAndView = new ModelAndView();
		if(e instanceof ArithmeticException){
			modelAndView.addObject("mes",e.getMessage());
			modelAndView.setViewName("index");
		}
		if(e instanceof NullPointerException){
			modelAndView.addObject("mes",e.getMessage());
			modelAndView.setViewName("index");
		}
		return modelAndView;
	}
}
