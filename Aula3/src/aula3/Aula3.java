package aula3;

import javax.swing.JOptionPane;

public class Aula3 {

	public static void main(String[] args) {
		String pergunta = JOptionPane.showInputDialog(null, "Escolha a figura geométrica desejada\n"
				+ "1 - Circulo\n"
				+ "2 - Quadrado\n"
				+ "3 - Retângulo\n"
				+ "4 - Triângulo");
		
		int numero = Integer.parseInt(pergunta);
		if (numero == 1) {
			double raio = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o raio do círculo"));
			double perimetro = (2 * 3.14 * raio);
			double area = (3.14 * raio * raio);
			
			JOptionPane.showMessageDialog(null, "O perímetro do círculo é " + perimetro +" e a área é " + area);
		} else if (numero == 2){
			double lado = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o lado do quadrado"));
			double perimetro = (lado * 4);
			double area = (lado * lado);
			
			JOptionPane.showMessageDialog(null, "O perimetro do quadrado é " + perimetro + " e a área é " + area);
			
		} else if (numero == 3){
			double largura = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a largura do retângulo"));
			double comprimento = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o comprimento do retângulo"));
			double perimetro = (largura * 2) + (comprimento * 2);
			double area = (largura * comprimento);
			
			JOptionPane.showMessageDialog(null, "O perimetro do retângulo è " + perimetro + " e a área é " + area);
		} else if(numero == 4) {
			double a = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o lado a"));
			double b = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o lado b"));
			double c = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o lado c"));
			    
		}
	}

}
