package Ordenacao;


public class Pessoa implements Comparable <Pessoa>{
    private String nome;
    private int idade;

    

    @Override
    public String toString() {
        return nome + " " + " idade: "+ idade + " " + "altura:" + altura;
    }

    public Pessoa(String nome, int idade, Double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public Double getAltura() {
        return altura;
    }
    private Double altura;

    @Override
    public int compareTo(Pessoa p) {
        return Integer.compare(this.idade, p.getIdade());
    }

}

