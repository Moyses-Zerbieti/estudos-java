public class SwitchCase {
    public static void main(String[] args) {
        String sigla = "M";
        
        switch (sigla){
            case "P":{
                System.out.println("PEQUENO");
                break;
            }
            case "M":{
                System.out.println("MÉDIO");
                break;
            }
            case "G":{
                System.out.println("GRANDE");
                break;
            }
            default:{
                System.out.println("INDEFINIDO");
            }
        }  
    }
}
//Esse tipo de código é bem vindo quando na condicional encandeada se torna muito extensa e poluída
//Deixa mais limpo e legível 

