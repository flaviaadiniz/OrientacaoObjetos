package aula07;

public class PessoaFisica extends Contribuinte {

    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public PessoaFisica(String nome, Double renda, TipoPessoa tipoPessoa, String cpf) {
        super(nome, renda, tipoPessoa);
        this.cpf = cpf;
    }

    @Override
    public double calcularImposto() {
        double imposto = getRenda() * 0.15;
        System.out.println("A pessoa física " + getNome() + " pagará R$" + imposto + ".");
        return imposto;
    }

    @Override
    public String toString() {
        return super.toString() + "PessoaFisica{" +
                "cpf='" + cpf + '\'' +
                '}';
    }
}
