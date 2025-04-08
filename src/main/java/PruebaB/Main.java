package PruebaB;

import java.util.Scanner;

public class Main {
	  public static void main(String[] args) {
	        // TODO Auto-generated method stub

	        // introduzca la base imponible
	        Scanner peter = new Scanner(System.in);
	        System.out.println("Introduzca la base imponible");
	        double base = peter.nextDouble();
	        double total = 0;

	        // introduzca el tipo de IVA (general, reducido o superreducido), 21%, 10% y 4%
	        // respectivamente
	        System.out.println("Introduzca el tipo de IVA (general, reducido o superreducido)");
	        String tipoIva = peter.next();

	        // Introduzca el codigo promocional (nopro, mitad, meno5, o 5porc), sin
	        // promocion, precio a la mitad, se descuentan
	        // 5 euros o se descuenta el 5%
	        System.out.println("Introduzca el codigo promocional (nopro, mitad, meno5, o 5porc)");
	        String codigoProm = peter.next();

	        // Calcular IVA y precio final
	        double iva = Iva.calcularIVA(base, tipoIva);
	        double precioConIVA = base + iva;
	        double precioFinal = Iva.aplicarPromocion(precioConIVA, codigoProm);
	  }
}
