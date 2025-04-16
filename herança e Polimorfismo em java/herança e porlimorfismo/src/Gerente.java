
public non-sealed class Gerente extends Funcionario {
    private String login;
    private String senha;

    public Gerente(
        String nome, 
        String endereco, 
        int idade, 
        String codigo, 
        double salario, 
        String login, 
        String senha,
        double comissao,
        double salarioCheio){
            super(nome, endereco, idade, codigo, salario);
        this.login = login;
        this.senha = senha;
    } 

    public String getCodigo(){
        return "GRT:" + this.codigo;
    }
    public Gerente (){
    }

    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
}
