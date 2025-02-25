package estudo.moyses.primeirasemana;

public class BoletimEstudantil {
    public static void main(String[] args) {
        int mediaFinal = 3; 

        if(mediaFinal < 6){
            System.out.println("Reprovado");

        }else if (mediaFinal ==6){
            System.out.println("Prova Recuperação");

        }else{
            System.out.println("Aprovado");
        }
    }
}
  