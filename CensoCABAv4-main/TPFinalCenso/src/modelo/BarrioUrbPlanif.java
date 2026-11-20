package modelo;

public final class BarrioUrbPlanif extends Barrio {
	//Variables
	private boolean tieneConexionFormal;
	private float numLey;
	
	//Métodos
	public float densidadPoblacional() {
		float densidad = (getPersona().size()/getSuperficie());
		return densidad;
	}
	
	public boolean indiceCriticidad() {
		if (tieneConexionFormal == false) {
			return true;
		}
		else return false;
	}

	//getters y setters
	public boolean getTieneConexionFormal() {
	    return tieneConexionFormal;
	}

	public float getNumLey() {
	    return numLey;
	}
	public void setTieneConexionFormal(boolean tieneConexionFormal) {
	    this.tieneConexionFormal = tieneConexionFormal;
	}

	public void setNumLey(float numLey) {
	    this.numLey = numLey;
	}
}
