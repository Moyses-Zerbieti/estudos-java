public class CondicionalEncandeada {
    public static void main(String[] args) {
        int nota = 5; 

        if(nota >= 7){
            System.out.println("Aprovado");
        
        }else if(nota > 4 && nota < 7){
            System.out.println("Prova de Recuperação");
        
        }else{
            System.out.println("Reprovado");
        
        }
    }
}//Nesse tipo de condicional tem mais uma condição que precisa ser atendida para o código ser executado sem problemas
// Alem de if (SE) e else (SE NÃO) agora temos o else if (SE NÃO SE)
