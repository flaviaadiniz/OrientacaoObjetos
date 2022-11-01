package projetofinal;

/*
O dono de uma locadora percebeu que alguns filmes do seu estoque não estão mais sendo alugados.
Para liberar espaço no estoque e comprar novos CD's e DVD's resolveu doar os que estão parados apenas ocupando espaço.
Crie um sistema que faça a doação dessas mídias de forma aleatória.
*/

/*
Essa classe deve conter método pegarMidiaAleatoria() que devolve uma midia já criada na biblioteca aleatória
Esse classe deve conter método assisitirFilme(Dvd dvd) e chamar os dois métodos de legenda
*/

import java.util.Random;

public class DoacaoMidia {

    static Midia filme1 = new Dvd("F001", 25.0, "Duelo de Titãs", "En-US", true, "Português");
    static Midia filme2 = new Dvd("F002", 20.0, "Harry Potter 1", "En-UK", true, "Português");
    static Midia cd1 = new Cd("C001", 10.0, "Sam's Town", "The Killers", 12);
    static Midia cd2 = new Cd("C002", 15.0, "AM", "Arctic Monkeys", 12);
    static Midia cd3 = new Cd("C003", 20.0, "Alive III", "KISS", 10);


    public static void main(String[] args) {

        Midia midiaAleatoria = pegarMidiaAleatoria();
        System.out.println(midiaAleatoria);
        midiaAleatoria.darPlay();

        assistirFilme((Dvd) filme1, true, "PT-BR");

    }

    public static Midia pegarMidiaAleatoria() {
        Random gerador = new Random();
        int valorAleatorio = gerador.nextInt(5);

        switch (valorAleatorio) {
            case 0: return filme1;
            case 1: return filme2;
            case 2: return cd1;
            case 3: return cd2;
            case 4: return cd3;
        }
        return pegarMidiaAleatoria();
    }

    public static void assistirFilme(Dvd dvd, boolean possuiLegenda, String idiomaLegenda) {
        dvd.ligarLegenda(false, "PT-BR");
        dvd.setIdioma("PT-BR");
        System.out.println("Assistindo " + dvd.getNome() + " em " + idiomaLegenda + ".");
    }

}
