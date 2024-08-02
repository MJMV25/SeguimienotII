package ejercicio18;

    public class Computadora {
        public String determinarEstado(boolean emitePitido, boolean discoGira) {
            if (emitePitido && discoGira) {
                return "Póngase en contacto con el técnico de apoyo.";
            } else if (emitePitido && !discoGira) {
                return "Verificar contactos de la unidad.";
            } else if (!emitePitido && !discoGira) {
                return "Traiga la computadora para repararla en la central.";
            } else if (!emitePitido && discoGira) {
                return "Compruebe las conexiones de altavoces.";
            } else {
                return "Estado desconocido.";
            }
        }
    }


