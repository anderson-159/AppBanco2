import java.util.Scanner;

public class AbrirContaMain {

    public static void main(String[] args) {

        PessoaFisica pessoaFisica = new PessoaFisica();
        pessoaFisica.setNome("Rodrigo");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual conta voce quer abrir?");

        String tipoConta = scanner.nextLine();

        AberturaConta aberturaConta = AberturaContaFactory.getAberturaConta(tipoConta);

        Conta conta = aberturaConta.abrirConta(pessoaFisica, "0002");

        System.out.println(conta);

    }



}