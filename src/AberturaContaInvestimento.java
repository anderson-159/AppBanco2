import java.math.BigDecimal;
import java.util.Random;

public class AberturaContaInvestimento implements AberturaConta{

    @Override
    public ContaInvestimento abrirConta(Pessoa cliente, String agencia) {
        Conta contaInvestimento = new ContaInvestimento();
        contaInvestimento.setSaldo(BigDecimal.ZERO);
        contaInvestimento.setAgencia(agencia);
        contaInvestimento.setNumero(String.valueOf(new Random().nextInt(1, 1000)));
        ((ContaInvestimento) contaInvestimento).setCliente(cliente);
        return (ContaInvestimento) contaInvestimento;
    }

}

