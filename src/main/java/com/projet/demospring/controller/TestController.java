package com.projet.demospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {
@RequestMapping(value = "form",method =RequestMethod.GET)
public String getpage()
{
return "myform";	
}
}
