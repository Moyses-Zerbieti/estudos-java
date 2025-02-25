public class OperadoresRelacionais {
    public static void main(String[] args) {
        
    //== verifica se uma variavel é IGUAL a outra
    //!= verifica se uma variavel é DIFERENTE da outra
    // > verifica se uma variavel é MAIOR que a outra 
    // < verifica se uma variavel é MENOR que a outra 
    // >= verifica se uma variavel é MAIOR OU IGUAL a outra
    // <= verifica se uma variavel é MENOR OU IGUAL a outra

        
        String nome = "Moyses";
        String nome2 = new String ("Moyses");
        System.out.println(nome.equals(nome2));

        int num1 = 1;
        int num2 = 2;

        boolean simNão = num1 == num2;
        System.out.println("num1 é igual ao num2? " + simNão);

        simNão = num1 != num2;
        System.out.println("num1 é diferente de num2? "+ simNão);

        simNão = num1 > num2;
        System.out.println( "num1 é maior que num2? " + simNão);

        simNão = num1 < num2;
        System.out.println("num1 é menor que num2? " + simNão);

        simNão = num1 >= num2;
        System.out.println("num1 é maior ou igual a num2? " + simNão);

        simNão = num1 <= num2;
        System.out.println("num1 é menor ou igual a num2? "+ simNão);

    }
}
 