package labparadigmasusach.asm.bo;

public class Enemigo {
	
	private Integer id;
	private Integer posicion;
	private Integer distMaximaMov;
	private Integer vida;
	private String  nombreEquipo;
	
	public Enemigo(Integer id, Integer posicion, Integer distMaximaMov, Integer vida, String nombreEquipo) {
		super();
		this.id = id;
		this.posicion = posicion;
		this.distMaximaMov = distMaximaMov;
		this.vida = vida;
		this.nombreEquipo = nombreEquipo;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getPosicion() {
		return posicion;
	}
	public void setPosicion(Integer posicion) {
		this.posicion = posicion;
	}
	public Integer getDistMaximaMov() {
		return distMaximaMov;
	}
	public void setDistMaximaMov(Integer distMaximaMov) {
		this.distMaximaMov = distMaximaMov;
	}
	public Integer getVida() {
		return vida;
	}
	public void setVida(Integer vida) {
		this.vida = vida;
	}
	public String getNombreEquipo() {
		return nombreEquipo;
	}
	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}
	@Override
	public String toString() {
		return "Enemigo [id=" + id + ", posicion=" + posicion + ", distMaximaMov=" + distMaximaMov + ", vida=" + vida
				+ ", nombreEquipo=" + nombreEquipo + "]";
	}
	
}
