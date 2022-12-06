package poo.sinInterfaces;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoCRUD {

    //lsita de empleados
    List<Empleado> empleados = new ArrayList<>();

    //guardar empleado
    public void guardar(Empleado empleado) {
        empleados.add(empleado); // guardar un empleado
    }

    public List<Empleado> getAll() {
        return empleados;
    }
}
