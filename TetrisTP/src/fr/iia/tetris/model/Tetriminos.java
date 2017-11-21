package fr.iia.tetris.model;

public class Tetriminos {
	private int id;
	private String name;
	private String color;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public Tetriminos() {}
	
	public Tetriminos(int idT, String nom, String couleur) {
		id = idT;
		name = nom;
		color = couleur;
	}
}
