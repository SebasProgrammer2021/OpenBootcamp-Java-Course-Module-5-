package advancedDataTypes;

import java.util.ArrayList;

public class ArrayList_ {
    public static void main(String[] args) {

//        es una implementación de la clase list
//        también incrementa su capacity en un 50%
        ArrayList<String> myArrayList = new ArrayList<>();
        myArrayList.add("a");
        myArrayList.add("b");
        myArrayList.add("c");

        System.out.println("myArrayList after adding = " + myArrayList);

        myArrayList.remove("a");
        System.out.println("removing in myArrayList = " + myArrayList);


//        recorrerlo
        System.out.println("\nrecorrido foreach");
        for (String elemento : myArrayList) {
            System.out.println("elemento = " + elemento);
        }

        System.out.println("\nrecorrido for");
        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.println(myArrayList.get(i));
        }

//convertir el array list en array
        String[] myarray = new String[myArrayList.size()];
        for (int i = 0; i < myarray.length; i++) {
            myarray[i]=myArrayList.get(i);
        }

        for (String elemento : myarray) {
            System.out.println("elemento = " + elemento);
        }
    }
}
