package com.macys.queue.processor.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.macys.queue.processor.dto.Login;

@Controller
public class LoginController {
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	  public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response,
	  @ModelAttribute("login") Login login) {
		
		ModelAndView mav = null;
	    //todo
	    if ("123".equals(login.getPwd())) {
	    mav = new ModelAndView("index");
	    mav.addObject("firstname", login.getName());
	    } else {
	    mav = new ModelAndView("login");
	    mav.addObject("message", "Username or Password is wrong!!");
	    }
		return mav;
	}

}
