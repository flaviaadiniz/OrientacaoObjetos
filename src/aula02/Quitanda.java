package aula02;

// Abstraia fruta para o sistema de quitanda
// Os seguintes atributos devem ser considerados
//---- nome
//---- cor
//---- quantidade

// Crie a fruta banana e maça

// Abstraia verdura para o sistema de quitanda
// Os seguintes atributos devem ser considerados
//---- nome
//---- cor
//---- quantidade

// Crie a verdura alface e couve

// Criar mais um objeto que faça sentido pra aplicação

public class Quitanda {

    public static void main(String[] args) {

        Fruta banana = new Fruta();
        banana.nome = "Banana";
        banana.cor = "amarelo";
        banana.quantidade = 10;
        banana.imprimir();

        Fruta maca = new Fruta();
        maca.nome = "Maçã";
        maca.cor = "vermelho";
        maca.quantidade = 15;
        maca.imprimir();

        Fruta abacaxi = new Fruta();
        abacaxi.nome = "Abacaxi";
        abacaxi.cor = "verde";
        abacaxi.quantidade = 20;
        abacaxi.imprimir();


        Verdura alface = new Verdura();
        alface.nome = "Alface";
        alface.cor = "verde";
        alface.quantidade = 5;
        alface.imprimir();

        Verdura couve = new Verdura();
        couve.nome = "Couve";
        couve.cor = "verde";
        couve.quantidade = 10;
        couve.imprimir();


        Bebidas agua = new Bebidas();
        agua.tipo = "água mineral";
        agua.marca = "Naturale";
        agua.tamanho = 500;
        agua.preco = 2.99;
        agua.imprimir();

        Bebidas coquinha = new Bebidas();
        coquinha.tipo = "refrigerante";
        coquinha.marca = "Coca Cola";
        coquinha.tamanho = 200;
        coquinha.preco = 2.00;
        coquinha.imprimir();


    }

}
