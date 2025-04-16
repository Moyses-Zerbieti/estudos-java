package ExemplosGenerics.Map;
import java.util.HashMap;
import java.util.Map;

public class ExemploMap {
    public static void main(String[] args) {
        //exemplo sem generics
        Map mapaSemGenerics = new HashMap();
        mapaSemGenerics.put("Chave 1", "10");
        mapaSemGenerics.put("Chave 2", "bicicleta"); //permite adicionar qualquer objeto

        //Exemplo com Generics
        Map <Integer, String>  mapaGenerics = new HashMap<>();
        mapaGenerics.put(1,"Teclado");
        mapaGenerics.put( 2, "Mouse");

        //iterando com Generics
        for(Map.Entry<Integer, String> entry : mapaGenerics.entrySet()){
            Integer chave = entry.getKey();
            String elemento = entry.getValue();
            System.out.println("Chave " + chave + ", Elemento: " + elemento);
        }
    }

}
