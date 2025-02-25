public class OperadoresLogicos {
    public static void main(String[] args) {
        // && Operador lógico "E"
        // || Operador lógico "OU"
        boolean cond1 = true; 
        boolean cond2 = false; 

        if(cond1 && cond2){
            System.out.println("As duas condições são verdadeiras");
        }
        if (cond1 || (5 < 6)){
            System.out.println("Umas das condições é verdadeira");
        }
    }
}
