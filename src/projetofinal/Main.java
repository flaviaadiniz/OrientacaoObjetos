package projetofinal;

/*O dono de uma locadora percebeu que alguns filmes do seu estoque não estão mais sendo alugados.
Para liberar espaço no estoque e comprar novos CD's e DVD's resolveu doar os que estão parados apenas ocupando espaço.
Crie um sistema que faça a doação dessas mídias de forma aleatória.

Para isso você deve criar:
Criar classe Pai chamada Midia
Atributos:
codigo : String
preco : Double
nome : String
Métodos
darPlay()
construtor(todos os argumentos)
get() e set()

Criar classe Filha chamada Dvd
Atributos:
idioma : String
possuiLegenda : boolean
idiomaLegenda : String
Métodos
sobrescrever darPlay(): exibir a mensagem "filme iniciado"
construtor(todos os argumentos)
get() e set()
legenda(boolean ligar, String idioma) : liga a legenda e atualiza o idioma da legenda
legenda(boolean ligarDesligar) : apenas atualiza a variável possuiLegenda

Criar classe Filha chamada CD
Atributos:
artista : String
quantidadeFaixas : int
Métodos
sobrescrever darPlay(): exibir a mensagem "Primeira faixa tocando"
construtor(todos os argumentos)
get() e set()

Criar classe DoacaoMidia
Essa classe deve conter método pegarMidiaAleatoria() que devolve uma midia já criada na biblioteca aleatória
Esse classe deve conter método assisitirFilme(Dvd dvd) e chamar os dois métodos de legenda

Método main: O main deve pegar uma midia aleatoria e dar o play */

public class Main {

    public static void main(String[] args) {

        /*Midia filme1 = new Dvd("F001", 25.0, "Duelo de Titãs", "En-US", true, "Português");
        Midia filme2 = new Dvd("F002", 20.0, "Harry Potter 1", "En-UK", true, "Português");
        Midia cd1 = new Cd("C001", 10.0, "Sam's Town", "The Killers", 12);
        Midia cd2 = new Cd("C002", 15.0, "AM", "Arctic Monkeys", 12);
        Midia cd3 = new Cd("C003", 20.0, "Alive III", "KISS", 10);*/

        /*System.out.println(filme1);
        System.out.println(filme2);
        System.out.println(cd1);
        System.out.println(cd2);
        System.out.println(cd3);*/

    }


}
