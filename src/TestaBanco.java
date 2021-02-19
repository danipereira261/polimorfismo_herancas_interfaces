public class TestaBanco {
    public static void main(String[] args) {
        ClienteBanco paulo = new ClienteBanco();
        paulo.setNome("Paulo Silveira");
        paulo.setCpf("222.222.222.-22");
        paulo.setProfissao("programador");

        Conta contaDoPaulo = new ContaPoupanca(6646, 969060);
        contaDoPaulo.deposita(100);

        contaDoPaulo.setTitular(paulo);
        System.out.println(contaDoPaulo.getTitular());

    }
}
