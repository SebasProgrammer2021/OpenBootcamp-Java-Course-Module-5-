package advancedDataTypes;

public class Arrays {
    public static void main(String[] args) {
        int[] array = new int[5];
        int[] arrayWithValues = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;

//        foreach
        for (int value : arrayWithValues) {
//            System.out.println("value = " + value);
        }

        for (int i = 0; i < arrayWithValues.length; i++) {
//            System.out.println("i = " + i + "; value = " + arrayWithValues[i]);
        }

//        matrices
        int nuevaMatriz[][] = new int[2][4];

//        primera fila
        nuevaMatriz[0][0] = 1;
        nuevaMatriz[0][1] = 2;
        nuevaMatriz[0][2] = 3;
        nuevaMatriz[0][3] = 4;

        //segunda fila
        nuevaMatriz[1][0] = 10;
        nuevaMatriz[1][1] = 20;
        nuevaMatriz[1][2] = 30;
        nuevaMatriz[1][3] = 40;

//        filas
        for (int i = 0; i < nuevaMatriz.length; i++) {
            System.out.println("fila i numero = " + i);
//            columns
            for (int j = 0; j < nuevaMatriz[i].length; j++) {
                System.out.println("fila " + i + "- columna j = " + j);
                System.out.println("valor de la posición "+nuevaMatriz[i][j]);
            }

        }


    }
}
