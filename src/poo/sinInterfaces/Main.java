package poo.sinInterfaces;

import java.util.List;

/**
 * las sinInterfaces permiten que un codigo o una clase no este tan acoplada a otra
 * que no haya una alta dependencia de una clase con otra
 * <p>
 * una interfaz es un contrato que define una serie de metodos de que es lo que hay
 * que hacer, pero no los hace, hay otra clase que hace implementación y los
 * realiza
 *
 * proporcina una implementación unica de hacer la cosas.
 */
public class Main {
    public static void main(String[] args) {
        EmpleadoCRUD crudEmpleado = new EmpleadoCRUD();
        Empleado sebastian = new Empleado("Sebastian", 30, 6000000, true);
        Empleado Daniela = new Empleado("Daniela", 30, 6000000, true);
        Empleado Stefany = new Empleado("Stefany", 30, 6000000, true);

        System.out.println("sebastian = " + sebastian);

//        guardar empleados
        crudEmpleado.guardar(sebastian);
        crudEmpleado.guardar(Daniela);
        crudEmpleado.guardar(Stefany);

//consultar empleados
        List<Empleado> empleados = crudEmpleado.getAll();
        System.out.println("empleados = " + empleados);

    }
}
