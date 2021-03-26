package com.projet.demospring.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.projet.demospring.model.User;

@Controller
public class HomeController {

	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}
	@RequestMapping("secondepage")
	public String page2()
	{
		return "second";
		
		
	}
	@RequestMapping(value = "user",method = RequestMethod.GET)
	public String getuser(Model m)
	{
		User u=new User("teste","teste", 33);
		User value=u;
		m.addAttribute("current",value);
		
		return "user";
	}
	@RequestMapping(value="send",method =RequestMethod.POST )
	public String result(HttpServletRequest req,Model m)
	{
		String nom="Bonjour "+req.getParameter("nom");
		m.addAttribute("nom",nom);
		
		return "myform";
	}
	
	
}
