package poo.conIntefaces;

import poo.sinInterfaces.Empleado;

public class Main {
    static CrudEmpleado crudEmpleado;

    public static void main(String[] args) {

        crudEmpleado.findAll();
        crudEmpleado.save(new Empleado());
    }
}
