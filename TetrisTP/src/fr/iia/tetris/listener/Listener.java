package fr.iia.tetris.listener;

import java.util.ArrayList;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import fr.iia.tetris.model.Tetriminos;
import fr.iia.tetris.model.Utilisateurs;

public class Listener implements ServletContextListener
{
	@Override
	public void contextInitialized(ServletContextEvent event) {
		System.out.println("CREATION CONTEXTE");
		
		ArrayList<Tetriminos> tetris = new ArrayList<Tetriminos>();
		ArrayList<Utilisateurs> users = new ArrayList<Utilisateurs>();
		
		//tetriminos
		tetris.add(new Tetriminos(1, "L", "rouge"));
		tetris.add(new Tetriminos(2, "Z", "jaune"));
		tetris.add(new Tetriminos(3, "T", "vert"));
		
		//users
		/*users.add(new Utilisateurs(1, "dylan", "not24get"));
		users.add(new Utilisateurs(2, "thomas", "password"));*/
		
		event.getServletContext().setAttribute("tetris", tetris);
		//event.getServletContext().setAttribute("users", users);
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("DESTRUCTION CONTEXTE");
	}

}
