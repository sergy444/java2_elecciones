import java.util.*;
import java.io.*;
public class Elecciones {
 
 public static void main(String[] args) throws IOException {

Scanner sc = new Scanner(System.in);

System.out.print("\nEmpecemos tomando los datos del habitante.");

int edad = 0;
String nombre = null;
String dni = null;


Habitante habitante = new Habitante (edad, nombre, dni);


System.out.print("\nIntroduce la edad del habitante: ");
edad = sc.nextInt();
habitante.setEdad(edad);

System.out.print("\nEl nombre del habitante: ");
nombre = sc.next();
habitante.setNombre(nombre);

System.out.print("\nIngrese el DNI por favor: ");
dni = sc.next();
habitante.setDni(dni);






System.out.print("\nEl nombre del habitante es: " + habitante.getNombre());
System.out.print("\nLa edad de " + habitante.getNombre() + " " + "es: " + habitante.getEdad());
System.out.print("\nEl DNI de " + habitante.getNombre() + " " + "es: " + habitante.getDni());



System.out.print("\nAhora pasamos al inmueble");


String calle = null;
int precio = 0;
char puerta = 0;

Inmueble inmueble = new Inmueble (calle, precio, puerta);





System.out.print("\nIntroduce la calle donde se encuentra el inmueble: ");
calle = sc.next();
inmueble.setCalle(calle);

System.out.print("\nIntroduce el precio del inmueble: ");
precio = sc.nextInt();
inmueble.setPrecio(precio);

System.out.print("\nIntroduce La puerta del inmueble (ej: A, B): ");
puerta = sc.next().charAt(0);
inmueble.setPuerta(puerta);



System.out.print("\nEl precio del inmueble es: " + inmueble.getPrecio() + "€");
System.out.print("\nSe encuentra en la calle: " + inmueble.getCalle());
System.out.print("\nLa puerta del inmueble es: " + inmueble.getPuerta());	

System.out.print("\nEntramos en el espacio público");

String direccion = null;
int mcuad = 0;
String tipoespacio = null;


EspacioPublico espacio = new EspacioPublico (direccion, mcuad, tipoespacio);

System.out.print("\nIntroduce la dirección del espacio: ");
direccion = sc.next();
espacio.setDireccion(direccion);


System.out.print("\nIntroduce los metros cuadrados que mide le espacio: ");
mcuad = sc.nextInt();
espacio.setMcuad(mcuad);

System.out.print("\nEspecifica que tipo de espacio es (ej: parque, oficina, plaza, etc): ");
tipoespacio = sc.next();
espacio.setTipoespacio(tipoespacio);



System.out.print("\nEl espacio está en: " + espacio.getDireccion());
System.out.print("\nEl espacio mide: " + espacio.getMcuad() + " " + "metros cuadrados");
System.out.print("\nEl espacio es: " + espacio.getTipoespacio());


System.out.print("\nHacen falta los datos del ayuntamiento");

String ubicacion = null;
int numsalas = 0;
String alcalde = null;


Ayuntamiento ayuntamiento = new Ayuntamiento (ubicacion, numsalas, alcalde);


System.out.print("\nIngresa la calle donde está el ayuntamiento: ");
ubicacion = sc.next();
ayuntamiento.setUbicacion(ubicacion);

System.out.print("\n¿Cuantas salas tiene? ");
numsalas = sc.nextInt();
ayuntamiento.setNumsalas(numsalas);


System.out.print("\nIntroduce el nombre del alcalde: ");
alcalde = sc.next();
ayuntamiento.setAlcalde(alcalde);



System.out.print("\nEl ayuntamiento se encuentra en: " + ayuntamiento.getUbicacion());
System.out.print("\nTiene " + ayuntamiento.getNumsalas() + " " + "salas");
System.out.print("\nEl alcalde es: " + ayuntamiento.getAlcalde());

System.out.print("\nPor último, metamos los datos del partido político");

String lider = null;
int numafiliados = 0;
String posicionideologica = null;
String nomenclatura = null;

Partido partido = new Partido (lider, numafiliados, posicionideologica, nombre);

System.out.print("\n¿Quién es el líder del partido? ");
lider = sc.next();
partido.setLider(lider);

System.out.print("\nIngresa el número de afiliados: ");
numafiliados = sc.nextInt();
partido.setNumafiliados(numafiliados);

System.out.print("\nIntoduce la posición ideologica del partido: ");
posicionideologica = sc.next();
partido.setPosicionideologica(posicionideologica);

System.out.print("\nEl nombre del partido: ");
nomenclatura=sc.next();
partido.setNomenclatura(nomenclatura);


	


System.out.print("\nEl nombre del partido es: " + partido.getNomenclatura());
System.out.print("\nSu líder o presidente es: " + partido.getLider());
System.out.print("\nTiene " + partido.getNumafiliados() + " " + "afiliados");
System.out.print("\nSu posición ideologica es: " + partido.getPosicionideologica()); 





File listaPartidos = new File("/home/zubiri/Proyectos_java/java2_elecciones/src/listaPartidos.txt");

	FileInputStream fis = new FileInputStream(listaPartidos);
		InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(isr);

	ArrayList<Partido> partidosCompletos = new ArrayList<Partido>();
	String linea;
	linea = br.readLine();

	while(linea!=null){

		String [] variables = linea.split(",");
		
	
		Partido partidos = new Partido(null,0,null,null);
		partidos.setLider(variables[0]);
		int num = Integer.parseInt(variables[1]);
		partidos.setNumafiliados(num);
		partidos.setPosicionideologica(variables[2]);
		partidos.setNomenclatura(variables[3]);
		partidosCompletos.add(partidos);
		linea = br.readLine();
	
}
System.out.println("\nObjetos leídos de archivo de manera satisfactoria\n\n");
System.out.println("\nLista de los partidos: \n\n");

	for(int s=0; s < partidosCompletos.size(); s++){

		System.out.println("Líder: " + (partidosCompletos.get(s)).getLider());
		System.out.println("Número de afiliados: " + (partidosCompletos.get(s)).getNumafiliados());
		System.out.println("Posición ideologica: " + (partidosCompletos.get(s)).getPosicionideologica());
		System.out.println("Nombre del partido: " + (partidosCompletos.get(s)).getNomenclatura());
	System.out.println("--------------------------------------------");


}





	File listaHabitantes = new File("/home/zubiri/Proyectos_java/java2_elecciones/src/ListaHabitantes.txt");

FileInputStream fis2 = new FileInputStream(listaHabitantes);
InputStreamReader isr2 = new InputStreamReader(fis2);
BufferedReader br2 = new BufferedReader(isr2);

ArrayList<Habitante> habitantesFull = new ArrayList<Habitante>();

String lineas;

lineas = br2.readLine();

while(lineas!=null){

String [] spazie = lineas.split(",");
int ed = Integer.parseInt(spazie[0]);
if(ed>=18){
Habitante habitant = new Habitante(0, null,null);

habitant.setEdad(ed);
habitant.setNombre(spazie[1]);
habitant.setDni(spazie[2]);


habitantesFull.add(habitant);
lineas = br2.readLine();
}lineas = br2.readLine();
}
System.out.println("\nObjetos leídos de archivo de manera satisfactoria\n\n");
System.out.println("\nLista de los habitantes mayores de 18 años: \n\n");
for(int v=0; v < habitantesFull.size(); v++){

System.out.println("Nombre: "+(habitantesFull.get(v)).getNombre());
System.out.println("Edad: "+(habitantesFull.get(v)).getEdad());
System.out.println("Dni: "+(habitantesFull.get(v)).getDni());
System.out.println("--------------------------------------------");
}	
}


 
}
