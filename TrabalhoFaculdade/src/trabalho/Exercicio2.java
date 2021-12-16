package trabalho;

import javax.swing.JOptionPane;

public class Exercicio2 {

    public static void main(String[] args) {

        String valor1 = JOptionPane.showInputDialog("Digite o primeiro número: ");
        String valor2 = JOptionPane.showInputDialog("Digite o segundo número: ");

        float numero1 = Float.parseFloat(valor1);
        float numero2 = Float.parseFloat(valor2);

        float soma = numero1 + numero2;
        JOptionPane.showMessageDialog(null, "A média é: " + soma / 2);

        System.exit(0);

    }
}
