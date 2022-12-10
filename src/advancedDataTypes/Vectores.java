package advancedDataTypes;

import java.util.Vector;

public class Vectores {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector();

//        para llnarlo es con add
        vector.add(1);
        vector.add(2);
        vector.add(3);
        System.out.println("vector = " + vector);

//        para eliminar elementos por indice
        vector.remove(2);
        System.out.println("vector = " + vector);

// tienen tamaño y capacidad
        System.out.println("vector.size() = " + vector.size());

//        se pueden meter hasta 10 elementos, por debajo se crea un
//        array, los vectores son dinamicos y se van aumentadndo de 10 en 10
//        automaitcamente. se pueden llamar arrays dinamicos
        System.out.println("vector.capacity() = " + vector.capacity());


//        seteando la capacidad del vector,
        /*
        se le puede definir tambien la capacidad del vector a incrementar
         */
        Vector<Integer> vectorGrande = new Vector(1, 5);
        vectorGrande.add(2);
        vectorGrande.add(4);
        System.out.println("vectorGrande = " + vectorGrande);
        System.out.println("vectorGrande.capacity() = " + vectorGrande.capacity());

        /*
        comparación de vetores
         */
        System.out.println(vector.equals(vectorGrande)?"son iguales":"no son iguales");

        /*
        atravesar el vector o recorrerlo
         */
        for(int numero : vector){
            System.out.println("numero = " + numero);
        }

        for (int i = 0; i < vector.size(); i++) {
            System.out.println("vector en la posicion  = " + i + " - igual a " + vector.get(i));
        }

        /*
        se puede decrecer el vector, siempre que se duplica o se reduce, se crea un neuvo vector y se copian los datos a ese
        nuevo vector. implicando mayor consumo de memoria.
         */
        vector.trimToSize();
        System.out.println("vector.capacity() = " + vector.capacity());

    }
}
