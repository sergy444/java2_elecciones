public class Partido{

	private String lider;
	private int numafiliados;
	private String posicionideologica;
	private String nomenclatura;
	
	

	public Partido(String lider, int numafiliados, String posicionideologica, String nomenclatura){
		this.lider=lider;
		this.numafiliados=numafiliados;
		this.posicionideologica=posicionideologica;
		this.nomenclatura=nomenclatura;
		
	}

	public String getLider() {

		return this.lider;
	}	

	public void setLider(String lider) {

		this.lider = lider;
	}
	

	public int getNumafiliados() {

		return this.numafiliados;
	}	

	public void setNumafiliados(int numafiliados) {

		this.numafiliados = numafiliados;
	}




	public String getPosicionideologica() {

		return this.posicionideologica;
	}	

	public void setPosicionideologica(String posicionideologica) {

		this.posicionideologica = posicionideologica;
	}

	public String getNomenclatura() {

		return this.nomenclatura;
	}	

	public void setNomenclatura(String nomenclatura) {

		this.nomenclatura = nomenclatura;
	}
}
