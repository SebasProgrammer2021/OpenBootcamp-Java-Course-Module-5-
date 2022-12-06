package poo.ejercicioInterfaces;

public class Main {

    public static void main(String[] args) {
        Coche ferrari = new Coche();
        CocheCRUD cocheCrud = new CocheCRUDImpl();

        cocheCrud.findAll();
        cocheCrud.save(ferrari);
        cocheCrud.delete(ferrari);
    }

}
