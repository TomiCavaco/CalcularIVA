package PruebaB;

public class Iva {
    public static double calcularIVA(double importeInicial, String categoriaIVA) {
        double tasaIVA = 0.0;
        switch (categoriaIVA.toLowerCase()) {
            case "general":
                tasaIVA = 0.21;
                break;
            case "reducido":
                tasaIVA = 0.10;
                break;
            case "superreducido":
                tasaIVA = 0.04;
                break;
            default:
                tasaIVA = 0.0; 
                break;
        }
        return importeInicial * tasaIVA;
    }

    public static double aplicarPromocion(double importeConIVA, String descuentoAplicado) {
        double rebaja = 0.0;
        switch (descuentoAplicado.toLowerCase()) {
            case "nopro":
                rebaja = 0.0;
                break;
            case "mitad":
                rebaja = importeConIVA / 2;
                break;
            case "meno5":
                rebaja = 5.0;
                break;
            case "5porc":
                rebaja = importeConIVA * 0.05;
                break;
            default:
                rebaja = 0.0; 
                break;
        }
        return importeConIVA - rebaja;
    }
}
