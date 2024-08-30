package atividadevetor;

import java.util.Scanner;

public class AtividadeVetor {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe a qtde de alunos:");
        int tam = teclado.nextInt();
        String aluno[] = new String[tam];
        float nota[] = new float[tam];
        
        float soma = 0;
        for (int i = 0; i < tam; i++) {
            System.out.println("Informe o nome do aluno " + (i+1) + ":");
            aluno[i] = teclado.next();
            System.out.println("Informe a nota: ");
            nota[i] = teclado.nextFloat();
            soma = soma + nota[i];
        }
        float media = soma / tam;
        System.out.println("Média: " + media);
        System.out.println("Alunos com nota abaixo da média");
        for (int i = 0; i < tam; i++) {
            if (nota[i] < media) {
                System.out.println("Aluno: " + aluno[i]);
                System.out.println("Nota: " + nota[i]);
            }
        }
    }
}
