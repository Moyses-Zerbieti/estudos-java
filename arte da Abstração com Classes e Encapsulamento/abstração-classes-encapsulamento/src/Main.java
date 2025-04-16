public class Main{
    public static void main(String[] args) throws Exception {
        var homem = new Pessoa("Mateus");
        homem.idadeAno();

        var mulher = new Pessoa("Noemi");
        mulher.idadeAno();

        System.out.println("Homem " + homem.getNome() + " idade: " + homem.getIdade());
        System.out.println("Mulher " + mulher.getNome() +  " idade " + mulher.getIdade() );
    }
}