import java.util.Arrays;

import javax.swing.JOptionPane;

public class matrizes {

	public static void main(String[] args) {
		String strn = JOptionPane.showInputDialog(null, "Quantos números deseja?");
		int n = Integer.parseInt(strn);
		
		int x[]; //declarando vetor
		x = new int[n]; //criacao do vetor
		
		for(int i = 0; i < n; i++) {
			
			String num = JOptionPane.showInputDialog("Posição "+ i + ": Digite um número:");
			int numero = Integer.parseInt(num);
			
			x[i] = numero;
			
		}
		
		System.out.print("Vetor original: [");
		
		for (int i=0;i<x.length;i++) {
			
			System.out.print(x[i]+", ");
		}
		System.out.println("]");
		
		Arrays.sort(x); //ordenando os valores
		
		System.out.print("Vetor ordenado: [");
		
		for (int i=0;i<x.length;i++) {
			
			System.out.print(x[i]+", ");
		}
		System.out.print("]");
		
		

	}
}


