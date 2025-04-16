public class Main {
    public static void main(String[] args) throws Exception {
        printFuncionario(new Gerente());
        printFuncionario(new Vendedor());
    }
        public static void printFuncionario(Funcionario funcionario){

            System.out.printf("====%s===\n", funcionario.getClass().getCanonicalName());
        switch(funcionario) {
            case Gerente gerente -> { 
                gerente.setNome("João");
                gerente.setSalario(5000);
                gerente.setCodigo("123");
                gerente.setLogin("JoaoJP@gmail.com");
                gerente.setSenha("1234567");

                System.out.println(gerente.getNome());
                System.out.println(gerente.getSalario());
                System.out.println(gerente.getCodigo());
                System.out.println(gerente.getLogin());
                System.out.println(gerente.getSenha());
            }
            case Vendedor vendedor ->{ 
                vendedor.setNome("Pedro");
                vendedor.setSalario(3500);
                vendedor.setCodigo("76");
                vendedor.setComissao(10);
                vendedor.setVendaMes(1000);

                System.out.println(vendedor.getNome());
                System.out.println(vendedor.getSalario());
                System.out.println(vendedor.getCodigo());
                System.out.println(vendedor.getComissao());
                System.out.println(vendedor.getVendaMes());
            }
        }
    }
}
