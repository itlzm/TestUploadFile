package com.lzm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMapping;

/***
 * 
 * @author lzm
 *
 */
@Controller 
public class HomeController {
	
	/***
	 * 首页 返回至/page/home.jsp页面
	 * @return
	 */
	@RequestMapping("index")
	public ModelAndView index(){
		//创建模型跟视图，用于渲染页面。并且指定要返回的页面为home页面
		ModelAndView mav = new ModelAndView("home");
		return mav;
	}
	
	/***
	 * 跳转到上传文件的页面
	 * @return
	 */
	@RequestMapping("toFileUpload")
	public String toFileUpload(){
		return "fileUpload";
	}
	
	/***
	 * 跳转到上传多个文件的页面
	 * @return
	 */
	@RequestMapping("toFilesUpload")
	public String toFilesUpload(){
		return "filesUpload";
	}
	
	
}
