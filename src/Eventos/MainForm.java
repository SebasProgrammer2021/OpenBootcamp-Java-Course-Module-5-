package Eventos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm {
    private JTextPane pricePane;
    private JTextPane ivaPane;
    private JTextPane totalPane;
    private JButton calculateButton;
    private JPanel taxPane;

    //FORMA 1 AUTOGENERADA POR EL IDE
//    public MainForm() {
//        calculateButton.addActionListener(new ActionListener() {
//            /**
//             * Invoked when an action occurs.
//             *
//             * @param e the event to be processed
//             */
//            @Override
//            public void actionPerformed(ActionEvent e) {
//
//            }
//        });
//    }

    //FORMA 2 A MANO
    /*constructor*/
    public MainForm() {
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double price = Double.parseDouble(pricePane.getText());
                double iva = Double.parseDouble(ivaPane.getText());

                double result = price + (price / 100 * iva);
                totalPane.setText(Double.toString(result));
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("SwingTax");
        frame.setContentPane(new MainForm().taxPane);
        frame.setVisible(true);
        /*
        listener: es un proceso que queda en espera de que algo se produzca
         */
    }

    /*
    el patron observer: consiste en que hay un ente que esta cons tante mente en escucha y cuanod
    se produce un evento invoca a un metodo que realiza la acción.
     */

}
