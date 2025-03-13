package escola;
public class Escola {
    public static void main(String[] args) {
        Aluno felipe = new Aluno();
        felipe.nome = "Felipe";
        felipe.idade = 8;

        System.out.println("O aluno " + felipe.nome + " tem " + felipe.idade + " anos");


        Aluno2 ana = new Aluno2();
        ana.setNome("Ana");
        ana.setIdade(14);
        ana.setSexo("feminino");
        System.out.println("A aluna " + ana.getNome() + " tem " + ana.getIdade() + " anos" + " e é do sexo " + ana.getSexo());
    }
    
}
