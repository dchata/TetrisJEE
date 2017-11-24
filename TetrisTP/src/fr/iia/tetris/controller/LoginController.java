package fr.iia.tetris.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import fr.iia.tetris.dao.IDAO;
import fr.iia.tetris.model.Utilisateurs;

@Controller
public class LoginController 
{
	private IDAO<Utilisateurs> utilisateurDAO;
	
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String login(Model model)
	{
		return "login";
	}
	
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public String loginPost(HttpSession session, Model model, @RequestParam String login, @RequestParam String password)
	{
		List<Utilisateurs> users = utilisateurDAO.findAll();
		
		Utilisateurs username = null;
		
		for (Utilisateurs utilisateurs : users) //On regarde dans le tableau pour faire une vérif sur name et password
		{
			if(utilisateurs.getUsername().equals(login) && utilisateurs.getPassword().equals(password))//vérification saisie utilisateur pour la connexion
			{
				username = utilisateurs;
				break;
			}
		}
		
		if(username != null)
		{
			model.addAttribute("username", username);
			session.setAttribute("username", username);
		}
		else
		{
			 model.addAttribute("error", true);
		}
		return "login";
	}
}
