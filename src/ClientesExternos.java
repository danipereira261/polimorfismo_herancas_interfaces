public class ClientesExternos implements Autenticavel {

    private int senha;
    private AutenticacaoUtil autenticador;

    public ClientesExternos() {
        this.autenticador = new AutenticacaoUtil();
    }

    @Override
    public void setSenha(int senha) {

        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }
}