package exerciciocarros;

public class Main {

    public static void main(String[] args) {

        System.out.println("-----------");
        System.out.println("* PILOTOS *");
        System.out.println("-----------");

        Piloto piloto1 = new Piloto("Flávia", 38, Genero.FEMININO, "Ferrari");
        System.out.println(piloto1);

        Piloto piloto2 = new Piloto("Marcela", 34, Genero.FEMININO, "Williams");
        System.out.println(piloto2);

        Piloto piloto3 = new Piloto("Diego", 40, Genero.MASCULINO, "MacLaren");
        System.out.println(piloto3);

        System.out.println("");

        System.out.println("----------");
        System.out.println("* CARROS *");
        System.out.println("----------");

        CarroCorrida carro1 = new CarroCorrida(1, piloto1, 120, 0, false);
        System.out.println(carro1);

        CarroCorrida carro2 = new CarroCorrida(2, piloto2, 110, 0, false);
        System.out.println(carro2);

        CarroCorrida carro3 = new CarroCorrida(3, piloto3, 100, 0, false);
        System.out.println(carro3);

        System.out.println("");

        carro1.Ligar();
        carro1.Acelerar(80);
        carro1.setVelocidadeAtual(100);
        carro1.Frear(40);
        carro1.Parar();
        carro1.Desligar();

        System.out.println("");

        carro2.Ligar();
        carro2.Acelerar(100);
        carro2.setVelocidadeAtual(120);
        carro2.setVelocidadeAtual(110);
        carro2.Frear(80);
        carro2.Parar();
        carro2.Desligar();

        System.out.println("");

        carro3.Ligar();
        carro3.Acelerar(100);
        carro3.setVelocidadeAtual(130);
        carro3.Frear(50);
        carro3.Desligar();
        carro3.setVelocidadeAtual(0);
        carro3.Desligar();
    }

}
