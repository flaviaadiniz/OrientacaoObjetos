package aula06;
/*
* Criar classe Ave
   - voa : boolean
   * Métodos
   - voar()
   - construtor
   - get e set
   *
 */
public class Ave extends Animal {

    private boolean voa;

    public Ave(String nome, String cor, String ambiente, Double velocidadeMedia, boolean voa) {
        super(nome, cor, ambiente, velocidadeMedia);
        this.voa = voa;
    }

    public boolean isVoa() {
        return voa;
    }

    public void setVoa(boolean voa) {
        this.voa = voa;
    }

    public void Voar() {
        if (voa) {
            System.out.println("Animal voou!");
        } else {
            System.out.println("Esta ave não voa!");
        }
    }

    @Override
    public String toString() {
        return "Ave\n" +
                super.toString() +
                "\nVoa? " + voa;
    }
}
