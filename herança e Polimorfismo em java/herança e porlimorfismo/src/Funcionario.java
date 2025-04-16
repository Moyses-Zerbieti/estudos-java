public sealed abstract class Funcionario permits Gerente, Vendedor {
    protected String nome;
    protected String endereco;
    protected int idade;
    protected String codigo;
    protected double salario;

   public Funcionario(String nome, String endereco, int idade, String codigo, double salario) {
        this.nome = nome;
        this.endereco = endereco;
        this.idade = idade;
        this.codigo = codigo;
        this.salario = salario;
   }
    public Funcionario() {
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
}
