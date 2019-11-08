package labparadigmasusach.asm.bo;

import labparadigmasusach.asm.model.Weapon;

/**
 * 
 * @author alberto san martin
 *
 */
public class Player {

	private Integer id;
	private Integer posicion;
	private Integer distMaximaMov;
	private Integer vida;
	private String nombreEquipo;
	private Weapon weapon;

	public Player(Integer id, Integer posicion, Integer distMaximaMov, Integer vida, String nombreEquipo,
			Weapon weapon) {
		super();
		this.id = id;
		this.posicion = posicion;
		this.distMaximaMov = distMaximaMov;
		this.vida = vida;
		this.nombreEquipo = nombreEquipo;
		this.weapon = weapon;
	}

	enum TipoPlayer {
		ALIADO, ENEMIGO
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

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", posicion=" + posicion + ", distMaximaMov=" + distMaximaMov + ", vida=" + vida
				+ ", nombreEquipo=" + nombreEquipo + ", weapon=" + weapon + "]";
	}

}
