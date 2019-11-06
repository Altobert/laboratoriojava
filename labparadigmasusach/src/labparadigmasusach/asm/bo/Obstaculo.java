package labparadigmasusach.asm.bo;

public class Obstaculo {
	
	private Integer posicion;
	private Integer tamano;
	
	public Obstaculo(Integer posicion, Integer tamano) {
		super();
		this.posicion = posicion;
		this.tamano = tamano;
	}
	public Integer getPosicion() {
		return posicion;
	}
	public void setPosicion(Integer posicion) {
		this.posicion = posicion;
	}
	public Integer getTamano() {
		return tamano;
	}
	public void setTamano(Integer tamano) {
		this.tamano = tamano;
	}
	@Override
	public String toString() {
		return "Obstaculo [posicion=" + posicion + ", tamano=" + tamano + "]";
	}

}
