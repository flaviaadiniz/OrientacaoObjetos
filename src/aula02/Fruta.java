package aula02;

public class Fruta {

    public String nome;
    public String cor;
    public int quantidade;


    public void imprimir() {
        System.out.println(
                "FRUTA" +
                "\nNome: " + nome +
                "\nCor: " + cor +
                "\nQuantidade: " + quantidade +
                "\n "
        );
    }
}
