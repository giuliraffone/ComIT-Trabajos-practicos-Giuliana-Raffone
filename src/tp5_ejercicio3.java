import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class tp5_ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Se conocen los apellidos y las notas de 70 alumnos que rindieron un final. Se
desea obtener e imprimir la nota promedio, y además una lista con los apellidos
y los nombres de los alumnos cuyas notas superan dicho promedio.*/

		Scanner scan = new Scanner (System.in);
		Random rand = new Random();
		
String [] nombreAlumno = new String[] {"Harrison", "Melanie", "Santiago", "Marina Sol", "Magali", "María Aldana",
	"Guido", "Juana Ester", "Carlos Nicolás", "Ramiro", "Rocio Aylen", "Barbara", "Nahuel", "Pablo Nicolás",
	"Pedro", "Nicolás", "Alfredo", "Pablo", "Matías", "Hugo Adrián", "Manuel", "Tomás", "Giuliana",
	"Nicolás", "Lucas", "Franco", "Micaela", "Daniel Leonardo", "Fiorela", "Junior", "Noelia Soledad",
	"Mora"};

int [] notasAlumnos = new int[nombreAlumno.length];
int promedio = generarPromedio(rand, notasAlumnos);

System.out.println("El promedio general es: " + promedio);
imprimirMensaje(nombreAlumno, notasAlumnos, promedio);
	}

	private static void imprimirMensaje(String[] nombreAlumno, int[] notasAlumnos, int promedio) {
		for (int i = 0; i < nombreAlumno.length; i++) {
		String nombre = nombreAlumno[i];
		int nota = notasAlumnos[i];
		if (nota>promedio)System.out.println(nombre + ": " + nota);
		}
	}


	private static int generarPromedio(Random rand, int[] notasAlumnos) {
		
		int sumaNotas = 0;
		for (int i = 0; i < notasAlumnos.length; i++) {
			int nota = rand.nextInt(10);
			notasAlumnos[i] = nota;
			sumaNotas = nota + sumaNotas;}
		return sumaNotas / notasAlumnos.length;
		
		
		
		
	}

}
