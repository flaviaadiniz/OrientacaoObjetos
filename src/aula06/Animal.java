package aula06;

  /* Cria classe animal
           * Atributos
           - nome : String
           - cor : String
           - ambiente: String
           - velocidade média : Double
           *   * Métodos
           *   - Comer
*/
public class Animal {

    private String nome;
    private String cor;
    private String ambiente;
    private Double velocidadeMedia;

    public Animal(String nome, String cor, String ambiente, Double velocidadeMedia) {
        this.nome = nome;
        this.cor = cor;
        this.ambiente = ambiente;
        this.velocidadeMedia = velocidadeMedia;
    }

      public String getNome() {
          return nome;
      }

      public void setNome(String nome) {
          this.nome = nome;
      }

      public String getCor() {
          return cor;
      }

      public void setCor(String cor) {
          this.cor = cor;
      }

      public String getAmbiente() {
          return ambiente;
      }

      public void setAmbiente(String ambiente) {
          this.ambiente = ambiente;
      }

      public Double getVelocidadeMedia() {
          return velocidadeMedia;
      }

      public void setVelocidadeMedia(Double velocidadeMedia) {
          this.velocidadeMedia = velocidadeMedia;
      }

      public void Comer(){
        System.out.println("Animal comeu!");
    }

      @Override
      public String toString() {
          return  "Nome: " + nome + "." +
                  "\nCor: " + cor + "." +
                  "\nAmbiente: " + ambiente + "." +
                  "\nVelocidade média: " + velocidadeMedia + "Km/h.";
      }
  }
