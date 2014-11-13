public class Habitante{
	private int edad;
	private String nombre;
	private String dni;
	

	public Habitante(int edad, String nombre, String dni){
		this.edad=edad;
		this.nombre=nombre;
		this.dni=dni;
		
	}

	public int getEdad() {

		return this.edad;
	}	

	public void setEdad(int edad) {

		this.edad = edad;
	}

	public String getNombre() {

		return this.nombre;
	}	

	public void setNombre(String nombre) {

		this.nombre = nombre;
	}

public String getDni() {

		return this.dni;
	}	

	public void setDni(String dni) {

		this.dni = dni;
	}



public boolean votar(){

if (this.edad>=18) {

	return true;
}
	else{

		return false;
	}
}

}

