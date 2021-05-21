import java.text.DecimalFormat;
import java.time.format.DecimalStyle;
import java.util.Scanner;

public class tp3_ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ejercicio 3
		//Se ingresa la cantidad de patentes de automotor que serán procesadas en un
		//registro. Cada número de patente viene acompañada del valor del modelo del
		//año correspondiente. Se desea calcular el impuesto que debe pagar cada
		//dueño de acuerdo a la siguiente tabla:
		//si tiene nro de patente menor de 1000000, paga el 5% del valor del modelo.
		//si la patente está entre 1000000 y 2000000 se paga el 10% del valor del
		//modelo.
		//en cualquier otro caso, abona el 15% del valor del auto.
		//Imprimir el impuesto abonado por cada dueño, el monto total recaudado con
		//dicho impuesto por el Registro del Automotor, y cual fue el porcentaje de autos
		//cuya numeración fue superior a 1300000
		Scanner scan = new Scanner (System.in);
		
		
		
		
		int cantPatente,patente = 0,cont = 0;
		double impuesto=0, valorAuto, totalImpuesto = 0, porcentajePatente;
		String listaPatentes = "";
		
		
		System.out.println("-Cantidad de patentes a procesar: ");
		cantPatente = scan.nextInt();
		scan.nextLine();
		
		for (int i = 0; i <cantPatente; i++) {
		System.out.println("-Ingrese el numero de patente: ");
		patente = scan.nextInt();
		System.out.println("-Ingrese valor del automovil: ");
		valorAuto = scan.nextDouble();
		
		if (patente<1000000) { impuesto = valorAuto * 0.05;}
		else if (patente> 1000000 && patente<2000000) { impuesto = valorAuto * 0.1;}
		else impuesto = valorAuto * 0.15;
		if (patente>1300000)cont++;
		
		totalImpuesto = (totalImpuesto+=impuesto);
	
		System.out.println(listaPatentes+=("Dueño del automovil patente " + patente + ", el impuesto a abonar es de: " + impuesto + "\n"));	
		System.out.println("El total recaudado fue de: " + totalImpuesto);}
		
	porcentajePatente = (cont*100)/cantPatente;

	
	
	
	System.out.println("Porcentaje de autos cuya numeracion es mayor a 1300000: "+ porcentajePatente + "%");
	
	}}



	






	

