package PruebaB;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese el importe sin impuestos:");
        double importeInicial = lector.nextDouble();
        double resultadoFinal = 0;

        System.out.println("Especifique la categoría de IVA (general, reducido o superreducido):");
        String categoriaIVA = lector.next();

        System.out.println("Indique el tipo de descuento (nopro, mitad, meno5 o 5porc):");
        String descuentoAplicado = lector.next();

        // Calcular IVA y precio final
        double valorIVA = Iva.calcularIVA(importeInicial, categoriaIVA);
        double importeConIVA = importeInicial + valorIVA;
        double importeFinal = Iva.aplicarPromocion(importeConIVA, descuentoAplicado);

        lector.close();
    }
}