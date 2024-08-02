package ejercicio17;

public class Main {

    public class Fotocopiadora {
        public int calcularCosto(int cantidadCopias) {
            if (cantidadCopias >= 0 && cantidadCopias <= 499) {
                return cantidadCopias * 120;
            } else if (cantidadCopias >= 500 && cantidadCopias <= 749) {
                return cantidadCopias * 100;
            } else if (cantidadCopias >= 750 && cantidadCopias <= 999) {
                return cantidadCopias * 80;
            } else if (cantidadCopias >= 1000) {
                return cantidadCopias * 50;
            } else {
                throw new IllegalArgumentException("La cantidad de copias no puede ser negativa.");
            }
        }
    }

}
