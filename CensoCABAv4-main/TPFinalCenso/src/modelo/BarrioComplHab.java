package modelo;

public final class BarrioComplHab extends Barrio {
	//Variables
	private int cantMonoblocks;
	private boolean tieneConsorcio;
	
	//Métodos
	public float densidadPoblacional() {
		float densidad = (getPersona().size()/cantMonoblocks);
		return densidad;
	}
	
	public boolean indiceCriticidad() {
		if (tieneConsorcio == false) {
			return true;
		}
		else return false;
	}
	//getters y setters
	public int getCantMonoblocks() {
	    return cantMonoblocks;
	}

	public boolean getTieneConsorcio() {
	    return tieneConsorcio;
	}
	public void setCantMonoblocks(int cantMonoblocks) {
	    this.cantMonoblocks = cantMonoblocks;
	}

	public void setTieneConsorcio(boolean tieneConsorcio) {
	    this.tieneConsorcio = tieneConsorcio;
}
}