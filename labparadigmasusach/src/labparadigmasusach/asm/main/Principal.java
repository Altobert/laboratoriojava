package labparadigmasusach.asm.main;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menuJuego();
	}
	
	public static void menuJuego() {
		System.out.println("|*********Menu Juego Angry Birds-SpaceInvader**********");
		System.out.println("|1) Elegir cantidad de Jugadores");
		System.out.println("|2) Elegir nivel de dificultad");
		System.out.println("|3) Elegir Tipos de Armas (Maximo 2)");
		System.out.println("|4) Jugar!");
		System.out.println("|5) Ayuda");
		System.out.println(" Selecciona tu opcion");
	}
	
	public void salidaEstandar(String str) {
		System.out.println(str);
	}
	
}
