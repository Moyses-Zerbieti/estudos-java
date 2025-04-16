public class Mainn {
    public static void main(String[] args) throws Exception {
        Funcionario funcionario = new Funcionario();
        Vendedor vendedor = new Vendedor();
        Gerente gerente = new Gerente();

        System.out.println(funcionario instanceof Funcionario);
        System.out.println(vendedor instanceof Funcionario);
        System.out.println(gerente instanceof Funcionario);
        /*
         * instanceof é uzado para comparar se um objeto pertence a uma classe ou implementa uma interface
         * nesse exemplo ele ta comparando os objetos que herdam da classe Funcionario
         * então todos eles vão retornar TRUE
         */
    }
}
