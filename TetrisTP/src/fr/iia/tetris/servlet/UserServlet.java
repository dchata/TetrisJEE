package fr.iia.tetris.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import fr.iia.tetris.dao.IDAO;
import fr.iia.tetris.model.Utilisateurs;

@WebServlet("/login")
public class UserServlet extends HttpServlet 
{
	@Autowired
	private IDAO<Utilisateurs> utilisateurDAO;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this, config.getServletContext());
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		List<Utilisateurs> users = utilisateurDAO.findAll();
		
		request.setAttribute("users", users);

		//Récupération valeurs saisies par l'utilisateur		
		String username = (String)request.getParameter("login");
		String password = (String)request.getParameter("password");
		
		for (Utilisateurs utilisateurs : users) //On regarde dans le tableau pour faire une vérif sur name et password
		{
			if(utilisateurs.getUsername().equals(username) && utilisateurs.getPassword().equals(password))//vérification saisie utilisateur pour la connexion
			{
				request.getSession().setAttribute("username", username);
				response.sendRedirect("home");
				return;
			}
		}
		this.getServletContext().getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request , response );
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
