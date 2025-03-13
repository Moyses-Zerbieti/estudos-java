package sistema;
public class SistemaCadastro {
    public static void main(String[] args) {
        Pessoa marcos = new Pessoa("Marcos", "708.999.502.66" );
        marcos.setEndereço("RUA DAS ARARAS");
        System.out.println(marcos.getNome() + " - " + marcos.getCpf() +  " - " + marcos.getEndereço());
    }
}
