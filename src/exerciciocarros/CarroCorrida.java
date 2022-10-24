package exerciciocarros;
/*Classe CarroCorrida
*Atributos:
- numeroCarro : Interger
- piloto : Piloto
- velocidadeMaxima : float
- velocidadeAtual : float
- ligado : boolean
*Métodos:
+ "Construtor"
+ set... (alterar atributos da Classe - "Modificadores")
+ get... (retorna valores dos atributos da Classe - "Acessores")
+ acelerar(float) - aumenta a velocidade em Km/h (Soma em Km/h a velocidade atual)
+ frear(float) - reduz a velocidade em Km/h (subtrai em Km/h a velocidade atual)
+ parar() - velocidade igual a 0 Km/h
+ ligar()
+ desligar()
*Observações:
*Não ultrapassar a velocidade máxima
*Frear e Acelerar só funcionam se o carro estiver ligado
*Desligar só funciona se o carro estiver parado */

public class CarroCorrida {

    private Integer numeroCarro;
    private Piloto piloto;
    private float velocidadeMaxima;
    private float velocidadeAtual;
    private boolean ligado;


    public CarroCorrida (Integer numeroCarro,
                         Piloto piloto,
                         float velocidadeMaxima,
                         float velocidadeAtual,
                         boolean ligado) {
        this.numeroCarro = numeroCarro;
        this.piloto = piloto;
        this.velocidadeMaxima = velocidadeMaxima;
        this.velocidadeAtual = velocidadeAtual;
        this.ligado = ligado;
    }

    public Integer getNumeroCarro() {
        return numeroCarro;
    }

    public void setNumeroCarro(Integer numeroCarro) {
        this.numeroCarro = numeroCarro;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public float getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(float velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public float getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(float velocidadeAtual) {
        if (velocidadeAtual <= velocidadeMaxima) {
            this.velocidadeAtual = velocidadeAtual;
            System.out.println("A velocidade atual é " + velocidadeAtual + "Km/h.");
        } else {
            System.out.println("Não é possível exceder o limite de velocidade!");
        }

    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public void Ligar() {
        if (!ligado) {
            this.ligado = true;
            System.out.println("O carro " + getNumeroCarro() + ", pilotado por " + piloto.getNome() + ", foi ligado.");
        } else {
            System.out.println("O carro já está ligado.");
        }
    }

    public void Desligar() {
        if (velocidadeAtual == 0) {
            this.ligado = false;
            System.out.println("O carro foi desligado.");
        } else {
            System.out.println("ALERTA! Não é possível desligar um carro em movimento!");
        }
    }

    public void Acelerar(float aceleracao) {
        if (ligado && this.velocidadeAtual + aceleracao <= velocidadeMaxima) {
            this.velocidadeAtual += aceleracao;
            System.out.println("O carro aumentou a velocidade em " + aceleracao + "Km/h e agora está a " +
                    velocidadeAtual + "Km/h.");
        } else {
            System.out.println("ALERTA! Não é possível fazer esta aceleração pois ultrapassa o limite de velocidade!");
        }
    }

    public void Frear(float frenagem) {
        if (ligado) {
            this.velocidadeAtual -= frenagem;
            System.out.println("O carro diminiu a velocidade em " + frenagem + "Km/h e agora está a " + velocidadeAtual + "Km/h.");
        } else {
            System.out.println("ALERTA! Não é possível frear um carro desligado.");
        }
    }

    public void Parar() {
        if (velocidadeAtual != 0) {
            this.velocidadeAtual = 0;
            System.out.println("O carro reduziu a velocidade para 0Km/h e encontra-se parado.");
        } else {
            System.out.println("O carro já está parado.");
        }
    }

    @Override
    public String toString() {
        return "CarroCorrida [" +
                "Número do Carro: " + numeroCarro +
                " | Piloto: " + piloto.getNome() +
                " | Velocidade Máxima: " + velocidadeMaxima + "Km/h" +
                " | Velocidade Atual: " + velocidadeAtual + "Km/h" +
                " | Ligado? " + ligado +
                ']';
    }
}
