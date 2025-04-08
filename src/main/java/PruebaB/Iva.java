package PruebaB;

public class Iva {
	public static double calcularIVA(double base, String tipoIva) {
        double porcentajeIVA = 0.0;
        switch (tipoIva.toLowerCase()) {
        case "general":
            porcentajeIVA = 0.21;
            break;
        case "reducido":
            porcentajeIVA = 0.10;
            break;
        case "superreducido":
            porcentajeIVA = 0.04;
            break;
        default:
            porcentajeIVA = 0.0; // Tipo de IVA incorrecto
            break;
        }
        return base * porcentajeIVA;
    }

    public static double aplicarPromocion(double precioConIVA, String codigoProm) {
        double descuento = 0.0;
        switch (codigoProm.toLowerCase()) {
        case "nopro":
            descuento = 0.0;
            break;
        case "mitad":
            descuento = precioConIVA / 2;
            break;
        case "meno5":
            descuento = 5.0;
            break;
        case "5porc":
            descuento = precioConIVA * 0.05;
            break;
        default:
            descuento = 0.0; // Código promocional incorrecto
            break;
        }
        return precioConIVA - descuento;
    }
}
