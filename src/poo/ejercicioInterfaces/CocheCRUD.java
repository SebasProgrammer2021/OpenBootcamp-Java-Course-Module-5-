package poo.ejercicioInterfaces;

import poo.sinInterfaces.Empleado;

import java.util.List;

public interface CocheCRUD {
    void save(Coche coche);

    List<Coche> findAll();

    void delete(Coche coche);
}
