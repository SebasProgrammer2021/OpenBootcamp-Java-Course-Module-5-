package poo.sinInterfaces;

public class Empleado {

    //atributos
    String name;
    int age;
    double salary;
    boolean alta;

//    constructor

    public Empleado(String name, int age, double salary, boolean alta) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.alta = alta;
    }

    public Empleado() {

    }

//    metodos

    @Override
    public String toString() {
        return "Empleado{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", alta=" + alta +
                '}';
    }
}
