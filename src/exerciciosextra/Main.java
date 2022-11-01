package exerciciosextra;

/* ## Exercício

        Calcule a média aritmética de n valores a serem digitados.

        Seu programa deve pedir para que o usuário digite uma nota de 0 a 10.

        Se o valor digitado for -1, seu programa deve efetuar o cálculo da média e imprimir na tela, com a quantidade de notas
        digitadas

        Se for maior que 10, deve devolver uma mensagem avisando que a nota está inválida e não adicionar na soma. */

public class Main {

    public static void main(String[] args) {

        for(int outer = 0; outer < 3; outer++){
            System.out.println("The outer index is: " + outer);
            for(int inner = 0; inner < 4; inner++){
                System.out.println("\tThe inner index is: " + inner);
            }
        }

    }

}
