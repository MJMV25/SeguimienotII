package ejercicio20;

public class Celumovil {
    private String operador;
    private int minutosInternacionales;
    private int cargoFijo;
    private int valorMinutoInternacional;
    private int valorPaqueteDatos;

    public Celumovil(String operador, int minutosInternacionales) {
        this.operador = operador.toLowerCase();
        this.minutosInternacionales = minutosInternacionales;
        setTarifas();
    }

    private void setTarifas() {
        switch (operador) {
            case "tigo":
                this.cargoFijo = 45000;
                this.valorMinutoInternacional = 200;
                this.valorPaqueteDatos = 12000;
                break;
            case "claro":
                this.cargoFijo = 30000;
                this.valorMinutoInternacional = 100;
                this.valorPaqueteDatos = 18000;
                break;
            case "movistar":
                this.cargoFijo = 40000;
                this.valorMinutoInternacional = 250;
                this.valorPaqueteDatos = 8000;
                break;
            default:
                throw new IllegalArgumentException("Operador no válido.");
        }
    }

    public int calcularCosto() {
        int costoMinutosInternacionales = valorMinutoInternacional * minutosInternacionales;
        return cargoFijo + costoMinutosInternacionales + valorPaqueteDatos;
    }

    public String getOperador() {
        return operador;
    }

    public int getMinutosInternacionales() {
        return minutosInternacionales;
    }
}
