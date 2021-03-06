package com.douzone.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * 
 * @RequestMapping 클래스(타입) + 핸들러(메소드)
 *
 */
@Controller
@RequestMapping("/guestbook")
public class GuestbookController {
	
	@ResponseBody
	@RequestMapping("") //그럼 guestbook들어갔을경우 바로 list
	public String list() {
		return "Guestbookcontroller.list()";	
	}
	
	@ResponseBody
	@RequestMapping("/delete")
	public String delete() {
		return "Guestbookcontroller.delete()";	
	}
}
