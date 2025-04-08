package PruebaB;

import java.util.Scanner;

public class Main {
	  public static void main(String[] args) {
	        // TODO Auto-generated method stub

	 
	        Scanner peter = new Scanner(System.in);
	        System.out.println("Introduzca la base imponible");
	        double base = peter.nextDouble();
	        double total = 0;

	        
	        System.out.println("Introduzca el tipo de IVA (general, reducido o superreducido)");
	        String tipoIva = peter.next();

	        
	        System.out.println("Introduzca el codigo promocional (nopro, mitad, meno5, o 5porc)");
	        String codigoProm = peter.next();

	        
	        double iva = Iva.calcularIVA(base, tipoIva);
	        double precioConIVA = base + iva;
	        double precioFinal = Iva.aplicarPromocion(precioConIVA, codigoProm);
	  }
}
