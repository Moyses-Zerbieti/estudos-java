package sistema;
public class Pessoa {
    private String nome;
    private String cpf;
    private String endereco;

    //método construtor, deve ter o mesmo nome que a classe
    //usando os parêmetros para gerar atributos nas variaveis da classe modelo
    public Pessoa (String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }
    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
    public String getEndereço() {
        return endereco;
    }
    public void setEndereço(String endereço) {
        this.endereco = endereço;
    }  
}