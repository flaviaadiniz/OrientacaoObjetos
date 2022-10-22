package aula06;
/*
* Criar classe Mamifero
   * Atributos
   - quantidade de patas
   * Métodos
   - amamentar()
   - construtor
   - get e set
 */
public class Mamifero extends Animal {

    private int quantidadeDePatas;

    public Mamifero(String nome, String cor, String ambiente, Double velocidadeMedia, int quantidadeDePatas) {
        super(nome, cor, ambiente, velocidadeMedia);
        this.quantidadeDePatas = quantidadeDePatas;
    }

    public int getQuantidadeDePatas() {
        return quantidadeDePatas;
    }

    public void setQuantidadeDePatas(int quantidadeDePatas) {
        this.quantidadeDePatas = quantidadeDePatas;
    }

    public void Amamentar() {
        System.out.println("Animal amamentou seu filhote.");
    }

    @Override
    public String toString() {
        return "Mamifero\n" +
                super.toString() +
                "\nQuantidade de Patas: " + quantidadeDePatas;
    }
}
