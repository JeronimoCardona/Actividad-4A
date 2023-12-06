import javax.swing.*;

public class ejer13 {
    public static void main(String[] args) {
        String mensaje = "";
        int numero = 0;
        int sumdivisorespos = 0;

        mensaje = "Ingrese un numero";
        numero = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));

        sumdivisorespos = Funciones.sumDivisoresPos(numero);

        mensaje = "La suma de los divisores positivos de este numero son: " + sumdivisorespos;

        JOptionPane.showMessageDialog(null, mensaje);
    }
}