import java.math.BigDecimal;

public class TesteSacarMain {

    public static void main(String[] args) {

        Pessoa cliente = new PessoaJuridica();
        cliente.setNome("Rodrigo");

        AberturaConta aberturaConta = AberturaContaFactory.getAberturaConta(TipoConta.CC);

        Conta conta = aberturaConta.abrirConta(cliente, "0002");
        conta.setSaldo(new BigDecimal(100));

        Sacar operacaoSacar = new SacarContaCorrente();

        operacaoSacar.sacar(conta, new BigDecimal(10));

        System.out.println(conta);
    }

}
