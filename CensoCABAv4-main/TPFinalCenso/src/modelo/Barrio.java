package modelo;
import java.util.ArrayList;

public abstract class Barrio {
	
	//Variables
	private String nombreBarrio;
	private float superficie;
	private Comuna comuna;
	private ArrayList <Persona> persona = new ArrayList<>();

	
	//Métodos
	public abstract float densidadPoblacional();
	public abstract boolean indiceCriticidad();

	
	//Getters & Setters

	public ArrayList<Persona> getPersona() {
		return persona;
	}
	public void setPersona(ArrayList<Persona> persona) {
		this.persona = persona;
	}
	public void setSuperficie(float superficie) {
		this.superficie = superficie;
	}
	public float getSuperficie() {
		return superficie;
	}
	public String getNombreBarrio() {
	    return nombreBarrio;
	}

	public void setNombreBarrio(String nombreBarrio) {
	    this.nombreBarrio = nombreBarrio;
	}

	public Comuna getComuna() {
	    return comuna;
	}

	public void setComuna(Comuna comuna) {
	    this.comuna = comuna;
	}
	
	
}