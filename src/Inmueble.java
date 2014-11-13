public class Inmueble{

	private String calle;
	private int precio;
	private char puerta;

	public Inmueble(String calle, int precio, char puerta){
		this.calle=calle;
		this.precio=precio;
		this.puerta=puerta;
		
	}

	public String getCalle() {

		return this.calle;
	}	

	public void setCalle(String calle) {

		this.calle = calle;
	}

	public int getPrecio() {

		return this.precio;
	}	

	public void setPrecio(int precio) {

		this.precio = precio;
	}

	

public char getPuerta() {

		return puerta;
	}	

	public void setPuerta(char puerta) {

		this.puerta = puerta;
	}
}
