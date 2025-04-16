package ExemplosGenerics.Set;
import java.util.HashSet;
import java.util.Set;

public class ExemploSet {
    public static void main(String[] args) {

        //Exemplo sem generics
        Set conjuntoSemGenerics = new HashSet();
        conjuntoSemGenerics.add("Elemento 1");
        conjuntoSemGenerics.add(13); //permite qualquer tipo de objeto

        //exemplo com generics
        Set <String> conjuntoGenerics = new HashSet<>();
        conjuntoGenerics.add("Tainar");
        conjuntoGenerics.add("Carvalho");

        for(String palavra : conjuntoGenerics){
            System.out.println(palavra);
        }
    }
}
