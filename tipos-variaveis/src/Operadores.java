public class Operadores {
    public static void main(String[] args) {
        int num = 6;

        num = -num;//transforma um número que era positivo para negativo 
        System.out.println(num);

        num = num * -1;//transforma o número que era negativo em positivo de novo
        System.out.println(num);

        int numero = 5; 
        numero++; //é a mesma coisa que dizer numero +1
        numero--;// é a mesma coisa que dizer numero -1 
            
        System.out.println(++ numero); //para imprimir o número da variavel ja com o incremento é colocar o "++" ou "--" antes na hora de imprimir

        boolean variavel = true;

        variavel = !variavel;// o sinal de exclamação "!" serve para inverter o valor boleano 
        System.out.println(variavel);


    }
}
