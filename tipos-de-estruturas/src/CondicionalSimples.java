public class CondicionalSimples {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 17;

        if (valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;

            System.out.println(saldo);
        }
    }
}//Nesse método é utilizado uma condicional simples (if) sendo ela verdadeira o restante do código é executado

