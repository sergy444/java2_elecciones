public class Ayuntamiento{

	private String ubicacion;
	private int numsalas;
	private String alcalde;
	
	

	public Ayuntamiento(String ubicacion, int numsalas, String alcalde){
		this.ubicacion=ubicacion;
		this.numsalas=numsalas;
		this.alcalde=alcalde;
	}

	public String getUbicacion() {

		return this.ubicacion;
	}	

	public void setUbicacion(String ubicacion) {

		this.ubicacion = ubicacion;
	}

	public int getNumsalas() {

		return this.numsalas;
	}	

	public void setNumsalas(int numsalas) {

		this.numsalas = numsalas;
	}



	public String getAlcalde() {

		return this.alcalde;
	}	

	public void setAlcalde(String alcalde) {

		this.alcalde = alcalde;
	}
}
