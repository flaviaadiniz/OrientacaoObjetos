package aula04;

public class Conta {

    private String titular;
    private String numeroConta;
    private String cpf;
    private Double saldo;

    public Conta(String titular, String numeroConta, String cpf, Double saldo) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.cpf = cpf;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getCpf() {
        return cpf;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo (Double saldo) {
        if (saldo > 0) {
            this.saldo = saldo;
        } else {
            System.out.println("O saldo não pode ser negativo.");
        }
    }

    @Override
    public String toString() {
        return "Conta [" +
                "titular = '" + titular + '\'' +
                ", numero da conta = '" + numeroConta + '\'' +
                ", cpf = '" + cpf + '\'' +
                ", saldo = " + saldo +
                ']';
    }
}
