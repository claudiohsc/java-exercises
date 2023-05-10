package aula3;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Pa {

	public static void main(String[] args) {
		int n;
		int r;
		int a0;
		
		int[] pa;
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite o numero de termos iniciais:");
		
		n = sc.nextInt();
		System.out.println("Digite a razão:");
		r = sc.nextInt();
		
		System.out.println("Digite o primeiro número: ");
		a0 = sc.nextInt();
		
				
		pa = calculaPA(a0, n, r);
		
		
		imprimirPA(pa);
		
		int numPares = 0;
		int	numImpares = 0;
		
		//contar pares e impares
		
		numPares = contarPares(pa);
		numImpares = contarImpares(pa);
		
		System.out.println("Existem "+ numPares + " números Pares e " + numImpares + " números ímpares.");
		
	}

	private static int contarImpares(int[] pa) {
		int n = 0;
		for (int i : pa) {
			if (i % 2 != 0) {
				n++;
			}
		}
		return n;
	}

	private static int contarPares(int[] pa) {
		int n = 0;
		for (int i=0; i < pa.length; i++) {
			if (pa[i] % 2 == 0) {
				n++;
			}
		}
		return n;
	}

	private static void imprimirPA(int[] pa) {
		for(int i = 0; i < pa.length; i++) {
			System.out.print(pa[i] + ", ");
		}
		System.out.println();
	}

	private static int[] calculaPA(int a0, int n, int r) {
		int temp[] = new int[n];
		for(int i = 0; i < n; i++) {
			temp[i] = a0 + i *r;			
		}
		
		return temp;
	}
	
	
}
