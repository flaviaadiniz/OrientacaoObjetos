package aula02;

public class Bebidas {

    public String tipo;
    public String marca;
    public double tamanho;
    public double preco;

    public void imprimir() {
        System.out.println(
                "BEBIDA" +
                "\nTipo: " + tipo +
                "\nMarca: " + marca +
                "\nTamanho: " + tamanho + "ml" +
                "\nPreço: " + preco +
                "\n "
        );
    }

}
