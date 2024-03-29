public class AberturaContaFactory {

    public static AberturaConta getAberturaConta(String tipo) {
        AberturaConta aberturaConta = null;

        if ("CC".equals(tipo)) {
            aberturaConta = new AberturaContaCorrente();
        } else if ("CP".equals(tipo)) {
            aberturaConta = new AberturaContaPoupanca();
        } else if ("CI".equals(tipo)) {
            aberturaConta = new AberturaContaInvestimento();
        }

        return aberturaConta;
    }

}

