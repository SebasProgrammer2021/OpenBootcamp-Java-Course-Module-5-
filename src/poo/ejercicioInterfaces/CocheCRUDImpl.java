package poo.ejercicioInterfaces;

import java.util.List;

public class CocheCRUDImpl implements CocheCRUD {

    /**
     * @param coche
     */
    @Override
    public void save(Coche coche) {
        System.out.println("save");
    }

    /**
     * @return
     */
    @Override
    public List<Coche> findAll() {
        System.out.println("List");
        return null;
    }

    /**
     * @param coche
     */
    @Override
    public void delete(Coche coche) {
        System.out.println("delete");

    }
}
