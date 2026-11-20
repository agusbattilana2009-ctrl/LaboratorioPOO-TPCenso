package modelo;

import java.time.LocalDate;

public class Persona {
	//Variables
	private String nombreCompleto;
	private String DNI;
	private LocalDate fechaNacimiento;
	private SituacionLaboral situacionLab;
	private Barrio barrio;
	
	//Constructor
	public Persona(String nombreCompleto, String dNI, LocalDate fechaNacimiento, SituacionLaboral situacionLab, Barrio barrio) {
		super();
		this.nombreCompleto = nombreCompleto;
		DNI = dNI;
		this.fechaNacimiento = fechaNacimiento;
		this.situacionLab = situacionLab;
		this.barrio = barrio;
	}
	
	//Getters y setters
	public String getDNI() {
		return DNI;
	}
	public String getnombreCompleto() {
		return nombreCompleto;
	}
	public LocalDate getFechaDeNacimiento() {
		return fechaNacimiento;
	}
	public SituacionLaboral getsituacionLab(){
		return situacionLab;
	}
	public void setNDNI(String DNI) {
		this.DNI = DNI;
	}
	public void setfechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public void setsituacionLab(SituacionLaboral situacionLab) {
		this.situacionLab = situacionLab;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}
	public void setBarrio(Barrio barrio) {
		this.barrio = barrio;
	}
	public Barrio getBarrio() {
		return barrio;
	}


	
	
}
