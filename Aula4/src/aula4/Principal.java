package aula4;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		String strValorBase = JOptionPane.showInputDialog("Informe a medida da base:");
		String uBase = JOptionPane.showInputDialog("Informe a unidade da base:");
		int valorBase = Integer.parseInt(strValorBase);
		
		String strValorAltura = JOptionPane.showInputDialog("Informe a medida da altura:");
		String uAltura = JOptionPane.showInputDialog("Informe a unidade da altura:");
		int valorAltura = Integer.parseInt(strValorAltura);
		
		Medida b = new Medida(valorBase, uBase);
		Medida h = new Medida(valorAltura, uAltura);
		
		Retangulo r = new Retangulo(b, h);
		
		
	}
}
