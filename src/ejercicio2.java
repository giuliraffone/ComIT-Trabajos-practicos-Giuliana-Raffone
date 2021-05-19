import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    Scanner scan = new Scanner (System.in);

		    double subtotal = 0.0;
		    double iva;
		    String nombreCliente;
		    String direCliente;
		    String razonSocial;
		    String listaProductos = "";

		    //Entra el cliente
		    nombreCliente = preguntarNombre(scan);
		    razonSocial = preguntarRazonSocial(scan);
		    direCliente = preguntarDireccion(scan);

		    //¿Va a comprar?
		    while ("si".equals(preguntarMasProductos(scan))){
		      String descripcionProducto;
		      int cantProducto;
		      double valorProducto;

		      descripcionProducto = preguntarProducto(scan);
		      cantProducto = preguntarCantidad(scan);
		      valorProducto = preguntarValorUnitario(scan);
		      subtotal = subtotal + ValorTotal(cantProducto,valorProducto);
		      listaProductos += ProductoString(cantProducto,descripcionProducto,valorProducto,ValorTotal(cantProducto,valorProducto));
		      scan.nextLine();
		    }
		    iva = TotalIva(subtotal);
		    imprimirFactura(subtotal, iva, nombreCliente, direCliente, razonSocial, listaProductos);

		  }

		  private static double preguntarValorUnitario(Scanner scan) {
		    double valorProducto;
		    System.out.println("Ingrese el valor unitario");
		    valorProducto = scan.nextDouble();
		    return valorProducto;
		  }

		  private static int preguntarCantidad(Scanner scan) {
		    int cantProducto;
		    System.out.println("Ingrese la cantidad");
		    cantProducto = scan.nextInt();
		    return cantProducto;
		  }

		  private static String preguntarProducto(Scanner scan) {
		    String descripcionProducto;
		    System.out.println("Ingrese el producto");
		    descripcionProducto = scan.nextLine();
		    return descripcionProducto;
		  }

		  private static String preguntarDireccion(Scanner scan) {
		    String direCliente;
		    System.out.println("Ingrese direccion del cliente");
		    direCliente = scan.nextLine();
		    return direCliente;
		  }

		  private static String preguntarRazonSocial(Scanner scan) {
		    String razonSocial;
		    System.out.println("Ingrese razon social");
		    razonSocial = scan.nextLine();
		    return razonSocial;
		  }

		  private static String preguntarNombre(Scanner scan) {
		    String nombreCliente;
		    System.out.println("Ingrese el nombre del cliente");
		    nombreCliente = scan.nextLine();
		    return nombreCliente;
		  }

		  private static void imprimirFactura(double subtotal, double iva, String nombreCliente, String direCliente, String razonSocial, String listaProductos) {
		    System.out.println();
		    System.out.println("*************************************************************************************");
		    System.out.println("Fecha: " + Fecha());
		    System.out.println("Nombre: " + nombreCliente);
		    System.out.println("Direccion: " + direCliente);
		    System.out.println("Razon social: " + razonSocial);
		    System.out.println("*************************************************************************************");
		    System.out.println("Cant. | Descripcion | P. unit | P. total");
		    System.out.println(listaProductos);
		    System.out.println("IVA: $" + iva);
		    System.out.println("Subtotal (sin IVA): $" + subtotal);
		    System.out.println("Total:$" + (subtotal + iva));
		  }

		  private static String Fecha() {
		    Date fecha = new Date();
		    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		    return sdf.format(fecha);
		  }

		  private static String ProductoString(int cant, String descripcion, double valor, double valorTotal) {
		    return cant + "     | " + descripcion + "      |  $" + valor + "      |$" + valorTotal + Divisor();
		  }

		  private static String preguntarMasProductos(Scanner scan) {
		    System.out.println("¿Quiere agregar productos? si/no");
		    String continuar = scan.nextLine();
		    return continuar;
		  }

		  private static String Divisor() {
		    return "\n-------------------------------------------------------------------------------------\n";
		  }

		  private static double ValorTotal(int cant, double valor) {
		    return valor * cant;
		  }

		  private static double TotalIva(double subtotal){
		    return subtotal * 0.21;
		  }

}
		
	
	
		
		
		

	




