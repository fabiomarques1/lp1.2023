package introducaojava;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class IntroducaoJava {

    public static void main(String[] args) {
        /*
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual seu nome?");
        String nome = entrada.next();
        System.out.println("Qual sua idade?");
        int idade = entrada.nextInt();
        
        System.out.println("Nome: " + nome + "\nIdade: " + idade);
      */
        String teclado;
        String nome = JOptionPane.showInputDialog("Qual seu nome");
        teclado = JOptionPane.showInputDialog("Qual sua idade");
        int idade = Integer.parseInt(teclado);
        
        JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nIdade: " + idade);
    }
    

}