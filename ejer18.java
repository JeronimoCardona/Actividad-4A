import javax.swing.*;

public class ejer18 {
    public static void main(String[] args) {
        String mensaje = "";
        int numero = 0;
        int primorial = 0;

        mensaje = "Ingrese un numero";
        numero = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));

        primorial = Funciones.Primorial(numero);

        mensaje = "EL primorial de este numero es: " + primorial;

        JOptionPane.showMessageDialog(null, mensaje);
    }
}