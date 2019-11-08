package labparadigmasusach.asm.bo;

public class Arma {
	
	private String  nombreArma;
	private Integer alcanceMaximo;
	private Integer danoQueProvoca;
	private String  tipoTrajectoriaDescripcion;
	private String  codTrayectoria;
	
	public String getNombreArma() {
		return nombreArma;
	}
	public void setNombreArma(String nombreArma) {
		this.nombreArma = nombreArma;
	}
	public Integer getAlcanceMaximo() {
		return alcanceMaximo;
	}
	public void setAlcanceMaximo(Integer alcanceMaximo) {
		this.alcanceMaximo = alcanceMaximo;
	}
	public Integer getDanoQueProvoca() {
		return danoQueProvoca;
	}
	public void setDanoQueProvoca(Integer danoQueProvoca) {
		this.danoQueProvoca = danoQueProvoca;
	}
	public String getTipoTrajectoriaDescripcion() {
		return tipoTrajectoriaDescripcion;
	}
	public void setTipoTrajectoriaDescripcion(String tipoTrajectoriaDescripcion) {
		this.tipoTrajectoriaDescripcion = tipoTrajectoriaDescripcion;
	}
	public String getCodTrayectoria() {
		return codTrayectoria;
	}
	public void setCodTrayectoria(String codTrayectoria) {
		this.codTrayectoria = codTrayectoria;
	}
	
}
