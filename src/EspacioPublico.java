public class EspacioPublico{

	private String direccion;
	private int mcuad;
	private String tipoespacio;

	public EspacioPublico(String direccion, int mcuad, String tipoespacio){
		this.direccion=direccion;
		this.mcuad=mcuad;
		this.tipoespacio=tipoespacio;
		
	}

	public String getDireccion() {

		return this.direccion;
	}	

	public void setDireccion(String direccion) {

		this.direccion = direccion;
	}

	public int getMcuad() {

		return this.mcuad;
	}	

	public void setMcuad(int mcuad) {

		this.mcuad = mcuad;
	}

	

public String getTipoespacio() {

		return this.tipoespacio;
	}	

	public void setTipoespacio(String tipoespacio) {

		this.tipoespacio = tipoespacio;
	}
}
