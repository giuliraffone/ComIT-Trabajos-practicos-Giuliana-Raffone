import java.util.Scanner;

public class tp2_ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner (System.in);
		
int edad = 0, exp=0, remu = 0;

System.out.println("\t\t\t\t✧･ﾟ: *✧･ﾟ:* Solicitud de ingreso*:･ﾟ✧*:･ﾟ✧\n");
System.out.println("\nIngrese su nombre y apellido: ");
String nombre = scan.nextLine();
System.out.println("\n-Ingrese edad: ");
edad = scan.nextInt();
if (edad<18 || edad>35) System.err.println("Lo sentimos, esta fuera del rango de edad");
else System.out.println("\n-Ingrese cantidad de años de experiencia en el rubro: ");
exp = scan.nextInt();
System.out.println("\n-Ingrese remuneracion esperada: ");
remu = scan.nextInt();

if(edad >= 18 || edad <= 35) {
	if(edad > 32){
		if(exp>= 6) {
			System.out.println("\n" + nombre + ", su solicitud ha sido aceptada");
		}else if(exp> 3 && exp<6) {
			System.out.println("\n" + nombre + ", su solicitud ha sido aceptada de forma condicional");
		}else {
			System.out.println("\n" + nombre + ", su solicitud ha sido rechazada");
		}
	}else if((exp< 3)) {
			if(remu > 50000) {
				System.out.println("\n" + nombre + ", su solicitud ha sido rechazada");
			}else {
				System.out.println("\n" + nombre + ", su solicitud ha sido aceptada");
			}
	}else {
		System.out.println("\n" + nombre + ", su solicitud ha sido aceptada");
	}
}else {
	System.out.println("\n" + nombre + ", su solicitud ha sido rechazada");
}

}}



	

	
	
	
	
	






	


