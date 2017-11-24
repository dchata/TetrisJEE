package fr.iia.tetris.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController 
{
	@RequestMapping(value={ "/home", "/home/{username}"}, method=RequestMethod.GET)
	public String home(@PathVariable(value="username", required=false) String username, Model model)
	{
		model.addAttribute("username", username);
		return "home";
	}
}
