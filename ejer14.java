import javax.swing.*;

public class ejer14 {
    public static void main(String[] args) {
        String mensaje = "";
        int numero = 0;
        int sumdivisoresneg = 0;

        mensaje = "Ingrese un numero";
        numero = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));

        sumdivisoresneg = Funciones.sumDivisoresNeg(numero);

        mensaje = "La suma de los divisores negativos de este numero son: " + sumdivisoresneg;

        JOptionPane.showMessageDialog(null, mensaje);
    }
}