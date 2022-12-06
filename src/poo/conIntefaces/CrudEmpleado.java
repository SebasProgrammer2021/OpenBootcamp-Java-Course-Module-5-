package poo.conIntefaces;

import poo.sinInterfaces.Empleado;

import java.util.List;

/**
 * solo se declaran los metoso, no se implementan
 * <p>
 * Activa un contrato, dice lo quehay que hacer pero no lo hace.
 */
public interface CrudEmpleado {
    void save(Empleado empleado);

    List<Empleado> findAll();

    void delete(Empleado empleado);

}
