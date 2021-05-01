import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner scan = new Scanner (System.in);
		
		
int cant1;
int cant2;

double valor1; 
double valor2;
double valorTotal1;
double valorTotal2; 
double subtotal;
double valorIVA;
double iva;

String descripcion1;
String descripcion2;
String nombreCliente;
String direCliente; 
String razonSocial;

System.out.println("Ingrese el nombre del cliente");
nombreCliente = scan.nextLine();
System.out.println("Ingrese razon social");
razonSocial = scan.nextLine();
System.out.println("Ingrese direccion del cliente");
direCliente = scan.nextLine();

System.out.println("Ingrese el producto");
descripcion1 = scan.nextLine();
System.out.println("Ingrese la cantidad");
cant1 = scan.nextInt();
System.out.println("Ingrese el valor unitario");
valor1 = scan.nextDouble();
System.out.println("Ingrese el producto");
descripcion2 = scan.next();


System.out.println("Ingrese la cantidad");
cant2 = scan.nextInt();
System.out.println("Ingrese el valor unitario");
valor2 = scan.nextDouble();
		
		valorTotal1 = valor1 * cant1;
		valorTotal2 = valor2 * cant2;
		subtotal = valorTotal1 + valorTotal2;
		iva = subtotal * 0.21;
		
	
		System.out.println("                                                                   ");
		System.out.println("*************************************************************************************");
		Date fecha = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		System.out.println("Fecha: " + sdf.format(fecha));
		System.out.println("Nombre: " + nombreCliente);
		System.out.println("Direccion: " + direCliente);
		System.out.println("*************************************************************************************");
		System.out.println("Cant. | Descripcion | P. unit | P. total");
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println(cant1 + "     | " + descripcion1 + "      |  $" + valor1 + "      |$" + valorTotal1);
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println(cant2 + "     | " + descripcion2 + "      |  $" + valor2 + "      |$" + valorTotal2);
		System.out.println("-------------------------------------------------------------------------------------");
	   System.out.println("IVA: $" + iva);
	   System.out.println("Subtotal (sin IVA): $" + subtotal);
	   System.out.println("Total:$" + (subtotal + iva));
	
		
		
		

	}

}
