package ejercicio15;

public class Gimnasio {
    private int costo15Dias;
    private int costo30Dias;
    private int costo3Meses;

    public Gimnasio() {
        // Inicializar costos según la tabla proporcionada
        this.costo15Dias = 18000;
        this.costo30Dias = 35000;
        this.costo3Meses = 86000;
    }

    public int calcularCosto(String tipoSuscripcion) {
        switch (tipoSuscripcion.toLowerCase()) {
            case "15 días":
                return costo15Dias;
            case "30 días":
                return costo30Dias;
            case "3 meses":
                return costo3Meses;
            default:
                throw new IllegalArgumentException("Tipo de suscripción no válido. Debe ser '15 días', '30 días' o '3 meses'.");
        }
    }
}

