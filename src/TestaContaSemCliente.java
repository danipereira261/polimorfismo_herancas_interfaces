public class TestaContaSemCliente {
    public static void main(String[] args) {
        Conta contaDaMarcela = new ContaPoupanca(6646, 969060);
        System.out.println(contaDaMarcela.getSaldo());

        contaDaMarcela.setTitular(new ClienteBanco());
        System.out.println(contaDaMarcela.getTitular());

    }
}
