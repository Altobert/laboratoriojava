package labparadigmasusach.asm.model;

public class GameScene {
	
	private String [][] tableroJuego;
	private Integer nivelDificultad;
	private Integer personajesDisponiblesMax=10;
	
	enum EstadoJuego{
		PLAYING,
		VICTORY,
		DEFEAT
	}

	public String[][] getTableroJuego() {
		return tableroJuego;
	}

	public void setTableroJuego(String[][] tableroJuego) {
		this.tableroJuego = tableroJuego;
	}

	public Integer getNivelDificultad() {
		return nivelDificultad;
	}

	public void setNivelDificultad(Integer nivelDificultad) {
		this.nivelDificultad = nivelDificultad;
	}

	public Integer getPersonajesDisponiblesMax() {
		return personajesDisponiblesMax;
	}

	public void setPersonajesDisponiblesMax(Integer personajesDisponiblesMax) {
		this.personajesDisponiblesMax = personajesDisponiblesMax;
	}
	
	public void gameLoop() {
		
	}
	
	public void createScene() {
		
	}
	
	public void moveMember() {
		
	}
	
	public void shoot() {
		
	}
	
	public String stringgiFyScene() {
		return "";
	}
	
	public void printScene() {
		
	}

}
