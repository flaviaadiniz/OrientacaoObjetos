package aula04;

public class Agencia {

    public static void main(String[] args) {

        Conta contaFlavia = new Conta("Flávia", "0987329-8", "999.999.999-99", 3500.0);
        Conta contaDiego = new Conta("Diego", "0134497-9", "111.111.111-11", 4000.0);

        System.out.println(contaFlavia);
        System.out.println(contaDiego);

        sacar(300.0, contaFlavia);
        System.out.println(contaFlavia);

        transferir(500.0, contaDiego, contaFlavia);
        System.out.println(contaFlavia);
        System.out.println(contaDiego);

        pagar(490.0, contaFlavia);
        System.out.println(contaFlavia);

    }

    public static void sacar(Double valor, Conta conta) {
        Double novoSaldo = conta.getSaldo() - valor;
        conta.setSaldo(novoSaldo);
    }

    public static void transferir(Double valor, Conta contaOrigem, Conta contaDestino) {
        Double novoSaldoContaOrigem = contaOrigem.getSaldo() - valor;
        contaOrigem.setSaldo(novoSaldoContaOrigem);

        Double novoSaldoContaDestino = contaDestino.getSaldo() + valor;
        contaDestino.setSaldo(novoSaldoContaDestino);
    }

    public static void pagar(Double valor, Conta conta) {
     Double novoSaldo = conta.getSaldo() - valor;
     conta.setSaldo(novoSaldo);
    }
}
