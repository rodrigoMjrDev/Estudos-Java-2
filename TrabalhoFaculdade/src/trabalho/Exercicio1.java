package trabalho;

import javax.swing.JOptionPane;

public class Exercicio1 {
	
	public static void main(String[] args) {
		String valor1 = JOptionPane.showInputDialog("Digite o primeiro número:");
		String valor2 = JOptionPane.showInputDialog("Digite o segundo número:");
		
		System.out.println(valor1 + valor2);
		
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		
		String valorMaior = null;
		
		if(numero1 > numero2){
			valorMaior = valor1;
		} else {
			valorMaior = valor2;
			}
		
			JOptionPane.showMessageDialog(null, "O maior número é: " + valorMaior);

			System.exit(0);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
		
		
		

		
		
		
		
		
		
		
		
				

		
				
		
		
		
		
	}

}
