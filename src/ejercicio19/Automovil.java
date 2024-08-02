package ejercicio19;

import java.util.HashSet;
import java.util.Set;

public class Automovil {
    private final Set<Integer> modelosDefectuosos;

    public Automovil() {
        modelosDefectuosos = new HashSet<>();
        modelosDefectuosos.add(119);
        modelosDefectuosos.add(179);
        modelosDefectuosos.add(189);
        modelosDefectuosos.add(190);
        modelosDefectuosos.add(191);
        modelosDefectuosos.add(192);
        modelosDefectuosos.add(193);
        modelosDefectuosos.add(194);
        modelosDefectuosos.add(195);
        modelosDefectuosos.add(221);
        modelosDefectuosos.add(780);
    }

    public boolean esModeloDefectuoso(int modelo) {
        return modelosDefectuosos.contains(modelo);
    }
}
