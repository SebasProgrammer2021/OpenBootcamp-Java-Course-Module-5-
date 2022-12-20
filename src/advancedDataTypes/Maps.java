package advancedDataTypes;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        /*  map o array asociativo
         * recibe una clave y un valor
         *
         * la forma mas primitiva es el hashmap
         *
         * no puede tener la clave duplicada
         * */
        HashMap<String, Integer> myMap = new HashMap<>();

        /*
        añadir eles
         */
        myMap.put("edad", 28);
        myMap.put("exp", 3);
        myMap.put("sueldo", 2400000);

        System.out.println("myMap = " + myMap);


//        imprimir un valor en especifico
        System.out.println(myMap.get("exp"));

//        reemplazar un valor dentro del map
        myMap.replace("exp", 4);
        System.out.println("myMap = " + myMap);

//        eliminar valores
        myMap.remove("sueldo");
        System.out.println("myMap = " + myMap);

//  recorrer un map
        for (Map.Entry elemento : myMap.entrySet()) {
            System.out.println("la clave : " + elemento.getKey() +  " --> el valor : " + elemento.getValue() );
        }
    }
}
