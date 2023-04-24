//import java.util.Scanner;
import javax.swing.JOptionPane;

public class HelloWorld {

    public static void main(String[] args){

        String nome;
//        System.out.println("Informe seu nome:");
//        Scanner sc = new Scanner(System.in);
//        nome = sc.nextLine(); // leitura do teclado

//        System.out.println("Olá " + nome + ", seja bem vindo!");

        nome = JOptionPane.showInputDialog(null, "Digite seu nome:");
        System.out.println("Olá " + nome + " seja bem vindo!");

    }

}