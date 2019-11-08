package labparadigmasusach.asm.model;

import java.util.List;

import labparadigmasusach.asm.bo.Player;

public class Member {
	
	private List<Player> aliado;
	private List<Player> cpu;
	
	public List<Player> getAliado() {
		return aliado;
	}
	public void setAliado(List<Player> aliado) {
		this.aliado = aliado;
	}
	public List<Player> getCpu() {
		return cpu;
	}
	public void setCpu(List<Player> cpu) {
		this.cpu = cpu;
	}
	
}
