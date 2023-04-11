import java.math.BigDecimal;

public class SacarContaCorrente implements Sacar {

    @Override
    public void sacar(Conta conta, BigDecimal valorSaque) {
        Sacar.super.sacar(conta, valorSaque);
    }

}
