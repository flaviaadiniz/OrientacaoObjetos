package aula07;

public class Main {

    public static void main(String[] args) {

        Contribuinte pessoaFisica = new PessoaFisica("Nathalia", 20000.0, TipoPessoa.PF, "00011122234");
        pessoaFisica.calcularImposto();

        PessoaJuridica pessoaJuridica = new PessoaJuridica("Ada", 100000.0, TipoPessoa.PJ, "99999990001234");
        pessoaJuridica.calcularImposto();

        Contribuinte generico = new Contribuinte("Flávia", 5000.0, TipoPessoa.PF);
        generico.calcularImposto();

        alterarRenda(2000.0, pessoaFisica);
        alterarRenda(50000.0, pessoaJuridica);


    }

        public static void alterarRenda(double incremento, Contribuinte contribuinte) {
            double aumentoRenda = contribuinte.getRenda() + incremento;
            contribuinte.setRenda(aumentoRenda);
            System.out.println("A nova renda de " + contribuinte.getNome() + " é R$" + contribuinte.getRenda() + ".");
        }

}
