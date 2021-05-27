import java.util.Scanner;

public class tp4_ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		final String opcion1 = "CIRCULO";
		final String opcion2 = "CUADRADO";
		final String opcion3 = "TRIANGULO";
		final String opcion4 = "RECTANGULO";
		final String opcion5 = "TRAPECIO";
		final String opcion6 = "REPETIR";
		final String opcion7 = "SALIR";
		
		
	
		System.out.println("\t\t\t\tCALCULO DE AREA");
		int opcion = menu(scan, opcion1, opcion2, opcion3, opcion4, opcion5);
		
		
		
	switch(opcion) {
	 case 1: System.out.println("El area del circulo es: " + areaCirculo(scan)+ "cm2");
	 break;
	 case 2: System.out.println("El area del cuadrado es:" + areaCuadrado(scan)+"cm2");
	 break;
	 case 3: System.out.println("El area del triangulo es: " + areaTriangulo(scan) + "cm2");
	 break;
	 case 4: System.out.println("El area del rectangulo es: "+ areaRectangulo(scan)+"cm2");
	 break;
	 case 5: System.out.println("El area del trapecio es: "+ areaTrapecio(scan)+"cm2");
	 break;
	 case 6: System.out.println(menu(scan, opcion1, opcion2, opcion3, opcion4, opcion5));
	 case 7: System.out.println("Terminado");
	 break;
	 default: System.out.println("Opcion invalida");}
	}



	private static int menu(Scanner scan, final String opcion1, final String opcion2, final String opcion3,
			final String opcion4, final String opcion5) {
		System.out.println("\n\nINGRESE UNA OPCION: " + "\n1)" + opcion1 + "\n2)" + opcion2 + "\n3)" + opcion3 + "\n4)" + opcion4 + "\n5)"+ opcion5);
		int opcion = scan.nextInt();
		return opcion;
	}



	private static double areaTrapecio(Scanner scan) {
		System.out.println("Ingrese base menor en centimetros");
		double baseMenor = scan.nextDouble();
		System.out.println("Ingrese base mayor en centimetros");
		double baseMayor = scan.nextDouble();
		System.out.println("Ingrese altura en centimetros");
		double altura = scan.nextDouble();
		double area = ((baseMayor*baseMenor)/altura)*4;
		return area;
	}



	private static double areaRectangulo(Scanner scan) {
		System.out.println("Ingrese base en centimetros");
		double base = scan.nextDouble();
		System.out.println("Ingrese altura en centimetros");
		double altura = scan.nextDouble();
		double area = (base * altura);
		return area;
	}



	private static double areaTriangulo(Scanner scan) {
		System.out.println("Ingrese base en centimetros");
		double base = scan.nextDouble();
		System.out.println("Ingrese altura en centimetros");
		double altura = scan.nextDouble();
		double area = (base * altura)/2;
		return area;
	}



	private static double areaCuadrado(Scanner scan) {
		System.out.println("Ingrese lado en centimetros");
		double lado = scan.nextDouble();
		double area = (Math.pow(lado, 2));
		return area;
	}



	private static double areaCirculo(Scanner scan) {
		System.out.println("Ingrese radio en centimetros");
		double radio = scan.nextDouble();
		double pi = 3.14;
		double area = (pi*(Math.pow(radio, 2)));
		return area;
	}



	
	}

