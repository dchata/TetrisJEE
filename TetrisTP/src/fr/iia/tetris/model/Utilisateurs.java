package fr.iia.tetris.model;

public class Utilisateurs {
	private String username;
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Utilisateurs(){}
	
	public Utilisateurs(String nom, String mdp) {
		username = nom;
		password = mdp;
	}
}
