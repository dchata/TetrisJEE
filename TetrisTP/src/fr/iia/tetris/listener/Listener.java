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
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("DESTRUCTION CONTEXTE");
	}

}
