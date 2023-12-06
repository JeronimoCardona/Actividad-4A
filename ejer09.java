import javax.swing.*;

public class ejer09 {
    public static void main(String[] args) {
        String mensaje = "";
        int numero = 0;
        int doblefactorial = 0;

        mensaje = "Ingrese un numero";
        numero = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));

        doblefactorial = Funciones.dobleFactorial(numero);

        mensaje = "El doble factorial de este numero es: " + doblefactorial;

        JOptionPane.showMessageDialog(null, mensaje);
    }
}