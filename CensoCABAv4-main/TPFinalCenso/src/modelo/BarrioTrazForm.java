package modelo;

public final class BarrioTrazForm extends Barrio {
	//Variables
	private int cantEdificios;
	private float asfaltoEnCalles; 
	
	//Métodos
	public float densidadPoblacional() {
		float densidad = (getPersona().size()/cantEdificios);
		return densidad;
	}
	
	public boolean indiceCriticidad() {
		if (asfaltoEnCalles < 95) {
			return true;
		}
		else return false;
	}

	//getters y setters
	public void setCantEdificios(int cantEdificios) {
	    this.cantEdificios = cantEdificios;
	}
	public void setAsfaltoEnCalles(float asfaltoEnCalles) {
	    this.asfaltoEnCalles = asfaltoEnCalles;
	}
	public int getCantEdificios() {
	    return cantEdificios;
	}
	public float getAsfaltoEnCalles() {
	    return asfaltoEnCalles;
	}
}
