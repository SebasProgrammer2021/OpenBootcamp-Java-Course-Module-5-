package poo.conIntefaces;

import poo.sinInterfaces.Empleado;

import java.util.List;

public class EmpleadoCrudMySQL implements CrudEmpleado{

    /**
     * @param empleado
     */
    @Override
    public void save(Empleado empleado) {

    }

    /**
     * @return
     */
    @Override
    public List<Empleado> findAll() {
        return null;
    }

    /**
     * @param empleado
     */
    @Override
    public void delete(Empleado empleado) {

    }
}
