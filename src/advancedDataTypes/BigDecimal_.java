package advancedDataTypes;

import java.math.BigDecimal;

public class BigDecimal_ {
    public static void main(String[] args) {
        /*
        los datos financieros no deberian ser trabajados con
        double o float ya que cuasarina problemas a largo plazo
        deben ser trabajados con la clase big decimal.
         */
        BigDecimal valorA = new BigDecimal(0.1f);
        BigDecimal valorB = new BigDecimal(4);

        /*
        cuando se opera con bigdecimal se espera que los params
        sean de tipo big decimal también
         */
//        valorA.multiply(valorB);
        BigDecimal resultado = valorA.add(valorB);
        System.out.println("resultado = " + resultado.toString());

    }
}
