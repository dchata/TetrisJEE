package fr.iia.tetris.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tetriminos")
public class TetriminosController 
{
	@RequestMapping("/list")
	public String liste()
	{
		return "listTetriminos";
	}
	
	@RequestMapping("/add")
	public String add()
	{
		return "addTetriminos";
	}
	
	@RequestMapping("/edition")
	public String edition()
	{
		return "editTetriminos";
	}
}
