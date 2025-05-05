public class UsuarioAcesso extends Pessoa {
    private String login;
    private String senha;
    private String nivelAcesso;

    public UsuarioAcesso(String nome, String cpf, String endereco, String login, String senha, String nivelAcesso) {
        super(nome, cpf, endereco);
        this.login = login;
        this.senha = senha;
        this.nivelAcesso = nivelAcesso;
    }

    public String getLogin() { return login; }
    public void setLogin(String login) { this.login = login; }

    public String getSenha() { return senha; }
    public void setSenha(String senha) { this.senha = senha; }

    public String getNivelAcesso() { return nivelAcesso; }
    public void setNivelAcesso(String nivelAcesso) { this.nivelAcesso = nivelAcesso; }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Login: " + login);
        System.out.println("Nível de Acesso: " + nivelAcesso);
    }
}