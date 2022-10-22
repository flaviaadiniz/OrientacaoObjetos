package aula06;
/*
   * Cria classe animal
   * Atributos
   - nome : String
   - cor : String
   - ambiente: String
   - velocidade média : Double
*   * Métodos
*   - Comer
*
   * Criar classe Mamifero
   * Atributos
   - quantidade de patas
   * Métodos
   - amamentar()
   - construtor
   - get e set
   * Criar classe Ave
   - voa : boolean
   * Métodos
   - voar()
   - construtor
   - get e set
   *
   * No main criar um pinguin e um camelo e imprimi-los
   * */
public class ExercicioHeranca {

    public static void main(String[] args) {

        Ave pinguim = new Ave("Pinguim", "preto e branco", "gelo", 8.5, false);
        System.out.println(pinguim);

        System.out.println();

        Mamifero camelo = new Mamifero("Camelo", "marrom", "deserto", 10.0, 4);
        System.out.println(camelo);

        System.out.println();

        Mamifero cachorro = new Mamifero("Cachorro", "marrom", "cidade", 10.0, 4);
        System.out.println(cachorro);

        System.out.println();

        camelo.Amamentar();
        pinguim.Comer();
        pinguim.Voar();

    }

}
