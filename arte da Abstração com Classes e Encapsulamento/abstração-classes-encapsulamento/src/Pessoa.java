import java.time.OffsetDateTime;

public class Pessoa {

    final private String nome;
    private int idade; 

    private int anoPassado = OffsetDateTime.now().getYear();
 
    public Pessoa (String nome){
        this.nome = nome;
        this.idade = 1;
    }
    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    public void idadeAno(){
        if (this.anoPassado >= OffsetDateTime.now().getYear() ) return;
        this.idade +=1;
        this.anoPassado = OffsetDateTime.now().getYear();
    }
}
 