package fr.iia.tetris.model;

public class Tetriminos {
	private String name;
	private String color;
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
	
	public Tetriminos(String nom, String couleur) {
		name = nom;
		color = couleur;
	}
}
