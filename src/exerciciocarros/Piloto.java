package exerciciocarros;
/*Classe Piloto
*Atributos:
- nome : String
- idade : Interger
- sexo : Enum
- equipe : String
*Métodos:
+ "Construtor"
+ set... (alterar atributos da Classe - "Modificadores")
+ get... (retorna valores dos atributos da Classe - "Acessores")
*/

public class Piloto {

    private String nome;
    private Integer idade;
    private Enum genero;
    private String equipe;

    public Piloto (String nome, Integer idade, Enum genero, String equipe) {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
        this.equipe = equipe;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Enum getGenero() {
        return genero;
    }

    public void setGenero(Enum genero) {
        this.genero = genero;
    }

    public String getEquipe() {
        return equipe;
    }

    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }

    @Override
    public String toString() {
        return "Piloto[" +
                "nome: '" + nome + '\'' +
                ", idade: " + idade +
                ", genero: " + genero +
                ", equipe: '" + equipe + '\'' +
                ']';
    }
}
