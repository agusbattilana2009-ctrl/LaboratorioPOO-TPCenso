package modelo;

import java.util.ArrayList;

public class Comuna {
	//Variables
	private int numComuna;
	private String sede;
	private ArrayList <Barrio> barrios = new ArrayList<>();
	
	//Métodos
	public boolean AtencionPrioritaria() {
		int contador = 0;
		for (Barrio b : barrios) {
			if (b.indiceCriticidad() == true) {
				contador = contador * 1;
			}
		}
		if (contador > barrios.size()) {
			return true;
		}
		else return false;
	}
	
	//getters y setters
	
	
	
	public ArrayList<Barrio> getBarrios() {
		return barrios;
	}
	public int getNumComuna() {
		return numComuna;
	}
	public String getSede() {
		return sede;
	}
	
	public int cantidadDeBarrios() {
		return barrios.size();
	}
	
	//Constructor
	public Comuna(int numComuna, String sede, ArrayList<Barrio> barrios) {
		super();
		this.numComuna = numComuna;
		this.sede = sede;
		this.barrios = barrios;
	}
}
