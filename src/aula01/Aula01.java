package aula01;

public class Aula01 {

    public static void main(String[] args) {

        darOi();

        Funcionario gerente = new Funcionario();
        gerente.salario = 10000;
        gerente.bonus = 400;
        gerente.desconto = 100;
        double pagamentoGerente = gerente.calcularPagamento();

        Funcionario estagiario = new Funcionario();
        estagiario.salario = 1000;
        estagiario.bonus = 100;
        estagiario.desconto = 50;
        estagiario.nome = "Josefino";
        double pagamentoEstagiario = estagiario.calcularPagamento();


        System.out.println("O pagamento do gerente é: R$" + pagamentoGerente);
        System.out.println("O pagamento do estagiário " + estagiario.nome + " é: R$" + pagamentoEstagiario);


        Carro fusca = new Carro();
        fusca.marca = "Volkswagem";
        fusca.cor = "branca";
        fusca.numeroPortas = 2;
        fusca.placa = "IXZ9876";

    }

    private static void darOi() {
        System.out.println("Oi!");
    }


}
