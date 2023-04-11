public class Main {

    public static void main(String[] args) {

        PessoaFisica pessoaFisica = new PessoaFisica();
        PessoaJuridica pessoaJuridica = new PessoaJuridica();

        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.setCliente(pessoaFisica);
        contaCorrente.setCliente(pessoaJuridica);

        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.setCliente(pessoaFisica);
        //contaPoupanca.setCliente(pessoaJuridica);

    }
}